public class ArrayInitializer {
    public static void main(String args[]){
        int a[]=new int[1000];
        System.out.print(a[1000]);//Wrong. The maximum index should be 999.
    }
}
