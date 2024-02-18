import org.w3c.dom.ls.LSOutput;

public class vararg2 {
    void m1(char ch,int... a){
        System.out.println(ch);
        for (int a1:a){
            System.out.print(" "+a1);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        vararg2 v=new vararg2();
        v.m1('a');
        v.m1('a',10);
        v.m1('b',12,23);
        v.m1('v',12,23,33,455,6);
    }



}
