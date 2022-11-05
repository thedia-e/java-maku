
import java.util.Scanner;
public class Divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in);
        System.out.println("Please enter an integer:");
            int a = input.nextInt();
        System.out.println("--------");
        System.out.println("Divisors:");
            for (int i = 1; i <=a; i++) 
        {
            if (a%i==0)
            {
        System.out.println(i);
            }
        }
        
    }
    
}
