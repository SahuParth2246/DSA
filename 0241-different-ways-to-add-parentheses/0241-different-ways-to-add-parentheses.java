class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left  = diffWaysToCompute(s.substring(0, i));
                List<Integer> right = diffWaysToCompute(s.substring(i + 1));

                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') result.add(l+r);
                        if (c == '-') result.add(l-r);
                        if (c == '*') result.add(l*r);
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }
}