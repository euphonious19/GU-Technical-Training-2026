import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int [] arr , int n){
        int k=findMax(arr); // k=key (Maximum value)
        int[] count=new int[k+1];
        int[] ans=new int[n];

        //Freq
        for(int i=0; i<n; i++){
            count[arr[i]]++ ;
        }

        //cumulative count
        for(int i=1; i<=k; i++){
            count[i] += count[i-1];
        }

        //place elements in sorted order
        for(int i=n-1; i>=0; i--){
            ans[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        //copy sorted array back to original array
        for(int i=0; i<n; i++){
            arr[i]=ans[i];
        }
    }

    public static int findMax(int[] arr){
        int k=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > k){
                k=arr[i];
            }
        }
        return k;
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
        countingSort(arr , n);
        System.out.print("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
