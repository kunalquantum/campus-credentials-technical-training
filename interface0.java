interface abc{
    public void show();
}
class meetme{
    public void show(){
        System.out.println("i am implemented");
    }
}
public class interface0 {
    public static void main(String[] args) {
        meetme m=new meetme();
        m.show();
    }
}
