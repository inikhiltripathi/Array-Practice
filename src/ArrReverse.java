//Reverse Array
import java.util.Arrays;
public class ArrReverse {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int []arr1=new int[arr.length];
        int i,j;
        for (i=0,j=arr.length-1;i<arr.length;i++,j--){
            arr1[j]=arr[i];
        }
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Reverse : "+Arrays.toString(arr1));
    }
}
/*--Output--
Array : [1, 2, 3, 4, 5, 6, 7]
Reverse : [7, 6, 5, 4, 3, 2, 1]
 */