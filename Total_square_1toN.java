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
public class Total_square_1toN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an integer:");
            int n = input.nextInt();
            int s = 1 ;
            int t = 0 ;
        System.out.println("--------");
            for (int i = 1; i <=n; i++) 
            {
            s = i*i ;
        System.out.println(i+ " square: " +s);
             t = t+s ;
             }
           
        System.out.println("Total: " +t);
    }
    
}
