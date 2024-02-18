import java.util.Scanner;

class powerof4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int no=sc.nextInt();

        boolean res=false;
        for(int i=1;i<no;++i){
            if(Math.pow(i,4)==4);
            res=true;
            break;

        }
        System.out.println(res);


    }
}