import java.util.Scanner;

public class conversonbuff {
    public static void main(String[] args) {
        System.out.println("enter the string ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(" by string "+s);
        System.out.println("conversion string to  string buffer ");
        StringBuffer b1=new StringBuffer(s);
        System.out.println(" By string buffer "+b1);
        System.out.println("enter the string ");
        StringBuffer b2=new StringBuffer(sc.nextLine());
        System.out.println("by StringBuffer"+ b2);
        System.out.println("conversion");
        String s2=b2.toString();
        System.out.println("by string "+s2);




    }
}
