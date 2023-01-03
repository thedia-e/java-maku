/*
 Klavyeden girilen n*n tipindeki A matrisinin simetrik olup olmadığını kontrol eden program
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;

public class Ornek_8_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("n");
        n = input.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println((i + 1) + ". satır   " + (j + 1) + ". sütun");
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (A[i][j] != A[j][i]) 
                {
                    System.out.println("simetrik değil");
                    return;
                }

            }
        }
        System.out.println("simetrik");
    }
}
