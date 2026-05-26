
import java.util.Scanner;

public class Sum_natural {
    //Program for sum of n natural numbers
    public static int sum(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        return  total;
    }
    public static void main(String[] args) {
        System.out.println("Sum of natural no");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n= sc.nextInt();
        int result= sum(n) ;
        System.out.println("The sum of natural no up to "+ n+" = "+result   );
        sc.close();
        
    }
}
