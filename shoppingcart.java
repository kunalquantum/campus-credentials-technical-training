import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class shop {
    int amt;
    int balance;
    String status1;
    ArrayList<Integer> itemno = new ArrayList<>();
    ArrayList<String> itemname = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    shop() {
        status1 = "Good";
        itemno.add(0);
        itemname.add(" ");
        price.add(0);
        balance = 0;
    }

    public void inputdata() {
        System.out.println("How Many Items would you like to add:");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("Enter the item no ");
            itemno.add(sc.nextInt());

            System.out.println("Enter the item name ");
            itemname.add(sc.next());

            System.out.println("Enter the item price ");
            price.add(sc.nextInt());

            n = n - 1;
            if (n == 0) {
                break;
            }
        }

    }

    public void display() {
        if (itemno.equals(-1)) {
            System.out.println("Your Shopping cart is empty");
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("----------------------Shopping Cart-------------------");
            System.out.println("------------------------------------------------------------");
            System.out.println("Item no \t Itemname \t Price ");

            for (int k = 1; k < itemno.size(); k++) {
                System.out.println("||     " + itemno.get(k) + "     " + itemname.get(k) + "      " + price.get(k) + "||");


            }
        }
    }

    public void update() {
        System.out.println("Enter the Item number to update");
        int tar = sc.nextInt();
        for (int i = 0; i < itemname.size(); i++) {
            int tar1 = itemno.get(i);
            if (tar1 == tar) {
                System.out.println("Update by choosing the following options");
                System.out.println("1.Current Name : " + itemname.get(i).toString());
                System.out.println("2.Current Price " + price.get(i).toString());
                System.out.println("select any choice ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("update new item name ");
                        itemname.add(i, sc.nextLine());
                        System.out.println("Updated Name :" + itemname.get(i));
                        break;
                    case 2:
                        System.out.println("update new item price ");
                        price.add(i, sc.nextInt());
                        System.out.println("Updated Price :" + price.get(i));
                        break;

                    default:
                        System.out.println("incorrect options ");
                }
            } else {
                System.out.println("Item no does not match");
            }
        }

    }

    public void delete() {
        System.out.println("Enter the Item No to be deleted ");
        int tar = sc.nextInt();
        for (int i = 0; i < itemname.size(); i++) {
            int tar1 = itemno.get(i);
            if (tar1 == tar) {
                itemname.remove(i);
                itemno.remove(i);
                price.remove(i);
            } else {
                System.out.println("Item no does not match");
            }
        }
    }

    public void wallet() {
        System.out.println("please choose the following options to be done ");
        System.out.println("1. deposit money");
        System.out.println("2. check balance");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("current balance " + balance);
            System.out.println("--------------------------------------------------------------");
            if (balance >= 5000) {
                System.out.println("Exellent");
                System.out.println("Can Buy 9 more vegetables from the shop");
            } else if (balance >= 1000) {
                System.out.println("Decent");
                System.out.println("Can buy 5 more items ");

            } else {
                System.out.println("Fair");
                System.out.println("Please buy carefully");
            }
        } else {
            System.out.println("current balance :" + balance);
            System.out.println("enter the amount to be entered :");
            amt = sc.nextInt();
            balance += amt;
            System.out.println("updated balance :" + balance);
        }

    }
public void customerbasket(){

}
    public void buy() {
        display();
        System.out.println("How Many Items would you like to buy:");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("please enter the name of Item to buy ");
            String tar = sc.next();
            for (int i = 0; i < itemname.size(); i++) {
                String tar1 = itemname.get(i);
                if(tar1 == tar){
                    System.out.println("Following is the transactional Details of your purchase");
                    System.out.println("Your current balance :"+balance);
                    System.out.println("(.). Name : " + itemname.get(i).toString());
                    System.out.println("(.). Price " + price.get(i).toString());
                    System.out.println("(.)Your current balance :"+balance);
                    System.out.println("(.)sgst dedecuton 15%:"+price.get(i)*0.15);
                    System.out.println("(.)cgst dedecuton 18%:"+price.get(i)*0.18);
                    balance-= price.get(i)*0.33;

                    balance-=price.get(i);
                    System.out.println("Your Updated balance after Purchare is :"+balance);

                } else {
                    System.out.println("oops !! wrong item selected ");
                }
            }

        }

    }
}






public class shoppingcart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Who are you Customer or Owner /staff {choose 1 for customer and 2 for staff}");
        int mem=sc.nextInt();
        if(true){
        shop s=new shop();
        int choice=0;
        while(choice!=6){
            System.out.println();
            System.out.println("||--------------------------Shopping Cart ------------------------------------");
            System.out.println("================================================================================");
            System.out.println("1.add new item");
            System.out.println("2.display");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.buy");
            System.out.println("6.wallet");
            System.out.println("7.exit");

//            System.out.println("5.exit");
            System.out.println("Enter the choice :");
            choice=sc.nextInt();


            switch (choice){
                case 1:
                    s.inputdata();
                    break;
                case 2:
                    s.display();
                    break;
                case 3:
                    s.update();
                    break;
                case 4:
                    s.delete();
                    break;
                case 5:
                    s.buy();
                    break;
                case 6:
                    s.wallet();
                    break;

                case 7:

                    System.out.println("thank you for using this ,:)");
                    System.exit(0);
                    break;

                default:
                    System.out.println("please enter the valid input");
            }



        }
    }


}}
