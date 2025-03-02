import java.util.Scanner;

public class QuickSort {
    public static void swap(int[] arr , int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr , int low , int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i] <= pivot && i<= high-1) {
                i++ ;
            }
            while (arr[j] > pivot && j>=low+1) {
                j--;
            }
            if(i<j){
                swap(arr , i , j);
            }
        }
        swap(arr , low , j);
        return j;
    }
    public static void qs(int[] arr , int low , int high){
        if(low <high){
            int partitionIdx=partition(arr,low , high);
            qs(arr,low, partitionIdx-1);
            qs(arr, partitionIdx+1, high);
        }

    }
    public static void quickSort(int arr[]){
        qs(arr, 0, arr.length-1);
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
        quickSort(arr);
        System.out.print("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
