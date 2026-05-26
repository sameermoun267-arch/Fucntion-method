
import java.util.Arrays;
import java.util.Scanner;

public class Prime_no {
    public static void prime_in_range(int start,int end){
        boolean prime[]= new boolean[end+1];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]= false;
        for(int i=2;i<=Math.sqrt(end);i++){
            if(prime[i]){
                for(int j=i*i;j<=end;j+=i){
                   prime[j]=false; 
                }
            }
        }
        System.out.println("prime no between the given range:");
        for(int i=start;i<=end;i++){
           if(prime[i]){
             System.out.print(i+ " ");
           }
        }
       
    }
     public static void main(String args[]){
        System.out.print("Enter the starting value: ");
        Scanner sc= new Scanner(System.in);
        int start= sc.nextInt();
        System.out.print("Enter the ending value: ");
        int end= sc.nextInt();
        prime_in_range(start, end);
        sc.close();
     }
}