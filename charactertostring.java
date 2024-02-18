import java.util.Arrays;
import java.util.Scanner;

public class charactertostring {
    public static void main(String[] args) {
        System.out.println("enter the array of character");
        Scanner sc=new Scanner(System.in);
        char a[]=new char[10];
        for (int i=0;i<a.length;i++){
            a[i]=sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("enter the string");
        String s3=sc.nextLine();
        System.out.println(s3);
    }
}
