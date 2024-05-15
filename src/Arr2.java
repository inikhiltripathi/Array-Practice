//Average of Array
import java.util.Scanner;
public class Arr2 {
    int sum,avg;
    int[]arr;
    Scanner s=new Scanner(System.in);
    void input(){
        System.out.println("Enter the Length");
        int l=s.nextInt();
        arr=new int[l];
        System.out.println("Enter the Elements");
        for (int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
    }
    void average(){
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.print("Average is ="+"\t"+avg);
    }

    public static void main(String[] args) {
        Arr2 r= new Arr2();
        r.input();
        r.average();
    }
}
