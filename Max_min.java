
import java.util.Scanner;

//Write a Program to find the Maximum and Minimum of the Given Three Numbers
public class Max_min {
     public static int max(int a,int b, int c){
      
        if (a>b && a>c){
            return  a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {   
            return c;
        }
         


     }
     public static int min (int a, int b ,int c){
     
        if (a<b && a<c){
            return  a;
            
        }
        else if(b<a && b<c){
            return  b;
        }
        else {
            return  c;
        }
     

     }
    public static void main(String[] args) {
           Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a= sc.nextInt();

        System.out.print("Enter the second no: ");
        int b= sc.nextInt();
        System.out.print("Enter the third no: ");
        int c= sc.nextInt();
        int minimum= min(a,b, c);
        System.out.println("The smallest value :"+minimum);
        int maximum=max(a,b,c);
        System.out.println("the maximum value : "+maximum);
        sc.close();

        
    }
  
}
