import java.util.Scanner;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        // sum of both the diagonals (left and right)
        for(int i=0; i< n ; i++ ){
            sum += mat[i][i] ; //Primary Diagonal
            sum += mat[i][n-i-1]; //Secondary Diagonal
        }
        // if matrix is odd -> subtract the duplicate  element [as it's counted twice]

        if(n%2 != 0){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter soze of matrix n*n :");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Matrix size must be >= 0  ");
            return;
        }
        int[][] matrix=new int[n][n];
        System.out.println("Enter matrix's elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int answer=diagonalSum(matrix);
        System.out.println("Output: "+ answer);
    }
}
