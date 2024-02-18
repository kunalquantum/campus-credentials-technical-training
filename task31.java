import java.util.Scanner;

abstract class BankAccount1{
    int balance;
    BankAccount1(){
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
    abstract public void deposit();
    abstract public void withdraw();


}


class SavingAccount1 extends BankAccount1{
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
    public void deposit(){

        System.out.println("Enter the amount to be depostied ");
        amt=sc.nextInt();
        balance=balance+amt;
    }

}


class currentaccount extends BankAccount1{
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
    public void deposit(){

        System.out.println("Enter the amount to be depostied ");
        amt=sc.nextInt();
        balance=balance+amt;
    }

}
//interface RBI{
//    void callinterest();
//}
class interest1 extends SavingAccount1
{
    SavingAccount1 s=new SavingAccount1();

    public double calInterest(){
        return s.balance*0.04;

    }
}
class interest2 extends currentaccount{
    currentaccount c=new currentaccount();
    public double calInterest(){
        return (c.balance*0.02);

    }
}

public class task31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavingAccount1 s=new SavingAccount1();
        currentaccount c=new currentaccount();
        interest1 i=new interest1();
        interest2 i2=new interest2();
        int choice=0;
        char bank=' ';
        while (choice!=5){
            System.out.println("-------- welcome to the banking System -----------");
            System.out.println("Select the account please for (A ->current account and B -> saving account )");
            bank=sc.next().charAt(0);
            if(bank=='A') {
            System.out.println("Current bank Account ");
            System.out.println("please select the following options ");
            System.out.println("1. Input data ");
            System.out.println("2. Get your Information");
            System.out.println("3. deposit");
            System.out.println("4. withdraw ");
            System.out.println("5. calculate interest ");
            System.out.println("6.exit ");

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
                case 5:
                    System.out.println(i.calInterest());
                    break;
                case 6: System.exit(0);
                default:
                    System.out.println("thank you for using the service");
                    System.out.println("invalid input");
            }}
            else if(bank=='B'){
            System.out.println("Saving account ");
                System.out.println("please select the following options ");
                System.out.println("7. Input data ");
                System.out.println("8. Get your Information");
                System.out.println("9. deposit");
                System.out.println("10. withdraw ");
                System.out.println("11. interest calculation ");
                System.out.println("12. exit ");
                System.out.println("Enter the choice ");
                choice=sc.nextInt();

                switch (choice){
                    case 7: c.inputdata();
                        break;
                    case 8: c.display();
                        break;
                    case 9:c.deposit();
                        break;
                    case 10:c.withdraw();
                        break;
                    case 11:
                        System.out.println(i2.calInterest());
                        break;
                    case 12: System.exit(0);
                        break;
                    default:
                        System.out.println("thank you for using the service");
                        System.out.println("invalid input");
                }}
            else{
                System.out.println("please enter the valid input ");

            }
        }
    }
}

