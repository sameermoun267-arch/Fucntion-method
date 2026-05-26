
import java.util.Scanner;

public class Grade_calculator {
    //Java Program to Calculate Grade of Students
// Here is a Java Program to find the grade of a student, given the marks of N subjects. Given the marks of N subjects, we have to print the grade of a student based on the following grade slab.

// If Percentage Marks > 90, Grade is A+
// If 70 <= Percentage Marks <= 89, Grade is Ato
// If 60 <= Percentage Marks <= 69, Grade is B
// If 50 <= Percentage Marks <= 59, Grade is C
// If Percentage Marks <= 40, Grade is D
public static String gradecalclator(double precentage){
    int gradecategroy= (int) precentage/10;
  
     return  switch (gradecategroy){
        case 10,9 ->   "A+";
        case 8 ->   "A";
        case 7 ->   "B";
        case 6 ->   "C";
        case 5 ->   "D";
        default ->  "F";
    };
}

    public static void main(String[] args) {
        System.out.println("Grade calculator:");
        System.out.print("Enter the no of subject: ");
        Scanner sc =new Scanner(System.in);
        int count= sc.nextInt();
        int toatlmarks=0;
        
        for(int i=1;i<=count;i++){
            System.out.println("Enter the marks of "+i+ " subject:");
            int makrs= sc.nextInt();
            toatlmarks=toatlmarks+makrs;
        }
        System.out.println("Total marks: "+toatlmarks);
        double percentage = (double) toatlmarks/count;
         String grade= gradecalclator(percentage);
         System.out.println("The grade is :"+ grade);
         sc.close();
    }
}
