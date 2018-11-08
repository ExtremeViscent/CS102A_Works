public class E3Checksum {
    public static void main(String []args){
        int[] sum=new int[11];
        for (int i = 0; i <10 ; i++) {
            sum[i]=args[0].charAt(i);
        }
        int tocheck=0;
        for (int i = 0; i < 5; i++) {
            tocheck+=sum[2*i]+func(sum[2*i+1]);
        }
        int k=0;
        while (tocheck%10!=0){
            tocheck+=1;
            k++;
        }
        sum[10]=k;
        for (int i:sum
             ) {
            System.out.print(i);
        }
    }
    public static int func(int a){
        String b=String.valueOf(a*2);
        int c=0;
        for (int i = 0; i <b.length() ; i++) {
            c+=Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        return c;
    }
}
