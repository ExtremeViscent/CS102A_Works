public class Majority {
    public static boolean majority(boolean a,boolean b,boolean c){
        return a&&b&&!c||a&&!b&&c||!a&&b&&c||a&&b&&c;
    }
}
