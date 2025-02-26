import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        List<Integer> ans=new ArrayList<>();

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;

        while( top <= bottom && left <= right){
            //traverse top row (left -> right)
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++ ; // top move down

            //traverse from (top -> bottom)
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right-- ;

            if(top <= bottom){
                //traverse from(right -> left)
                for(int i=right ; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                //traverse from(bottom -> top)
                for(int i=bottom; i >= top; i--){
                   ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the no. of cols: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        SpiralMatrix solution = new SpiralMatrix();
        List<Integer> ans = solution.spiralOrder(matrix);

        System.out.println("Output: " + ans);
    }
}