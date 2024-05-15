//Merge two Arrays
import java.util.Arrays;
import java.util.Scanner;
public class Arr4 {
    Scanner s=new Scanner(System.in);
    int[] arr1;
    int[] arr2;
    int[] arr3;
    int l1,l2,l3;
    void input() {
        System.out.println("Enter the Length of Array 1");
        l1 = s.nextInt();
        arr1 = new int[l1];
        System.out.println("Enter the Elements of Array 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the Length of Array 2");
        l2=s.nextInt();
        arr2=new int[l2];
        System.out.println("Enter the Elements Array2");
        for (int i=0;i< arr2.length;i++){
            arr2[i]=s.nextInt();
        }
    }
    void merge(){
        l3=l1+l2;
        arr3=new int[l3];
        for (int i=0;i< arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0, j=l1;j<l3;j++,i++){
            arr3[j]=arr2[i];
        }
        System.out.println("Merged Array :: "+ Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        Arr4 r=new Arr4();
        r.input();
        r.merge();
    }
}
/*--Output--
Enter the Length of Array 1
3
Enter the Elements of Array 1
9
8
5
Enter the Length of Array 2
4
Enter the Elements Array2
4
6
2
1
Merged Array :: [9, 8, 5, 4, 6, 2, 1]
 */