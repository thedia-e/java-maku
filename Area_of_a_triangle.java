/*
kullanıcıdan kenar uzunluğu ve o kenara ait yüksekliği girilen üçgenin alanı
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Area_of_a_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Please enter a number value for the side of this triangle");
        int x = input.nextInt();
        System.out.println("Please enter a number for the height value of that side");
        int h = input.nextInt();
        int area = (h*x)/2 ;
        System.out.println("Area of this triangle is : " +area);
        
    }
    
}
