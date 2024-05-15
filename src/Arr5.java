//Maximum no. in Array
public class Arr5 {
    public static void main(String[] args) {
        int[]x={3,2,9,6,8,5,1};
        int max=x[0];
        for (int i=1;i<x.length;i++){
            if (max<x[i]) {
                max=x[i];
            }
        }
        System.out.println("Largest no. in Array is :"+max);
    }
}
/*--Output--
Largest no. in Array is :9
 */
