/*
 
 */

/**
 *
 * 
 */
import java.util.Scanner;
public class Odd_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Please enter an integer:");
        int n = input.nextInt();
        int t = 0 ;
        for (int i = 1; i <=n; i+=2) 
        {
            System.out.println("Numbers:" +i); 
            t = i+t ;
        }
        System.out.println("Total:" +t);
        
    }
    
}
