public class reduce {
    public static void main(String[] args) {
        String n="aaabbbccdddddee";
        char tar=' ';
        int count=0;
        String name="";
        char arr[]=n.toCharArray();
        for (int i=0;i<n.length()-1;i++){


                if(arr[i]==arr[i+1]){ //a --

                    count++;



                }
                else{
                    name=name+arr[i]+count;
                    count=1;
                }

        }
        System.out.print(name);
    }
}
