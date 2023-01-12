/*
 2 boyutlu dizilerin toplamını bir dizi olarak döndüren metot.
 */
package methododevocakilkhafta;

import java.util.Arrays;

/**
 *
 * @author edaza
 */
public class Dort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[][] a = {{4,8},{7,3}} ;
        int[][] b = {{3,9},{6,8}} ;
        int[]sum = twodimensionalsum(a,b) ;
        System.out.println(Arrays.toString(sum));
     
    }
    public static int[] twodimensionalsum (int[][] a , int[][]b)  
    {
        int[] sum = new int[a.length * a[0].length];
        int add = 0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
            sum[add++] = a[i][j] + b[i][j];
            }
        }
      return sum  ;
    }
}
