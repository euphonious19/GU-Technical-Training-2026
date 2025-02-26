import java.util.Scanner;

public class MinValToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int min=1 ;
        int prefixSum = 0;
        for(int num : nums){
            prefixSum += num;
            min = Math.min(min , prefixSum);
        }
        return min> 0 ? min : Math.abs(min)+1 ;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array: ");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the elements of the nums array: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        MinValToGetPositiveStepByStepSum obj=new MinValToGetPositiveStepByStepSum();
        int ans=obj.minStartValue(nums);

        System.out.println("Output : " + ans);
    }
}