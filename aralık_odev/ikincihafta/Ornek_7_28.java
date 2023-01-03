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
import java.util.Random;

public class Ornek_7_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("İfade girin");
        String txt = input.nextLine();
        for (int i = 0; i < txt.length(); i++) 
        {
            char text = txt.charAt(i);
            if (i % 2 == 0) 
            {
                System.out.print(text);
                
            }
            else 
            {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
        }

    }

}
