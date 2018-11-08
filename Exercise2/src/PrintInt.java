public class PrintInt {
    public static void main(String a[]){
        int i=1000;
        for (int k=0;k<1000;k++){
            System.out.println(i+"\t"+(i+1)+"\t"+(i+2)+"\t"+(i+3)+"\t"+(i+4));
            i+=6;
            if(i%2000==2)break;
        }
    }
}
