import java.util.Scanner;

class BankAccount{
    int balance;
    BankAccount(){
        balance=1000;
    }
    Scanner sc=new Scanner(System.in);

    int amt;
    String name,city;
    int accountno;
    public void inputdata(){
        System.out.println("enter the name :");
        name=sc.next();
        System.out.println("enter the city");
        city=sc.next();
        System.out.println("enter the account no  ");
        accountno=sc.nextInt();
        System.out.println("enter the amount to be stored ");
        amt=sc.nextInt();
        balance=balance+amt;

    }

    public void display(){
        System.out.println("Name of the account holder :"+name);
        System.out.println("Name of city "+city);
        System.out.println("account no :"+accountno);
        System.out.println("current balance :"+balance);
        
    }
    public void deposit(){
   
        System.out.println("Enter the amount to be depostied ");
        amt=sc.nextInt();
        balance=balance+amt;
    }
    public void withdraw(){
        amt=0;
        System.out.println("enter the amoont you want to withdraw");
        System.out.println("current balance :"+balance);
        amt=sc.nextInt();
        balance=balance-amt;
    }


}


class SavingAccount extends BankAccount{
    public void withdraw(){
        amt=0;
        System.out.println("enter the amoont you want to withdraw");
        System.out.println("current balance :"+balance);
        System.out.println("you can withdraw till "+(balance-1000));
        amt=sc.nextInt();
        if((balance-amt)<=1000){
            System.out.println("you balance in the account is insufficent "+balance);
        }


        else{
          balance=balance-amt;
            System.out.println("updated balance is :"+balance);
        }
    }

}


public class task30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavingAccount s=new SavingAccount();
        int choice=0;
        while (choice!=5){
            System.out.println("-------- welcome to the banking System -----------");
            System.out.println("please select the following options ");
            System.out.println("1. Input data ");
            System.out.println("2. Get your Information");
            System.out.println("3. deposit");
            System.out.println("4. withdraw ");
            System.out.println("5. exit ");
            System.out.println("Enter the choice ");
            choice=sc.nextInt();

            switch (choice){
                case 1: s.inputdata();
                break;
                case 2: s.display();
                break;
                case 3:s.deposit();
                break;
                case 4:s.withdraw();
                break;
                case 5: System.exit(0);
                break;
                default:
                    System.out.println("thank you for using the service");
                    System.out.println("invalid input");
            }
        }
    }
}
