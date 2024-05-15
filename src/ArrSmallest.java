public class ArrSmallest {
    public static void main(String[] args) {
        int [] arr={43,51,12,67,11};
        int min=arr[0];
        for (int i=1;i< arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print("Smallest no. in Array is :"+min);
    }
}
/*--Output--
Smallest no. in Array is :11
 */
