class parent{
    int cash=2000;
    int gold=120000000;
    public void properties(){
        System.out.println("properties :"+" ::"+cash+"and "+gold);
    }
    public void bike(){
        System.out.println("bike name "+"splender");
    }
}

class child extends parent {
    int cash=54000;
    int gold=450000;
    public void properties(){

        System.out.println("cash"+cash);
    }
    public void bike(){
        System.out.println("BMW");
    }




}






public class overidemain {
    public static void main(String[] args) {
        child c=new child();
        c.properties();
        c.bike();
    }
}
