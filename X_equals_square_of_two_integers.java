/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
import java.util.Scanner ;
public class X_equals_square_of_two_integers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Please enter a positive integer");
        int x = input.nextInt();
        for (int i = 0; i <=x; i++) {
            for (int j = 0; j <=x; j++) {
                if (i*i + j*j == x) 
                System.out.println(i+ "-" +j);
               }
        }
          
    }
    
}
