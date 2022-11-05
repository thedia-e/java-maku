/*


 */

/**
 *

 */
import java.util.Scanner;
public class positive_negative_or_zero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an integer:");
        int x = input.nextInt();
        if (x>0)
        {
            System.out.println("This number is positive.");
        }
       else if (x<0)
        {
            System.out.println("This number is negative.");
        }
        else 
        {
            System.out.println("This number is equal to zero.");
        }
    }
    
}
