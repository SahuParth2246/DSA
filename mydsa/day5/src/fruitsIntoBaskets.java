import java.util.HashMap;

public class fruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        int k = 2;
        int low = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int high = 0; high < fruits.length; high++) {
            int rightfruit = fruits[high];
            map.put(rightfruit, map.getOrDefault(rightfruit, 0) + 1);

            while (map.size() > k) {
                int leftChar = fruits[low];
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                low++;
            }

            if (map.size() <= k) {
                int len = high - low + 1;
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}