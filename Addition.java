



import java.util.Scanner;
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int t1=0, t2=0, t3=0 ;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an integer");
        int n = input.nextInt();
        System.out.println("---------");
       
        for (int i = 1; i <=n; i++) 
        {
           System.out.println(i);
            t1 = i+t1 ;
        }
           System.out.println("Total: " +t1);
           
        System.out.println("-------");
        
        for (int i = 0; i <=n; i+=2) 
        {
            System.out.println(i);
            t2 = t2+i ;
        }
           System.out.println("Total of even numbers: " +t2);
           
        System.out.println("-------");
        
        for (int i = 1; i <=n; i+=2) 
        {
            System.out.println(i);
            t3 = t3+i ;
        }
         System.out.println("Total of odd numbers: "  +t3);
    }
    
}
