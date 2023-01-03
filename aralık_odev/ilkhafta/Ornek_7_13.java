
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
public class Ornek_7_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n,b;
        System.out.println("Polinom kaçıncı derece?");
        n = input.nextInt();
        System.out.println("Değer?");
        b = input.nextInt();
        int[] A = new int[n];
        System.out.println("Diziyi girin");
        for (int i = 1; i < A.length+1; i++) {
             A[i] = input.nextInt();
        }
         System.out.println(Arrays.toString(A));
         double t = A[1] ;
         for (int i = 2; i < n+1; i++) {
            t += Math.pow(A[i]*b, i-1) ;
        }
         System.out.println("Sonuç = "  +t);
    }
    
}
