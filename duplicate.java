public class duplicate {
    public static void main(String[] args) {
        String a[]={"kunal","umika","omkar","priyanka","umika"};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].equals(a[j]))
                System.out.println("Duplicates string  :"+a[j]);
                else{
                    System.out.println("no duplicate");
                }
            }
        }
    }
}
