import java.util.*;
import java.util.ArrayList;
import java.util.List;

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
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of rows(m): ");
        int m=sc.nextInt();
        System.out.println("Enter the no. of cols(n): ");
        int n=sc.nextInt();

        int[][] matrix=new int[m][n];
        System.out.println("Enter the matrix's elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        SpiralMatrix obj=new SpiralMatrix();
        List<Integer> answer=obj.spiralOrder(matrix);

        System.out.println("Output: " + answer);  
    } 
}
