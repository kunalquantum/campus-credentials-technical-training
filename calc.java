import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int choice=1;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("|||||||||| welcome to calculator|||||||||||||||");
            System.out.println("Enter two values ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. division");
            System.out.println("4. multiplication");
            System.out.println("5. remainder");
            System.out.println("6.exit");
            System.out.println("enter the  choice");
            choice=sc.nextInt();

            switch (choice){
                case 1:  System.out.println(" you have choosed addition");
                    System.out.println("Result :"+(a+b));
                    break;
                case 2:  System.out.println(" you have choosed substraction");
                    System.out.println("Result :"+(a-b));
                    break;
                case 3:  System.out.println(" you have choosed Division");
                    System.out.println("Result :"+(a*b));
                    break;
                case 4:  System.out.println(" you have choosed Multiplication ");
                    System.out.println("Result :"+(a+b));
                    break;
                case 5:  System.out.println(" you have choosed Remainder");
                    System.out.println("Result :"+(a%b));
                    break;
                case 6:  System.out.println(" you have choosed exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid input");
            }

        }while (choice!=6);
    }
}
