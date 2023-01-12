/*
 2 boyutlu bir dizinin elemanlarını alt sınırı ve üstü sınırı arasında rastgele sayı atayıp döndür.
 */
package methododevocakilkhafta;

/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Bes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Alt ve üst sınır girin");
        int lb = input.nextInt();
        int ub = input.nextInt();
        int[][] k = randomarray(lb, ub);
        System.out.println(Arrays.deepToString(k));
    }

    public static int[][] randomarray(int ub, int lb) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısı?");
        int n = input.nextInt();
        int[][] ar = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                ar[i][j] = (int) (lb + (ub - lb)) * rnd.nextInt();
            }
        }
        return ar;
    }
}
