//Sum of two Arrays
public class Arr3 {
    public static void main(String[] args) {
        int []arr1={12,23,14};
        int []arr2={12,33,14};
        int []sum=new int[3];
        for (int i=0;i< arr2.length;i++){
            sum[i]=arr1[i]+arr2[i];
            System.out.print(sum[i]+"\t");
        }
    }
}
/*-Output-
24	56	28
 */