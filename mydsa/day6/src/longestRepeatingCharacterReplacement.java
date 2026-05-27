import java.util.HashMap;

public class longestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABBB";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightchar = s.charAt(right);
            map.put(rightchar, map.getOrDefault(rightchar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(rightchar));

            if ((right - low + 1) - maxFreq > k) {
                char leftchar = s.charAt(low);
                map.put(leftchar, map.get(leftchar) - 1);
                if (map.get(leftchar) == 0) {
                    map.remove(leftchar);
                }
                low++;
            }

            res = Math.max(res, right - low + 1);
        }
        return res;
    }
}