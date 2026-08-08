class Solution {
    List<String> list = new ArrayList<>();
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> letterCombinations(String digits) {
        
        solve("",digits);
        return list;
    }

    void solve (String p , String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int index = up.charAt(0)-'0';
        for(int i = 0;i<map[index].length(); i++){
            
            solve(p + map[index].charAt(i), up.substring(1));

        }
        

    }
}