/*
 Girilen sayının asal olup olmadığını yazdıran metot.
 */
package methododevocakilkhafta;

/**
 *
 * @author edaza
 */
import java.util.Scanner;

public class İki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı girin");
        int x = input.nextInt();
        prime(x);
    }

    public static void prime (int n) 
    {
        int s = 0 ;
        for (int i = 2 ; i<n ; i++)  
        {
            if (n % i == 0)   
        {
            s++ ;
        }
        }
            if (s==0)  
            {
                System.out.println("Asal");
            }
            else 
            {
            System.out.println("Asal sayi degildir");
            }
    }
}
