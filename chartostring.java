import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class chartostring {
    public static void main(String[] args) {
        System.out.println("enter the string using literal");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("| |"+s+"| |");
        System.out.println("enter the string using new object");
        String s1=new String(sc.nextLine());
        System.out.println("| |"+s1+"| |");

    }
}
