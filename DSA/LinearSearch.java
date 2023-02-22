package DSA;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,5,6};
        int[][] arr2D = {
                {25,1,9,5,6},
                {2,51,19,5,6}
        };
        int target = 9;
        int search1D = search1D(arr,target);
        int[] search2D = search2D(arr2D,target);
        System.out.println(search1D);
        System.out.println(Arrays.toString(search2D));
    }
    static int search1D(int[] arr,int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int[] search2D(int[][] arr,int target){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < arr[0].length ; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
