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
public class Volume_and_area_of_a_sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in) ;
      System.out.println("Please enter a number value for sphere's radius:");
        double r= input.nextDouble();
        double volume = 4/3*Math.PI*Math.pow(r, 3);
        double area   = Math.PI*Math.pow(r, 2);
      System.out.println("Volume: " +volume+  "  Area:"  +area) ;
    }
    
}
