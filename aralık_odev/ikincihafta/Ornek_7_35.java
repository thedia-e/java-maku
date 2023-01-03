
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
public class Ornek_7_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String txt , k1 = "", k2 = "";
        char[] sesli = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("İfade girin");
       txt = input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            int kon = 0;
            for (int j = 0; j <= sesli.length; j++) {
                if (txt.charAt(i) == sesli[j]) {
                    kon = 1;
                    break;
                }
                if (kon == 1) {
                    k1 += txt.charAt(i);
                } else {
                    k2 += txt.charAt(i);
                }
            }
        }
        System.out.println(k1);
        System.out.println(k2);
    }
    
}
