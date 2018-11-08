public class Deal {
    public static void main(String args[]){
        String rank []=new String[13];
        for (int i=0;i<9;i++)rank[i]=String.valueOf(i+2);
        rank[9]="J";
        rank[10]="Q";
        rank[11]="K";
        rank[12]="A";
        String[] suits = { "\u2660", "\u2661", "\u2662", "\u2663" };
        String[] deck=new String[52];
        for (int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                deck[j+i*13]=rank[j]+suits[i];
            }
        }
        int n= Integer.parseInt(args[0]);
        deck=shuffle(deck);
        StringBuilder hands=new StringBuilder();
        for (int i=0;i<n;i++){
            for (int j=0;j<5;j++){
                hands.append(deck[j+i*5]+"\t");
            }
            hands.append("\n");
        }
        System.out.print(hands.toString());

    }
    public static String[] shuffle(String deck[]){
        for (int i=0;i<52;i++){
            int r= i+(int)(Math.random()*(52-i));
            String t = deck[r];
            deck[r]=deck[i];
            deck[i]=t;
        }
        return deck;
    }
}
