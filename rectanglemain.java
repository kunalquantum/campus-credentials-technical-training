class rectange{
    int len,bre;
    rectange(int l,int b){
        len=l;
        bre=b;
    }
    public void area(){
        System.out.println("area : "+len*bre);
    }
}
public class rectanglemain {
    public static void main(String[] args) {
        rectange r1=new rectange(4,5);
        rectange r2=new rectange(5,8);
        r1.area();
        r2.area();
    }
}
