import java.util.Scanner;

public class magicboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 4 number ");


        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }



        for(int i=0;i<a.length;i++){

                System.out.print((char)a[i]+"-"+a[i]+" ");

        }

    }
}
