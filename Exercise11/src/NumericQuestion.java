public class NumericQuestion extends Question {
    public NumericQuestion(){
        super();
    }
    @Override
    public boolean checkAnswer(String response){
        return Math.abs(Double.parseDouble(response)-Double.parseDouble(super.getAnswer()))<=0.01;
    }
}
