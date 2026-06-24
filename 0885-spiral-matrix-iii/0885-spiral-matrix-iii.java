class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        ArrayList<int[]> list = new ArrayList<>();
        int r = rStart, c = cStart;
        int step = 1;

        list.add(new int[]{r, c});

        while (list.size() < rows * cols) {
            for (int i = 0; i < step; i++) { c++; if (r>=0&&r<rows&&c>=0&&c<cols) list.add(new int[]{r,c}); }
            for (int i = 0; i < step; i++) { r++; if (r>=0&&r<rows&&c>=0&&c<cols) list.add(new int[]{r,c}); }
            step++;
            for (int i = 0; i < step; i++) { c--; if (r>=0&&r<rows&&c>=0&&c<cols) list.add(new int[]{r,c}); }
            for (int i = 0; i < step; i++) { r--; if (r>=0&&r<rows&&c>=0&&c<cols) list.add(new int[]{r,c}); }
            step++;
        }

        return list.toArray(new int[list.size()][]);
    }
}