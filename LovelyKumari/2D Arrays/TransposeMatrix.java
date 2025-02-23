import java.util.*;

public class TransposeMatrix{
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;  
        int n = matrix[0].length; 

        int[][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {      
            for (int j = 0; j < n; j++) {  
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        TransposeMatrix obj = new TransposeMatrix();
        int[][] ans = obj.transpose(matrix);

        System.out.println("Output: ");
        System.out.println(Arrays.deepToString(ans));
    }


}