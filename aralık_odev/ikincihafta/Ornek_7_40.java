
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
public class Ornek_7_40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ifade girin");
        String txt = input.nextLine();
        int n = txt.length()/2 ;
        for (int i = 0; i < n; i++) {
            System.out.print(txt.charAt(n+i));
            System.out.print(txt.charAt(n-1-i));
        }
    }
    
}
