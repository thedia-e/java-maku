
/*
Klavyeden girilen n*n tipindeki A matrisinin yedek köşegeninin üstünde kalan elemanların toplamını hesaplayan program
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ornek_8_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        int n = input.nextInt();
        int[][] A = new int[n][n];   //dizi tanımlandı
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println((i + 1) + ". satır   " + (j + 1) + ". sütun");
                A[i][j] = input.nextInt();  //dizi elemanları alındı
            }
        }
        int toplam = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i + j < n + 1) 
                {
                    toplam += A[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(A));
        System.out.println("Toplam: " + toplam);
    }
}
