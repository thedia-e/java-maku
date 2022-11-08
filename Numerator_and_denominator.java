/*
Klavyeden girilen pay ve payda değerlerine göre ilgili bölümün,
belirtilen basamağının değerini hesaplayan program.
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class Numerator_and_denominator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b, x, i ;
     
        System.out.println("Please enter the numerator");
        a = input.nextInt();
        System.out.println("Please enter the denominator");
        b = input.nextInt();
        System.out.println("Please enter a digit value");
        x = input.nextInt();
      
        for ( i = 1; i <=x; i++) {
          
           a = 10*a ;
           i = (int) (a/b) ;
           a = a%b ;
                   
        }
        System.out.println(i);
     }
        
    
}
