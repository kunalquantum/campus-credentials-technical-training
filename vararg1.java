public class vararg1 {
    void m1(int... n){
        System.out.println("ashish");
    }

    public static void main(String[] args) {
        vararg1 t=new vararg1();
        t.m1();
        t.m1(10);
        t.m1(10,20,30);

    }
}
