import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Area{
    int len,bre;
    public Area(int l,int b){
        len=l;
        bre=b;
    }
    public int returnArea(){
        return len*bre;
    }
}
public class areamain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the rectangel 1");
        int len1=sc.nextInt();
        System.out.println("enter the bredth of the rectangle 1");
        int bre1=sc.nextInt();
        Area a=new Area(len1,bre1);
        System.out.println("enter the length of the rectangel 2");
        int len2=sc.nextInt();
        System.out.println("enter the bredth of the rectangle 2");
        int bre2=sc.nextInt();
        Area a1=new Area(len2,bre2);
        int ar=a.returnArea();
        int ar2=a1.returnArea();
        System.out.println("the area of the rectangle 1"+ar);
        System.out.println("the area of the rectangle 2"+ar2);

    }

}
