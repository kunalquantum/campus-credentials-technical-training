import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        byte  byt[]=s.getBytes();
        for (int i=0;i<byt.length;i++){
            System.out.print((char)(byt[i]-1));
        }

    }
}
