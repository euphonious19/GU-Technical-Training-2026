import java.util.Scanner;

public class MaxScoreAfterSplittingString {
    public  static int maxScore(String s) {
        int n = s.length();
        int oneCount = 0;
        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }

        int leftZeroes = 0;
        int rightOnes = oneCount;

        for (int i = 0; i < n - 1; i++) {  // We stop before the last character
            if (s.charAt(i) == '0') {
                leftZeroes++;
            } else {
                rightOnes--;
            }

            int currentScore = leftZeroes + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary String: ");
        String s=sc.next();

        int ans=maxScore(s);
        System.out.println("Output: " + ans); 
    } 
}
