import java.util.Scanner;

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's size(n) : ");
        int n=sc.nextInt();

        System.out.println("nums =");
        int[] nums=new int[n];

        System.out.println("Enter array's elements: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }

        RunningSumOf1DArray obj=new RunningSumOf1DArray();
        int[] ans=obj.runningSum(nums);

        System.out.println("Output: ");
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]);
            if(i<n-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    
}
