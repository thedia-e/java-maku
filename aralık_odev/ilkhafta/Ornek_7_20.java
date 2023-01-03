
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
public class Ornek_7_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Dizi kaç elemanlı?");
        n = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int x = 0, y = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                return;
            }
            if (A[i] > 0) {
                x++;
                B[x] = A[i];
            }

            if (A[i] < 0) {
                y++;
                C[y] = A[i];
            }

        }
        System.out.print("B[] = ");
        System.out.println(Arrays.toString(B));
        System.out.print("C[] = ");
        System.out.println(Arrays.toString(C));
    }
    
}
