import javax.swing.*;
import java.util.Scanner;

public class replacelnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.nextLine();
        System.out.println("enter the alphabet");
        String p=sc.next();
        String s2=s;
        s=s.replace(p,"");
        String new1=s;


        System.out.println("old "+s2);
        System.out.println("result :"+new1);
    }
}
