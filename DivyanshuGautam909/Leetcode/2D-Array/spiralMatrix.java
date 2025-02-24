import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int r1 = 0;
        int c1 = 0;
        int r2 = matrix.length - 1;
        int c2 = matrix[0].length - 1;
        List<Integer> answer = new ArrayList<>();

        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                answer.add(matrix[r1][c]);
            }
            for (int r = r1 + 1; r <= r2; r++) {
                answer.add(matrix[r][c2]);
            }
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c >= c1; c--) {
                    answer.add(matrix[r2][c]);
                }
                for (int r = r2 - 1; r > r1; r--) {
                    answer.add(matrix[r][c1]);
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return answer;
    }
}

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        List<Integer> result = solution.spiralOrder(matrix);

        System.out.println("Spiral Order: " + result);

        scanner.close();
    }
}
