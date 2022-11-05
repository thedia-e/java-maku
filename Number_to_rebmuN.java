/*

 */

/**
 
 */
import java.util.Scanner;
public class Number_to_rebmuN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner (System.in );
        System.out.println("Please enter a  positive integer");
           int number = input.nextInt();
     
        System.out.print("The reverse writing of the number you entered = ");
           while(number != 0) 
        {
            
        System.out.print( number % 10 );
            number /= 10;
       
        }
    }
    
}
