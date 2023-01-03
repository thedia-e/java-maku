
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
public class Ornek_7_43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İfade girin");
        String txt = input.nextLine();
        int n = txt.length();
        for (int i = ((n / 2) - 1); i >= 0; i--) 
        {
            System.out.print(txt.charAt(i));
        }
        for (int i = n - 1; i >= (n / 2); i--) 
        {
            System.out.print(txt.charAt(i));
        }
    }
    
}
