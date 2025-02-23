import java.util.Scanner;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n=matrix[0].length;

        int col0=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(matrix[i][j] == 0){
                    //mark the ith row
                    matrix[i][0]=0;
                    //mark the jth col
                    if(j !=0) {
                        matrix[0][j]=0;
                    } else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] != 0){
                    //check for col and row
                    if(matrix[0][j]==0 || matrix[i][0] ==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j=0; j<n; j++) matrix[0][j]=0;
        }
        if(col0==0){
            for(int i=0; i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows[m] : ");
        int m=sc.nextInt();
        System.out.println("Enter the no. of cols[n]: ");
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        System.out.println("Enter matrix's elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        setZeroes(matrix);
        System.out.println("Output: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
