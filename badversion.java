public class badversion {
    public static void main(String[] args) {

        int a[]={1,1,1,2,2};
        int bad=2;
        boolean verson=true;
        for(int i=0;i<a.length;i++){
            if(i>=bad+1){
                System.out.println(verson);
            }
            else{
                System.out.println(!verson);
            }
        }
    }
}
