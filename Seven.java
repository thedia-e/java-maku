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
public class Seven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
        System.out.println("Enter an ınteger");
        int S = input.nextInt();
        for (int a = 0; a <S/3; a++) {
            for (int b = 0; b <S/5; b++) {
                if (3*a + 5*b == S ) {
                    System.out.println("If we multiply 3 with " +a);
                    System.out.println("If we multiply 5 with " +b);
                    System.out.println("S equals to 3*a + 5*b");
                    System.out.println(S == 3*a + 5*b);
                }
                
            }
            
        }
    }
    
}
