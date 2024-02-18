class addit{
    public void add(int a,int b){
        System.out.println("I am two parammeters ");
        System.out.println(a+b);
    }
    public  void add(int a,int b,int c){
        System.out.println("I am three parameterss ");
        System.out.println(a+b+c);
    }
    public void add(int a,int b,int c,int d){
        System.out.println("I am 4 paratmeres ");
        System.out.println(a+b+c+d);
    }

}





public class overloadingmain {
    public static void main(String[] args) {
        addit a=new addit();
        a.add(12,12);
        a.add(1,2,3);
        a.add(1,2,3,4);
    }

}
