
import java.util.Scanner;

public class Isprime {
    // to check no is prime or not
    public static boolean isprime_no(int a){
        if (a<=1){
            return  false;
        }
      for(int i=2; i<=Math.sqrt(a);i++){
        if(a%i==0){
              return false;
        }
          
        }
        return  true;
    }
    public static void main(String args[]){
        System.out.println("To check the no is primme or not: ");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no: ");
        int a= sc.nextInt();
        boolean message= isprime_no(a);
        if (message==true){
            System.out.println(a+" is a prime no");

        }
        else{
            System.out.println(a+ " is not a prime no");
        }
        sc.close();
        

    }
}
