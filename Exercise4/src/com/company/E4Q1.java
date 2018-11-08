public class E4Q1 {
    public static String diamond() {
        int n=7;
        char flash='*',blank=' ';
        StringBuilder ret=new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*n+1); j++) {
                if ((j == n - i || j == n + i || j == n)) {
                    ret.append(flash);
                }
                else if(j>n+i)break;
                else {
                    ret.append(blank);
                }
            }
            ret.append("\n");
        }
        for (int j = 0; j < (2*n+1); j++) {
            ret.append(flash);
        }
        ret.append("\n");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (2*n); j++) {
                if(j<i+1||j==n)ret.append(blank);
                else if (j+1==(n+1+(n-i)))
                {break;}
                else ret.append(flash);
            }
            ret.append("\n");
        }
        for (int j = 0; j < n; j++) {
            ret.append(blank);
        }
        ret.append(flash);
        return ret.toString();
    }

    public static String diamond(int n){
        char flash='*',blank=' ';
        StringBuilder ret=new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*n+1); j++) {
                if ((j == n - i || j == n + i || j == n)) {
                    ret.append(flash);
                }
                else if(j>n+i)break;
                else {
                    ret.append(blank);
                }
            }
            ret.append("\n");
        }
        for (int j = 0; j < (2*n+1); j++) {
            ret.append(flash);
        }
        ret.append("\n");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (2*n); j++) {
                if(j<i+1||j==n)ret.append(blank);
                else if (j+1==(n+1+(n-i)))
                {break;}
                else ret.append(flash);
            }
            ret.append("\n");
        }
        for (int j = 0; j < n; j++) {
            ret.append(blank);
        }
        ret.append(flash);
        return ret.toString();
    }

    public static String diamond(int n, char flash){
        char blank=' ';
        StringBuilder ret=new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*n+1); j++) {
                if ((j == n - i || j == n + i || j == n)) {
                    ret.append(flash);
                }
                else if(j>n+i)break;
                else {
                    ret.append(blank);
                }
            }
            ret.append("\n");
        }
        for (int j = 0; j < (2*n+1); j++) {
            ret.append(flash);
        }
        ret.append("\n");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (2*n); j++) {
                if(j<i+1||j==n)ret.append(blank);
                else if (j+1==(n+1+(n-i)))
                {break;}
                else ret.append(flash);
            }
            ret.append("\n");
        }
        for (int j = 0; j < n; j++) {
            ret.append(blank);
        }
        ret.append(flash);
        return ret.toString();
    }

    public static String diamond(int n, char flash, char blank){
        StringBuilder ret=new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*n+1); j++) {
                if ((j == n - i || j == n + i || j == n)) {
                    ret.append(flash);
                }
                else if(j>n+i)break;
                else {
                    ret.append(blank);
                }
            }
            ret.append("\n");
        }
        for (int j = 0; j < (2*n+1); j++) {
            ret.append(flash);
        }
        ret.append("\n");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (2*n); j++) {
                if(j<i+1||j==n)ret.append(blank);
                else if (j+1==(n+1+(n-i)))
                {break;}
                else ret.append(flash);
            }
            ret.append("\n");
        }
        for (int j = 0; j < n; j++) {
            ret.append(blank);
        }
        ret.append(flash);
        return ret.toString();
    }
}
