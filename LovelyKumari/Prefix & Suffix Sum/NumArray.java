import java.util.Scanner;

class NumArray { // Range sum query-Immutable
    int nums[];

    public NumArray(int[] nums) { //constructor
       this.nums=nums;
       for(int i=1; i<nums.length; i++){
        nums[i]=nums[i]+nums[i-1];
       }  
    }
    
    public int sumRange(int left, int right) {
        return left == 0 ? nums[right] : nums[right] - nums[left-1];
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] NumArr=new int[n];
        System.out.println("Elements of nums arr: ");
        for(int i=0; i<n; i++){
            NumArr[i]=sc.nextInt();
        }

        NumArray obj=new NumArray(NumArr);
        System.out.println("Enter the no. of range queries: ");
        int queries=sc.nextInt();

        for(int q=0; q<queries; q++){
            System.out.println("Enter the left and right indices for range query: ");
            int left=sc.nextInt();
            int right=sc.nextInt();

            int sum=obj.sumRange(left, right);
            System.out.println("Sum from [left , right] : " + sum);
        }

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */