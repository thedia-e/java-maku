

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
import java.util.Scanner;
public class Ohm_Law {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the resistance of the conductor:");
        int R = input.nextInt();
        System.out.println("Please enter the current of the conductor:");
        int I =input.nextInt();
        double V = I * R ;
        
        System.out.println("Voltage:" + V );
        
    }
    
}
