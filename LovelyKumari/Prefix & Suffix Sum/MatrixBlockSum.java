import java.util.*;
public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] answer = new int[m][n];
        int[][] prefixSum = new int[m + 1][n + 1];
    
        //PrefixSum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefixSum[i + 1][j + 1] = mat[i][j] + prefixSum[i][j + 1] + prefixSum[i + 1][j] - prefixSum[i][j];
            }
        }
    
        //For each cell block sum calc
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {//Boundaries 
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);
    
                answer[i][j] = prefixSum[r2 + 1][c2 + 1] - prefixSum[r1][c2 + 1] - prefixSum[r2 + 1][c1] + prefixSum[r1][c1];
            }
        }
        return answer;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix :  ");
        System.out.println("Enter rows(m) : ");
        int m=sc.nextInt();
        System.out.println("Enter cols(n): ");
        int n=sc.nextInt();

        int[][] mat=new int[m][n];
        System.out.println("Enter elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter block size(k): ");
        int k=sc.nextInt();

        MatrixBlockSum obj=new MatrixBlockSum();
        int[][] result=obj.matrixBlockSum(mat , k);
        System.out.println("Output: " + Arrays.deepToString(result));
        

      
}