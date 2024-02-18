import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        char c[]=s.toCharArray();
        String rev="";
        for (int i=0;i< c.length;i++){
            //to append the opposite
            rev=c[i]+rev;
        }
        if(rev.equalsIgnoreCase(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }

}

