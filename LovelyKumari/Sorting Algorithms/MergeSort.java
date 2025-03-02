import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int low , int mid , int high){
        ArrayList<Integer> temp=new ArrayList<>();
        // low.. mid
        //mid+1.. high
        int left=low;
        int right=mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;  
            } else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mS(int[] arr, int low , int high){
        if(low >= high) return ;
        int mid=(low+high)/2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        merge(arr , low , mid, high);
    }
    public static void mergeSort(int[] arr , int n){
        mS(arr, 0, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter " + n + " elements: " );
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr , n);
        System.out.print("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
