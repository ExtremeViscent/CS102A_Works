public class ArtGen {
    public static int N;
    public static int V;
    public static void main(String args[]){
        N=Integer.parseInt(args[0]);
        V=Integer.parseInt(args[1]);
        StringBuilder matrix=new StringBuilder();
        matrix.append("Questions:\n");
        int i=0,l=0;
        String[][] DB=new String[V+2][2];
        while (true){
            for (int j=0;j<4;j++){
                String Tmp[]=Gen();
                DB[l][0]=Tmp[0];
                DB[l][1]=Tmp[1];
                matrix.append(DB[l][0]+"\t");
                l++;
                if (l==V)break;
            }
            matrix.append("\n");
            if(l==V)break;
        }
        matrix.append("Answers:\n");
        l=0;
        while (true){
            for (int j=0;j<4;j++){
                matrix.append(DB[l][1]+"\t");
                l++;
                if (1==V)break;
            }
            matrix.append("\n");
            if(l==V)break;
        }
        System.out.print(matrix.toString());

    }
    private static String[] Gen(){
        int nums[]=new int[3];
        String res[]=new String[2];
        for (int i=0;i<3;i++)nums[i]= (int) (Math.random()*(N-1));
        switch ((int) (Math.random()*5)){
            case 0:{
                res[0]=nums[0]+" + "+nums[1]+" = ";
                res[1]=nums[0]+" + "+nums[1]+" = "+(nums[0]+nums[1]);
                return res;
            }
            case 1:{
                res[0]=nums[0]+" * "+nums[1]+" = ";
                res[1]=nums[0]+" * "+nums[1]+" = "+nums[0]*nums[1];
                return res;
            }
            case 2:{
                res[0]=nums[0]+" - "+nums[1]+" = ";
                res[1]=nums[0]+" - "+nums[1]+" = "+(nums[0]-nums[1]);
                return res;
            }
            case 3:{
                if(nums[1]!=0) {
                    res[0] = nums[0] + " / " + nums[1] + " = ";
                    res[1] = nums[0] + " / " + nums[1] + " = " + nums[0] / nums[1];
                    return res;
                }
                else return Gen();
            }
            case 4:{
                if(nums[1]!=0) {
                    res[0] = nums[0] + " % " + nums[1] + " = ";
                    res[1] = nums[0] + " % " + nums[1] + " = " + nums[0] % nums[1];
                    return res;
                }
                else return Gen();
            }

        }
        return res;
    }
}
