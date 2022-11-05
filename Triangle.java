


/*

 */

/**
 *
 * 
 */
import java.util.Scanner;
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 integer values for the sides of a triangle");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a==b && a==c)  
        {
            System.out.println("It is equilateral triangle.");   
        } 
        if (a!=b && a!=c && b!=c)  
        {
            System.out.println("It is a scalene triangle.");
        }
        else if  (a==b && a!=c || a==c && a!=b || b==c && b!=a) 
        {
            System.out.println("It is isosceles triangle.");
        } 
    }
    
}
