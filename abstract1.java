abstract class hide{
    abstract void mee();
    abstract void mee2();
    abstract void m223();
    void mee4(){
        System.out.println("i am in abstract class but not a abstract method ");
    }

}
class non_hide extends hide {
    public void mee(){
        System.out.println("i am in the non hide ");
    }
    public void mee2(){
        System.out.println("I am in the non hide ");
    }
    public void m223(){
        System.out.println("I am in the non hide ");
    }


}
public class abstract1 {
    public static void main(String[] args) {
        non_hide n=new non_hide();
        n.mee();
        n.m223();
        n.mee4();
        n.mee2();
    }
}
