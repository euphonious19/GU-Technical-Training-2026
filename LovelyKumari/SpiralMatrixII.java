import java.util.*;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        if(n==0){
            return new int[0][0];
        }
        
        int[][] matrix=new int[n][n];

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;

        int count=1;

        while( top <= bottom && left <= right){
            //traverse top row (left -> right)
            for(int i=left; i<=right; i++){
                matrix[top][i]=count++;
            }
            top++ ; // top move down

            //traverse from (top -> bottom)
            for(int i=top; i<=bottom; i++){
                matrix[i][right]=count++;
            }
            right-- ;

            if(top <= bottom){
                //traverse from(right -> left)
                for(int i=right ; i>=left; i--){
                    matrix[bottom][i]=count++;
                }
                bottom--;
            }
            if(left <= right){
                //traverse from(bottom -> top)
                for(int i=bottom; i >= top; i--){
                   matrix[i][left]=count++;
                }
                left++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix's size (n): ");
        int n=sc.nextInt();

        SpiralMatrixII obj=new SpiralMatrixII();
        int[][] answer=obj.generateMatrix(n);

        System.out.println("Output: " + Arrays.deepToString(answer));
    }

}