public class Kary {
    //NOT elegant at all.
    private static char[] res=new char[99];
    public static void main(String args[]){
        for (int i=0;i<99;i++){
            res[i]='0';
        }
        long i=Long.parseLong(args[0]);
        int k=Integer.parseInt(args[1]);
        while (i>0) {
            basc(0, k);
            i--;
        }
        if (k>10)convlet(res.length);
        int rs=95;
        while (res[rs]==0||res[rs]=='0')rs-=1;
        while (rs>=0){
            System.out.print(res[rs]);
            rs-=1;
        }
    }
    private static void basc(int index, int k){
            if (res[index] <(char)('0'+k-1)) {
                res[index]++;
            }
            else
            {
                res[index]='0';
                basc(index+1,k);
            }
        }
        private  static  void convlet(int k){
        for (int i=0;i<k;i++){
            switch (res[i]){
                case '9'+1:{res[i]='A';break;}
                case '9'+2:{res[i]='B';break;}
                case '9'+3:{res[i]='C';break;}
                case '9'+4:{res[i]='D';break;}
                case '9'+5:{res[i]='E';break;}
                case '9'+6:{res[i]='F';break;}
            }
        }


    }
}
