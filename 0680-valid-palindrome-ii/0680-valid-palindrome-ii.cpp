class Solution {
public:
    bool validPalindrome(string s) {
        int left = 0;
        int right = s.size()-1;
        int k = 1;
        while(left<right){
            if(s[left]!=s[right]){
                if(k>0){
                    string a = s; a.erase(left, 1);    
                    string b = s; b.erase(right, 1);   
                    bool start = ispal(a);
                    bool end = ispal(b);
                    if(start||end)return true;
                    else return false;
                }
                else return false;
                k--;
            }
            left++;
            right--;
        }
        return true;
    }
    bool ispal(string &s){                              
        int left = 0;
        int right = s.size()-1;
        while(left<right){
            if(s[left]!=s[right])return false;
            left++;
            right--;
        }
        return true;
    }
};