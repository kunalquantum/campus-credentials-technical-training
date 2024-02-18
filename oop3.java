import org.w3c.dom.ls.LSOutput;

class demo{
    static int count=0;
    public void display()
        {
        count=count+1;
        System.out.println(count);
    }
}



public class oop3 {
    public static void main(String[] args) {
        demo d=new demo();
        System.out.println(demo.count);
        demo d1=new demo();
        System.out.println(demo.count);
        demo d2=new demo();
        System.out.println(demo.count);
    }

}
