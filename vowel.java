import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("|||| welcome to vowel checker");

        while(true){
            System.out.println("enter the charcter");
            char c=sc.next().charAt(0);
            switch (c){
                case 'a':
                    System.out.println("it a vowel");
                    break;
                case 'e':
                    System.out.println("it a vowel");
                    break;
                case 'i':
                    System.out.println("it a vowel");
                    break;
                case 'o':
                    System.out.println("it a vowel");
                    break;
                case 'u':
                    System.out.println("it a vowel");
                    break;
                case 'A':
                    System.out.println("it a vowel");
                    break;
                case 'E':
                    System.out.println("it a vowel");
                    break;
                case 'I':
                    System.out.println("it a vowel");
                    break;
                case 'O':
                    System.out.println("it a vowel");
                    break;
                case 'U':
                    System.out.println("it a vowel");
                    break;
                case 's':
                    System.out.println("it  consonent");
                    System.exit(0);
                default:
                    System.out.println(" Consonent");

            }

        }
    }
}
