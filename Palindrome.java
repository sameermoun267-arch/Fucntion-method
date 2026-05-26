
import java.util.Scanner;

public class Palindrome {
    // write a function to check a number is plaindrome
    public static void plaindrome(int n){
        int original =n;
         int reverse=0;
           while (n>0){
        int digit= n%10;
        reverse= reverse*10+ digit;
        n=n/10;

    }
    if (original==reverse){
        System.out.println("the number "+ original+ " is plaindrome");
    }
    else {
        System.out.println("The number "+ original+" is  not plaindrome");
    }
    }
public static void main(String[] args) {
    System.out.println("Checking the plaindrome: ");
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
   plaindrome(n);
   sc.close();
 
}    
}
