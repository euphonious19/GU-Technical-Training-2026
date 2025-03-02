import java.util.Scanner;

public class BinarySearchIterative {
    public static int iterativeBinarySearch(int[] arr, int n ,int target){
        int low=0;
        int high=n-1;

        while(low <= high){
            int mid=(low+high)/2; 

            if(arr[mid]==target) {
                return mid;
            }
            else if(target > arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array(n): ");
        int n=sc.nextInt();

        System.out.println("target: ");
        int target=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter array's elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Output: " + iterativeBinarySearch(arr, n, target));   
    }   
}
