class calculator{
    int s1,s2,s3;
    calculator(){
        System.out.println("default constructor ");
     s1=4;s2=5;s3=6;
    }
    calculator(int a,int b,int c){
        System.out.println("paremertized constucot is created");
        s1=a;
        s2=b;
        s3=c;
    }
    calculator(calculator c){

    }


    public void perimeter(){

        System.out.println("perimeter of triangle  :"+(s1+s2+s3));
    }
    public  void area(){
        System.out.println("area : "+(s1*s2)*0.5);
    }
}




public class main {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.perimeter();
        c.area();
        calculator c1=new calculator(12,34,45);
        c1.area();
        c1.perimeter();

    }
}
