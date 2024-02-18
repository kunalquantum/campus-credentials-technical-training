import java.sql.SQLOutput;
import java.util.Scanner;

public class armstrongofanynumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<=10000;i++){
            int n=i;


        int count=0;

        int copy1=n;
        while(n>0){
            n=n/10;
            count++;
        }
        int rem=0;
        int arm=0;
        n=copy1;
        while(n>0){
        rem=n%10;
        arm+=Math.pow(rem,count);
        n=n/10;
        }
        if(copy1==arm){
            System.out.println(copy1+" : armshtong");

        }
        else{
            System.out.println(copy1+" :not a armstrong ");

        }}
        }
    }

