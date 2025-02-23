import java.util.Scanner;

public class Convert1DInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n){ // Can we convert 1D to 2D array?
            return new int[0][0]; //if not return , empty 2D array
        }

        int[][] answer=new int[m][n];
        for(int i=0; i<original.length; i++){
           // int row = i / n ;
            // int col = i % n ;
            answer[i/n][i%n] = original[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter original array's length: ");
        int len=sc.nextInt();
        int[] original=new int[len];

        System.out.println("Enter original' array elements: ");
        for(int i=0; i<len; i++){
            original[i]=sc.nextInt();
        }

        System.out.println("Enter no. of rows(m) : ");
        int m=sc.nextInt();
        System.out.println("Enter the no.. of col(n): ");
        int n=sc.nextInt();

        Convert1DInto2DArray obj=new Convert1DInto2DArray();
        int[][] answer=obj.construct2DArray(original, m, n);

        System.out.println("Output: ");
        if(answer.length==0){
            System.out.println("[]");
        } else{
            for(int[] row: answer){
                for(int ans:row){
                    System.out.print(ans+" ");
                }
                System.out.println();
            }
        }
    } 
}
