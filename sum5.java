import java.util.Scanner;

public class sum5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 digit number ");
        int n=sc.nextInt();
        int n1,n2,n3,n4,n5;
        n1=n%10;
        n=n/10000;
        n5=n%10;
        System.out.println(n1+n5);
    }
}
