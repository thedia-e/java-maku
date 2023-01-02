
/*
Klavyeden girilen n*n tipindeki A matrisinin her bir sütun elemanları çarpımından B dizisini oluşturan program
 */
/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ornek_8_21 {

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
        int[] B = new int[n];
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
            B[i] = 1;
            for (int j = 0; j < n; j++) 
            {
                B[i] *= A[i][j];
            }
        }
        System.out.println("B dizisi: ");
        System.out.println(Arrays.toString(B));

    }
}
