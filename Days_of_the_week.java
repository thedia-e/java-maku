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
public class Days_of_the_week 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter a number between 1 - 7 ");
        int a = input.nextInt();
        if (a==1)  
        {
            System.out.println("Monday");    
        }
        if (a==2)  
        {
            System.out.println("Tuesday");
        }
        if (a==3)  
        {
            System.out.println("Wednesday");
        }
        if (a==4)  
        {
            System.out.println("Thursdsay");
        }
        if (a==5)  
        {
            System.out.println("Friday");
        }
        if (a==6)  
        {
            System.out.println("Saturday");
        }
        if (a==7)  
        {
            System.out.println("Sunday");
        }
        
    }
    
}
