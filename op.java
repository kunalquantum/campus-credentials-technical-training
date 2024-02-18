class thisoperataion {
    int a;
    int b;
    thisoperataion(){
        this(10,20);/// this will call the paremeteized constructor
    }
    thisoperataion(int a,int b){
        this.a=a;
        this.b=b;
        this.show();
    }
    public void show(){
        System.out.println("a : "+a+"b: "+b);
    }

}
public class op{
    public static void main(String[] args) {
        thisoperataion op=new thisoperataion();
        thisoperataion op1=new thisoperataion(100,200);
    }

}
