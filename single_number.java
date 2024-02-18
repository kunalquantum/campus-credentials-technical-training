public class single_number {
    public static void main(String[] args) {
        int num[]={2,2,1};
           int tar=0;
           int count=0;

           for (int i=0;i<num.length;i++){ // arraay traversal
               tar=num[i];//
               for(int j=0;i<num.length-1;j++){ // selection
               if(tar==num[j]){
                   continue;
               }
               else{
                   count++;
                   System.out.println(num[j]);
               break;}


               }
               if(count!=0){
                   break;
               }

        }

    }
}
