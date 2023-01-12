/*
1 den n’ e kadar olan sayıların kare toplamını yazdıran metot.
 */
package methododevocakilkhafta;

/**
 *
 * @author edaza
 */
import java.util.Scanner;
public class Bir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in) ;
        int n ;
        System.out.println("Sayı girin");
        n = input.nextInt();
        karetoplam(n) ;
    }
    public static void karetoplam (int x)  
    {
        int toplam = 0 ;
        for (int i = 0; i <= x; i++) 
        {
            toplam += i*i ;
        }
        System.out.println("1-n arasındaki sayıların kareleri toplamı (1 ve n dahil) :  " +toplam);
    }
}
