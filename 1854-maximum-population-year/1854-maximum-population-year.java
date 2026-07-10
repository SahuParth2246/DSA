class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101]; // 1950 to 2050

        for (int[] log : logs) {
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }

        int maxPop = 0, year = 1950;
        int curr = 0;
        for (int i = 0; i < 101; i++) {
            curr += diff[i];
            if (curr > maxPop) {
                maxPop = curr;
                year = 1950 + i;
            }
        }

        return year;
    }
}