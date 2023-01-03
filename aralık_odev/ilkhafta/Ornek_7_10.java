
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
public class Ornek_7_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Dizinin eleman sayısını girin");
        n = input.nextInt();
        int[] A = new int[n];
        System.out.println("A dizisinin elemanlarını girin");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(A));
        int toplam = 0, carpim = 1, toplam2 = 0, harmoniktoplam = 1;
        for (int i = 0; i < A.length; i++) {
            toplam += A[i];
            carpim *= A[i];
            harmoniktoplam += (1 / A[i]);
            toplam2 += Math.pow(A[i], 2);
        }
        double AO = ((double) toplam / n);
        double GO = Math.pow(carpim, (1.0 / A.length));
        double HO = (n / harmoniktoplam);
        double KHO = (double) (toplam2 / toplam);

        System.out.println("Aritmetik ortalama = " + AO);
        System.out.println("Geometrik ortalama = " + GO);
        System.out.println("Harmonik ortalama = " + HO);
        System.out.println("Kontraharmonik ortalama = " + KHO);

    }
    
}
