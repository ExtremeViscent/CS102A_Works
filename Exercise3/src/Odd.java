public class Odd {
    public static boolean odd(boolean a,boolean b,boolean c){
        return a&&b&&c||a&&!b&&!c||!a&&b&&!c||!a&&!b&&c;
    }
}
