//Return Array from Method-
import java.util.Scanner;
public class Arr1 {
    int[] readArray(){
        Scanner s=new Scanner(System.in);
        int size;
        System.out.println("Enter the No. of Elements");
        size=s.nextInt();
        int [] x=new int[size];

        System.out.println("Enter the Elements ::");
        for (int i=0;i<x.length;i++){
            x[i]=s.nextInt();
        }
        s.close();
        return x;
    }

    public static void main(String[] args) {
        Arr1 r=new Arr1();
        int[] a=r.readArray();
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
