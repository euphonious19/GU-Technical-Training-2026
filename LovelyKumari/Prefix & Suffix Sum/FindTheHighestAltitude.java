import java.util.Scanner;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAlt=0;
        int currAlt=0;

        for(int value: gain){
            currAlt += value ;
            maxAlt= Math.max(maxAlt,currAlt);
        }
        return maxAlt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of gain array:  ");
        int n=sc.nextInt();

        int[] gain=new int[n];

        System.out.println("Enter the elements of gain array: ");
        for(int i=0; i<n; i++){
            gain[i]=sc.nextInt();

        }
        FindTheHighestAltitude obj=new FindTheHighestAltitude();
        int ans=obj.largestAltitude(gain);

        System.out.println("Output: " + ans);
    }
}
