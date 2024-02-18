import java.util.Arrays;

public class stockspan {
    public static void main(String[] args) {
        int a[]={100,80,60,70,60,75,85};
        int res[]=new int[7];

        try{
            for (int i=0;i<a.length;++i){

                for(int j=i+1;j<=a.length-1;++j){
                    if(a[j]<a[i]){
                        res[j]=1;

                    }
                    else{
                        res[j]=2;
                    }
                }

            }}catch (Exception e){
            e.printStackTrace();
        }
        res[0]=1;
        for(int i=0;i<a.length;i++){
            res[i]=res[i]*res[i]*res[i];
        }
        System.out.println("the result :"+ Arrays.toString(res));
    }
}

