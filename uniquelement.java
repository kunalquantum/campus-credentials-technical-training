import java.util.Scanner;

public class uniquelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the 4 number ");
        boolean check=false;
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        int count=0;
        int flag=0;
        try{
        for(int i=0;i<a.length;i++){
            count=0;
            flag=a[i];
            for (int j=i+1;i<a.length-1;j++){
                if(flag==a[j]){
                    count++;
                }
                else{
                    count=count;

                }
            }




        }}catch (Exception e){
            System.out.println(e);
        }
        if(count>0){
            System.out.println(true);}
        else{
            System.out.println(false);
        }
    }
}
