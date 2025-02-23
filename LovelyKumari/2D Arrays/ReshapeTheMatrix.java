import java.util.Scanner;
import java.util.*;

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;

        if(m*n != r*c) return mat;
        int row=0;
        int col=0;

        int[][] ans=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(col==n) {
                    row++;
                    col=0;
                }
                ans[i][j]=mat[row][col];
                col++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows(mat -> m): ");
        int m=sc.nextInt();
        System.out.println("Enter no. of cols(mat-> n): ");
        int n=sc.nextInt();

        int[][] mat=new int[m][n];

        System.out.println("Enter elements of matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no. of row of reshaped matrix(r) : ");
        int r=sc.nextInt();
        System.out.println(("Enter no. of cols of reshapped matrix(c): "));
        int c=sc.nextInt();

        ReshapeTheMatrix obj=new ReshapeTheMatrix();
        int[][] ans=obj.matrixReshape(mat, r, c);

        System.out.println("Output: ");
        System.out.println(Arrays.deepToString(ans));
    }
}
