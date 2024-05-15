//Second-Largest Number in Array
public class Arr2Largest {
    public static void main(String[] args) {
        int [] arr={11,34,22,56,56,87};
        int max1=arr[0];
        int max2=arr[0];
        for (int i=1;i< arr.length;i++){
            if (max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
        }
        System.out.println("Second Largest No. is :"+max2);
    }
}
/*--Output--
Second Largest No. is :34
 */
