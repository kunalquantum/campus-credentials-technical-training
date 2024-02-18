import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class note_finder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("|||||||||  Note Finder |||||||||||||||");
        while (true){
            System.out.println("Enter the amount of money");
            int am=sc.nextInt();
            System.out.println("Enter the range of money");
            int range=sc.nextInt();
            int n1=0;
            switch (range){
                case 2000:
                    n1=am/2000;
                    System.out.println("2000 :"+n1+"="+2000*n1);
                    am=am%2000;
                case 500:
                    n1=am/500;
                    System.out.println("500 :"+n1+"="+500*n1);
                    am=am%500;
                case 200:
                    n1=am/200;
                    System.out.println("200 :"+n1+"="+200*n1);
                    am=am%200;
                case 100:
                    n1=am/100;
                    System.out.println("100 :"+n1+"="+100*n1);
                    am=am%100;
                case 50:
                    n1=am/50;
                    System.out.println(" :"+n1+"="+50*n1);
                    am=am%50;
                case 20:
                    n1=am/20;
                    System.out.println("2000 :"+n1+"="+20*n1);
                    am=am%20;
                case 10:
                    n1=am/10;
                    System.out.println("2000 :"+n1+"="+10*n1);
                    am=am%10;

                case 5:
                    n1=am/5;
                    System.out.println(" :"+n1+"="+5*n1);
                    am=am%5;

                case 2:
                    n1=am/2;
                    System.out.println("2000 :"+n1+"="+2*n1);
                    am=am%2;
                case 1:
                    n1=am/1;
                    System.out.println("2000 :"+n1+"="+1*n1);
                    am=am%1;
            }


        }
    }
}
