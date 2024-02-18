import javax.swing.*;
import java.util.Scanner;

public class lnt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.nextLine();
        System.out.println("enter the alphabet");
        char p=sc.next().charAt(0);



        String new1="";

        for(int i=0;i<s.length();i++){

            if(p==s.charAt(i)){
                continue;
            }
            new1+=s.charAt(i);
        }
        System.out.println("old "+s);
        System.out.println("result :"+new1);
    }
}
