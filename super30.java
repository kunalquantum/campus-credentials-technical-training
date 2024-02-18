import org.w3c.dom.ls.LSOutput;

class ambani{
    double cash=10000000;
    String car="mercedes";
    public void messge(){
        System.out.println("i am mukesh ambani");
    }
    public void car(){
        System.out.println(car);
    }
    public void cash(){
        System.out.println("daddy ambani");
        System.out.println(cash);
    }

}
class ambanikabeta extends  ambani{
    String car="lamborghini";
    int cash=120;
    public void car(){
        System.out.println("papa ki car ");
        super.car();
        System.out.println("my car");
        System.out.println(car);
    }
    public void cash(){
        System.out.println("dady ka cash");
        super.cash();
        System.out.println(cash);
    }


}














public class super30 {
    public static void main(String[] args) {
        ambanikabeta a=new ambanikabeta();
        a.cash();
        a.car();
        a.messge();

    }
}
