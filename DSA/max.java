package DSA;

import java.util.Arrays;

class max {
    public static int deleteGreatestValue(int[][] grid) {
        for (int[] elements : grid) {
            Arrays.sort(elements);
        }

        int res = 0;
        for(int column=0; column<grid[0].length; column++){
            int max = 0;
            for(int row=0; row<grid.length; row++) {
                max = Math.max(max, grid[row][column]);
            }
            res += max;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,4},{1,3,3}};
        System.out.println(deleteGreatestValue(grid));
    }
}