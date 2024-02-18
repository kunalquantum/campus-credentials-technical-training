import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost Price ");
        int cp=sc.nextInt();
        System.out.println("are you a berozgar(y/n)");
        double dis;
        char ch=sc.next().charAt(0);
        if(ch=='y'){
            if(cp>=500){
                dis=0.1;
            }
            else{
                dis=0.5;
            }
        }
        else{
            if(cp>=500){
                dis=0.08;
            }
            else{
                dis=0.02;
            }
        }

        System.out.println("cost price "+cp);
        System.out.println("discount "+dis);
        double p=cp-cp*dis;
        System.out.println("price :"+p);
    }
}
