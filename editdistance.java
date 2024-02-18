import java.util.Scanner;

public class editdistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String n1=sc.next();
        System.out.println("enter second string");
        String n2=sc.next();

        int len1=n1.length();
        int len2=n2.length();
        int count=0;
        if(len1>len2) {
            count=len1-len2;

        }
        else if(len2>len1){
            count=len2-len1;
        }
        else{
        for (int j=0;j<n1.length();j++){

            if(n1.equals(n1)) {
                if (n1.charAt(j) != n2.charAt(j)) {
                    count++;
                }
            }
        }}

        System.out.println(count);

    }
}
