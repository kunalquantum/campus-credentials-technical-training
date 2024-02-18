public class reversestring {
    public static void main(String[] args) {
        String name="kunal";
        char name1[]=name.toCharArray();
        String rev=" ";
        char c=' ';
        char[] revname=name.toCharArray();
        System.out.println(revname);
        int left=name.length();
        int right=0;
        int j=left;
        int i=right;

        for(left=j-1,right=i;left>=0;left--,right++){
            revname[left]=name1[right];

        }
        System.out.println(revname);

    }
}
