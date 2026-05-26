
import java.util.Scanner;

public class Factorial {
    // factorial of a number
    public static int fact(int n){
        if (n==1 || n==0){
            return  1;
        }
        int facti=1;
        for(int i=1;i<=n;i++){
            facti= facti*i;

        }
        return  facti;

    }
    public static void main(String[] args) {
        System.out.println("Factorial calculator: ");
        System.out.print("Enter the factorial: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int result=fact(n);
        System.out.println("The factorial of "+ n+" ="+ result);
        sc.close();
        
    }
}
