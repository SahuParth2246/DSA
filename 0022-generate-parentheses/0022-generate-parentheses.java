class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        solve("", 0, 0, n, list);

        return list;
    }
    public void solve(String p, int open, int close, int n, List<String> list) {

        if(p.length() == 2 * n) {
            list.add(p);
            return;
        }
        if(open < n) {
            solve(p + "(", open + 1, close, n, list);
        }
        if(close < open) {
            solve(p + ")", open, close + 1, n, list);
        }
    }
}