/*
 
 */
import java.util.Scanner;
public class Combination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an integer");
             int n = input.nextInt();
        System.out.println("Please enter an integer");
            int r = input.nextInt();
            int f1 = 1, f2=1, f3=1, k ;
         
            for (int i=1 ; i<=n ; i++)  
            { 
                f1 = f1*i  ;
            if (i<=r)   {
                f2 = f2*i  ;
            if (i<=(n-r))  {
                f3 = f3*i  ;
                        }
            }
            }
            k = (f1/(f2*f3))  ;
            System.out.println(k);
             
    }
    
}
