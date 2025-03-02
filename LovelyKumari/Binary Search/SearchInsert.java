import java.util.Scanner;

public class SearchInsert {
    public static int binarySearch(int[] nums , int target){
        int low=0;
        int high=nums.length-1;

        while(low <= high){
            int mid=low + (high-low)/2;

            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums , target);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nums size: ");
        int n=sc.nextInt();

        System.out.println("target: ");
        int target=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter nums elements: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Output: " + searchInsert(nums, target));
    }  
}
