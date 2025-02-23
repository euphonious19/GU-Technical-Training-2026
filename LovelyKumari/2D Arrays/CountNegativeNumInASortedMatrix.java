import java.util.Scanner;

public class CountNegativeNumInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;

        int row=m-1;
        int col=0;

        while(row>=0 && col<n){
            if(grid[row][col] < 0){
                count += (n-col);
                row-- ; //Move to the previous row
            } else{
                col++ ; //Move to the next column
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows(m) :");
        int m=sc.nextInt();
        System.out.println("Enter no. columns(n) :");
        int n=sc.nextInt();

        int[][] grid=new int[m][n];

        System.out.println("Enter matrix's elements(Row wise): ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j]=sc.nextInt();
            }
        }
        CountNegativeNumInASortedMatrix obj=new CountNegativeNumInASortedMatrix();
        int answer=obj.countNegatives(grid);

        System.out.println("Output: " + answer);
    }
    
}
