import java.util.Scanner;

public class strongnumber {
    int num=145;
    int copy=num;
    int rem=0;
    int fact=1;
    int no=0;
    int sum=0;
    public void checkstrongnumber(int n){
        num=n;

        while (num>0){

            rem=num%10; //get l d

            num=num/10; // in
            no=rem;
            fact=1;

            while(no>0){
                fact*=no;
                no--;
            }
            sum+=fact;

        }
        if(sum==copy){
            System.out.println("number is strong number ");
        }
        else{
            System.out.println("not a strong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n0=sc.nextInt();
        strongnumber s=new strongnumber();

        s.checkstrongnumber(n0);

    }

}

