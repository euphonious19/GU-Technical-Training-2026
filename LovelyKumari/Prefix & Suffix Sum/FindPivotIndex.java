import java.util.Scanner;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int n=nums.length ;
        int sum=nums[0];
        int [] prefixSum = new int[n];
        prefixSum[0]=0;

        for(int i=1; i<n;i++){
            sum = sum + nums[i];
            prefixSum[i] = prefixSum[i-1] + nums[i-1]; 
        }
        for(int i=0; i< n; i++){
            if(prefixSum[i] == sum - nums[i] - prefixSum[i]){
                return i;

            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the nums arr: ");
        int n=sc.nextInt();
        int[] nums=new int[n];

        System.out.println("Elements of the nums arr: ");
        for(int i=0; i<n ;i++){
            nums[i]=sc.nextInt();
        }
        int ans=pivotIndex(nums);

        System.out.println("Output: " + ans);

    }
    
}
