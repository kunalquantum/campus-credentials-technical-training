class q{
    public void showa(){
        System.out.println("I am grand father");
    }

}
class T extends q{
    public void showb(){
        System.out.println("I am  father");
    }

}
class p extends q{
    public void showb(){
        super.showa();
        System.out.println("I am  father 2");
    }

}
class s extends p {
    public void showb() {
        super.showb();
        System.out.println("I am  son");
    }
}
class s2 extends p {
    public void showb() {
        super.showa();
        System.out.println("I am  daaughter");
    }
}






    public class herarchial {
        public static void main(String[] args) {
            s2 d=new s2();
            d.showb();
            d.showa();
        }
}
