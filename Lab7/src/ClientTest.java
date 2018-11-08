import java.util.ArrayList;

public class ClientTest {
    public static void main(String args[]){
        Food pizza1=new Food(),pizza2=new Food(),fired_Rice=new Food(),noodles=new Food();
        pizza1.setName("pizza");pizza2.setName("pizza");fired_Rice.setName("fired Rice");noodles.setName("noodles");
        pizza1.setType("Seafood");pizza2.setType("Beef");fired_Rice.setType("Seafood");noodles.setType("Beef");
        pizza1.setPrice(120);pizza2.setPrice(100);fired_Rice.setPrice(40);noodles.setPrice(35);
        pizza1.setSize(11);pizza2.setSize(9);fired_Rice.setSize(5);noodles.setSize(6);
        ArrayList<Food> foods =new ArrayList<Food>();
        foods.add(pizza1);foods.add(pizza2);foods.add(fired_Rice);foods.add(noodles);
        for (Food foodl:
             foods) {
            foodl.showInformation();
        }
    }
}
