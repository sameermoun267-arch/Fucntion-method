import java.util.Scanner;
//Addition of two numbers in Java using method
public class Product{
    public static int sum_two_no(int a, int b){
        return  a*b;
    }
    public static void main(String[] args) {
        System.out.println("Enter the product of two no: ");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a= sc.nextInt();
        System.out.print("Enter the second no: ");
        int b= sc.nextInt();

        int result=sum_two_no(a, b);
        System.out.println("The prouct of "+ a +"and "+b +" is :"+ result);
        sc.close();
    }
}