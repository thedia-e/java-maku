

import java.util.Scanner;

public class Length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in)  ;
        System.out.println("Please enter length in meters");
        int x = input.nextInt() ;
        int decimeter  =  1  ;
        int centimeter =  2  ;
        int millimeter =  3  ;
        int kilometer  =  4  ;
        System.out.println("decimeter = 1") ;
        System.out.println("centimeter = 2");
        System.out.println("millimeter = 3");
        System.out.println("kilometer = 4") ;
        
        System.out.println("Please select one of the units");
        int n = input.nextInt();
          
       if (n == 1)  {
           x = 10*x ;
       }
       if (n == 2)  {
           x = 100*x  ;
       }
       if (n == 3)  {
           x = x*1000 ;
       } if (n == 4)  {
           x = x/1000  ;
       }
        System.out.println(x);  
        
    }
    
}
