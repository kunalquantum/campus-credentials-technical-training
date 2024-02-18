public class rever23 {
    public static void main(String[] args) {
        String s="kunal";
        char c[]=s.toCharArray();
        String rev=" ";
        for (int i=0;i< c.length;i++){
            //to append the opposite
            rev=c[i]+rev;
        }
        System.out.println(rev);
    }

}
