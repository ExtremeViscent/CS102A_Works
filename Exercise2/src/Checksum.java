public class Checksum {
    public static void main(String args[]){
        int arg[]=new int[9];
        for (int i=0;i<9;i++)arg[i]=Integer.parseInt(String.valueOf(args[0].charAt(i)));
        int checksum=0;
        for (int x=0;x<11;x++) {
            for (int i = 9; i >0; i--) {
                checksum+=(i+1)*arg[i-1];
            }
            checksum+=x;
            if (checksum%11==0){checksum = x;break;}
            checksum=0;
        }
        for (int i=0;i<9;i++)System.out.print(arg[i]);
        System.out.print(checksum);
    }
}
