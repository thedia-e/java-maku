

/**
 *
 * 
 */
import java.util.Scanner;
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int x,fx ;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an integer");
        x = input.nextInt();
        fx = x*x-5*x+3 ;
        System.out.println("Result of this function is: "  +fx);
        if (fx<0)
        {
            System.out.println("This function is negative.");
        }
        if (fx>0)
        {
            System.out.println("This function is positive.");
        }
        if (fx==0)
        {
            System.out.println("This function is equal to zero.");
        }
    }
    
}
