class Solution {
public:
    bool validPalindrome(string s) {
        int left = 0;
        int right = s.size()-1;
        while(left<right){
            if(s[left]!=s[right]){
                bool start = isPal(s, left+1, right);
                bool end = isPal(s, left, right-1);
                if(start||end)return true;
                else return false;
            }
            left++;
            right--;
        }
        return true;
    }
    bool isPal(const string& s, int l, int r){                              
        while(l<r){
            if(s[l]!=s[r])return false;
            l++;
            r--;
        }
        return true;
    }
};