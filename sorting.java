import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        System.out.println("enter the array element");
        int b[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("original array");
        System.out.println(Arrays.toString(b));
        int c[]=new int[5];
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));


    }
}
