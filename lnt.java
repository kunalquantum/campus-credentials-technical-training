import java.util.Scanner;

public class lnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String s=sc.nextLine();
        System.out.println("enter the character to skip");
        char p=sc.next().charAt(0);

        char ch[]=s.toCharArray();
        String new1="";
        int i=0;
        while(ch.length>0){
            if(ch[i]==p){
                continue;
            }
            new1+=ch[i];
            i++;
        }
        System.out.println("result :"+new1);
    }
}
