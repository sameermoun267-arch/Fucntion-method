import java.util.Scanner;

public class Even_odd {
    //Java Program to Check if a Given Integer is Odd or Even
    public static boolean  odd(int a){
        return a%2!=0;
    }
  
    public static void main(String[] args) {
        System.out.println("To check the no is even or odd");
       Scanner sc= new  Scanner(System.in);
System.out.print("Enter the no: ");
int a= sc.nextInt();
boolean message= odd(a);
if(message == true){
    System.out.print(a+" is an odd no");
    

}
else {
        System.out.println(a+" is an even no");
    }
    sc.close();    
    }
}
