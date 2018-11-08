public class Median_of_5 {
    public static void main(String args[]){
        int toSort[]=new int[5];
        for (int i=0;i<5;i++)toSort[i]=Integer.parseInt(args[i]);
        boolean flag=true;
        int index=0;
        while (flag){
            int low=0,high=0;
            for (int i=0;i<5;i++){
                if(toSort[index]<toSort[i])low++;
                if(toSort[index]>toSort[i])high++;
            }
            if (low==high){System.out.print(toSort[index]);flag=false;}
            index++;
        }
    }
}
