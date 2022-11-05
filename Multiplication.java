/*
 
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Please enter an integer: ");
        int number1 = scan.nextInt();
        System.out.print("Please enter an integer:");
        int number2 = scan.nextInt();
        
        for(int i = 0; i < number2; i++)
        {
            total += number1;
        }
        System.out.println(number1 + "X" + number2 + "= " + total);
    }
    }
    

