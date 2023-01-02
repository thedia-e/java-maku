/*
 Klavyeden girilen n*n tipindeki A matrisini her bir satır elemanlarını kendi aralarında küçükten büyüğe sıralayan program
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;
public class Ornek_8_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
         for (int[] B : A) {
            // Sort the row using a selection sort algorithm
            for (int i = 0; i < B.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < B.length; j++) {
                    if (B[j] < B[min]) {
                        min = j;
                    }
                }
                int temp = B[i];
                B[i] = B[min];
                B[min] = temp;
            }
        }

        // Print the sorted matrix
        for (int[] B : A) {
            for (int value : B) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
}
