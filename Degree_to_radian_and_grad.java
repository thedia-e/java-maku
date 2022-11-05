/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
import java.util.Scanner;
public class Degree_to_radian_and_grad 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
       System.out.println("Please enter the angle in degrees:");
    int a = input.nextInt();
    double radian = a*Math.PI/180;
    double grad = a*200/180;
    
       System.out.println("Radian:" + radian + " Grad:" + grad);
    }
    }
    

