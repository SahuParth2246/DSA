class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)return 0;
        int i = 0;
        int ans = 0;
        boolean flag = true;
        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i == s.length()) return 0;
        if(s.charAt(i)=='-'){
            flag=false;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if (ans > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10){
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans *10 + (int)(s.charAt(i)-'0');
            i++;
        }
        if(!flag)ans=-ans;
        return ans;
    }
}