
import java.util.Scanner;

public class Voter {
    //A person can votes if age is greater than or equal to 18.
    public  static void canvote(int a){
        if (a>=18){
            System.out.println("Person can vote");

        }
        else{
            System.out.println("Person can't vote");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int a= sc.nextInt();
        canvote(a);
        sc.close();
         
     }
}
