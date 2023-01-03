
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
public class Ornek_7_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("İfade girin");
        String txt = input.nextLine();
        int sayac = 0;
        for (int i = 0; i < txt.length(); i++) 
        {
            int r = sayac % 4;
            if (r < 2) 
            {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            } 
            else 
            {
                System.out.print(txt.charAt(i));
            }
            sayac++;
        }
    }
    
}
