
import java.util.Scanner;

public class practicle1{
    public static void main(String[] args) {
        System.out.println("Enter Number to check given number is odd or even");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Given number is even: ");
        }else{
            System.out.println("Given number is odd: ");
        }
        sc.close();
    }    
}
