/*
 Bir diziyi küçükten büyüğe doğru sıralayıp döndüren metot.
 */
package methododevocakilkhafta;

/**
 *
 * @author edaza
 */
import java.util.Arrays;
public class Uc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = {4,5,8,2,9,5,1} ;
       int[] k = arraysort(array) ;
       System.out.println(Arrays.toString(k));
    }
    public static int[] arraysort ( int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]) {
                    int b = array[i] ;
                    array[i] = array[j] ;
                    array[j] = b ;
                }
            }
        }
        return array ;
    }
}
