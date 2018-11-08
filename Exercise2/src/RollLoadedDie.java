public class RollLoadedDie {
    public static void main(String args[]){
        int randomi=(int)(Math.random()*8);
        if (randomi<5)System.out.print(randomi+1);
        else System.out.print('6');
    }
}
