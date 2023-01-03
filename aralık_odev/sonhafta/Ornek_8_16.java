/*
 Klavyeden girilen n*n tipindeki A matrisinin sondan bir önceki satır ve sütunundaki elemanların toplamını hesaplayan program
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ornek_8_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                  System.out.println(i+1 + ". satır   " + (j+1) + ". sütun");
                A[i][j] = input.nextInt();
            }
        }
        int toplam = 0;
        for (int i = 0; i < n-1 ; i++) 
        {
            toplam += A[i][n - 1] + A[n - 1][i];
        }
        System.out.println(Arrays.deepToString(A));
        System.out.println("Toplam: " + (toplam - A[n - 1][n - 1]));
    }

}
