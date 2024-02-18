import java.util.Scanner;

public class sumof4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 3 digit number ");
        int n=sc.nextInt();

        int n1=0,n2=0,n3=0,n4=0;
        n1=n%10;// unit get
        n=n/10;
        n2=n%10;
        n=n/10;
        n3=n%10;
        n=n/10;
        n4=n%4;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println("Reverse");
        int sum=n1+n2+n3+n4;
        System.out.println(sum);

    }
}