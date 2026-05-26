
import java.util.Scanner;

public class Pythagorean_triplet {
    //A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    public static boolean triplet(int a ,int b,int c){
return (a * a + b * b == c * c) ||
               (a * a + c * c == b * b) ||
               (b * b + c * c == a * a);
    }
    public static void main(String[] args) {
        System.out.println("To check the Pythangorean triplet");
        System.out.println("Enter the first no: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter the second no: ");
        int b= sc.nextInt();
        System.out.println("Enter the third no: ");
        int c= sc.nextInt();
        boolean result=triplet(a, b, c);
        if (result==true){
            System.out.println("The numbers are pythangorean triplet: ");
        }
        else{
            System.out.println("The numbers are not pythangorean treiplet");
        }
        sc.close();
    }

}
