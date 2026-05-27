import java.util.HashMap;

public class LongestSubstringwithKUniques {
    public static void main(String[] args) {
        int k = 3;
        String s = "aabcbaccbacb";
        int low = 0;
        int high = 0;
        HashMap <Character,Integer> map = new HashMap<>();
        int ans = 0;

        for(high = 0; high < s.length(); high++){
            char rightChar = s.charAt(high);
            // add rightChar to map using getOrDefault
            map.put(rightChar,map.getOrDefault(rightChar,0)+1);

            while(map.size() > k){
                char leftChar = s.charAt(low);
                // decrease leftChar frequency
                // if frequency hits 0, remove from map
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                low++;
            }
            if (map.size()==k){
                int len = high-low+1;
                ans = Math.max(ans,len);


            }


            // update answer here
        }
        return ans;
    }
}
