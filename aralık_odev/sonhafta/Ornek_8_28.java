/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ornek_8_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println((i + 1) + ". satır   " + (j + 1) + ". sütun");
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int yillikkar = 0;
            for (int j = 0; j < 12; j++) {
                yillikkar += A[i][j];
            }
            yillikkar /= 12;
            System.out.println(i + ". şirketin yıllık karı " + yillikkar);
        }
        for (int i = 0; i < n; i++) {
            int maxkar = A[i][1], maxkaray = 1, minkar = A[i][1], minkaray = 1;
            for (int j = 2; j < 12; j++) {
                if (A[i][j] < minkar) {
                    minkar = A[i][j];
                    minkaray = j;
                }
                if (A[i][j] > maxkar) {
                    maxkar = A[i][j];
                    maxkaray = j;
                }
            }
            System.out.println(i + ". şirket için  " + minkar + " , ay: " + minkaray + " , max " + maxkar + " , ay " + maxkaray);
            for (int j = 0; j < 12; j++) {
                int az = A[1][j], azs = 1, fz = A[1][j], fzs = 1;
                for (int k = 2; k < n; k++) {
                    if (A[i][j] < az) {
                        az = A[i][j];
                        azs = i;
                    }
                    if (A[i][j] > fz) {
                        fz = A[i][j];
                        fzs = i;
                    }
                }
                System.out.println(j + ". ay için : " + az + " , " + azs + " , " + fz + " , " + fzs);
            }

        }
    }

}
