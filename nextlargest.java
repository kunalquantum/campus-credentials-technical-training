import java.util.Arrays;

public class nextlargest {
    public static void main(String[] args) {
        int a[]={1,3,2,4};
        int res[]=new int[4];
        int max=0;
        int m=0;
        try{
        for (int i=0;i<a.length;++i){
            max=a[i];
            for(int j=i+1;j<=a.length-1;++j){
                if(max<a[j]){
                    max=a[j];
                    res[m]=max;
                    i=j;
                    m++;
                    break;
                }

            }

        }}catch (Exception e){
            e.printStackTrace();
        }
        res[3]=-1;
        System.out.println("the result :"+ Arrays.toString(res));
    }
}

