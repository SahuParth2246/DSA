class Solution {
    public long sumAndMultiply(int n) {
        List<Integer> digits = new ArrayList<>();
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            if (d != 0) digits.add(d);
            temp /= 10;
        }
        Collections.reverse(digits);
        
        long x = 0, sum = 0;
        for (int d : digits) {
            x = x * 10 + d;
            sum += d;
        }
        
        return x * sum;
    }
}