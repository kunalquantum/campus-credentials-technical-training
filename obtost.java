class test{
    int a;
    int b;
}
public class obtost {

    public static void main(String[] args) {
        test t=new test();
        test t1=new test();
        if(t1==t){
            System.out.println(" equal ");
        }
        else{
            System.out.println(" not equal");
        }

        String s="kunal";
        String s1="kunal";
        if(s1==s){
            System.out.println(" equal ");
        }
        else{
            System.out.println(" not equal");
        }
    }
}
