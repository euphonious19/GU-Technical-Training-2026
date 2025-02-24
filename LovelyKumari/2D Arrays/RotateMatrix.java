import java.util.*;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //transpose
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of n x n matrix : ");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter matrix's elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix: " );
        for(int[] ans:matrix){
            for(int ele:ans){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        RotateMatrix obj=new RotateMatrix();
        obj.rotate(matrix);
        System.out.println("Output: ");
        for(int[] ans:matrix){
            for(int ele:ans){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));
    } 
}
