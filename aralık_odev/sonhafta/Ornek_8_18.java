/*
 Klavyeden girilen n*n tipindeki A matrisinden alt üçgen B matrisini oluşturan program
 */

/**
 *
 * @author edaza
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ornek_8_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println(i + 1 + ". satır   " + (j + 1) + ". sütun");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("A dizisi: ");
        System.out.println(Arrays.deepToString(A));
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i < j) 
                {
                    B[i][j] = 0;
                }
                else 
                {
                    B[i][j] = A[i][j];
                }
            }
        }
        System.out.println("B dizisi: ");
        System.out.println(Arrays.deepToString(B));
    }
    
}
