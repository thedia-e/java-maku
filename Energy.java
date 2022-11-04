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
public class Energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Please enter the mass value for the object");
        double m = input.nextInt();
        System.out.println("Please enter the speed of this object");
        double v = input.nextInt();
        System.out.println("Please enter the height of the object from the ground");
        double h = input.nextInt();
        int g = 10 ;
        double potential = m*g*h ;
        double kinetic   = (double) 1/2*m*Math.pow(v, 2);
        System.out.println("Potential energy:" +potential+ " Kinetic Energy:" +kinetic);
    }
    
}
