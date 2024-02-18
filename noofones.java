public class noofones {
    public static void main(String[] args) {
        String s= "00000000000000000000001000000011";
        int len=s.length();
        int count=0;
        System.out.println(len);
        if(len==32){

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        count++;
                    }
                }

        }

        System.out.println(count);
    }
}
