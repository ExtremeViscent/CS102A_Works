public class User {
    private String name,password;
    private double money;
    public void User(){
        name=null;
        password=null;
        money=0;
    }
    public void User(String n, String p, double mo){
        name=n;
        password=p;
        money=mo;
    }
    public void setName(String namel){
        name=namel;
    }
    public void setPassword(String passwordl){
        password=passwordl;
    }
    public void setMoney(double money1){
        money=money1;
    }
    public void expense(double expensel){
        if (expensel<=money){
            money-=expensel;
            System.out.printf("You have expense %.2f dollar and the remained amount is %.2f\n",expensel,money);
        }
        else System.out.printf("no sufficient funds"+"\n");
    }
    public void income(double incomel){
        money+=incomel;
        System.out.printf("The remained amount is %.2f\n",money);
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }

    public double getMoney(){
        return money;
    }
    public void introduce(){
        System.out.printf("My name is "+this.name+" and I have %.2f dollar"+"\n",money);
    }
}
