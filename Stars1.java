

import java.util.Scanner;
public class Stars1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a nnumber for the row:");
        int s = input.nextInt();
        for (int i = s; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
