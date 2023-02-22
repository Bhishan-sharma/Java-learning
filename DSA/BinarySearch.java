package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10,20,30,140,200};
        int target = 3;
        int search = search(arr,target);
        if (search == -1) System.out.println("Target is not present in the array!!!!");
        else System.out.println("Target found at : "+search);
    }
    static int search(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < mid){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}