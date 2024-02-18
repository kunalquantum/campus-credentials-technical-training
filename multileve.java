import org.w3c.dom.ls.LSOutput;

class a{
    public void showa(){
        System.out.print("hello in b");}
}
class b extends a{

    public void showb(){

        System.out.print("hello in b");}
}


public class multileve {
    public static void main(String[] args) {
        b B=new b();
        B.showb();
        B.showa();
    }

}
