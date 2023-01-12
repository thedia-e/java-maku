/*
Dışarıdan alınan n değerine göre yıldızlarla üçgen oluşturma.
 */
package methododevocakilkhafta;

/**
 *
 * @author edaza
 */
import java.util.Scanner;

public class Alti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        stars();
    }

    public static void stars() 
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) 
        {

            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
