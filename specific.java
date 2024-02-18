import java.util.Arrays;
import java.util.Scanner;

public class specific {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,val;
        System.out.println("enter the position of array");
        p=sc.nextInt();
        System.out.println("enter the value to be inserted ");
        val=sc.nextInt();
        int a[]={12,34,45,56,4,45};
        for(int i=a.length;i>p;i++){
            a[i]=a[i+1];
        }
        a[p]=val;
        System.out.println("new array :"+ Arrays.toString(a));
    }
}
