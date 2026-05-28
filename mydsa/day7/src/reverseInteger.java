// LC 7 — Reverse Integer
// https://leetcode.com/problems/reverse-integer/

public class reverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));   // expected: 321
        System.out.println(reverse(-123));  // expected: -321
        System.out.println(reverse(120));   // expected: 21
        System.out.println(reverse(1534236469)); // expected: 0 (overflow)
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            // overflow check before multiplying
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + rem;
        }
        return rev;
    }
}