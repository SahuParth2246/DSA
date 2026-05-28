// LC 1052 — Grumpy Bookstore Owner
// https://leetcode.com/problems/grumpy-bookstore-owner/

public class grumpyBookstoreOwner {
    public static void main(String[] args) {
        int[] customers1 = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy1 = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(maxSatisfied(customers1, grumpy1, 3)); // expected: 16

        int[] customers2 = {1};
        int[] grumpy2 = {0};
        System.out.println(maxSatisfied(customers2, grumpy2, 1)); // expected: 1
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int k) {
        // base: all customers where grumpy[i] == 0, always satisfied
        int base = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        // initial window: count grumpy[i] == 1 customers in first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (grumpy[i] == 1) sum += customers[i];
        }
        int res = sum;

        // slide window, track max saveable grumpy customers
        for (int low = 1; low < customers.length - k + 1; low++) {
            int high = low + k - 1;
            if (grumpy[high] == 1) sum += customers[high];
            if (grumpy[low - 1] == 1) sum -= customers[low - 1];
            res = Math.max(sum, res);
        }

        return res + base;
    }
}