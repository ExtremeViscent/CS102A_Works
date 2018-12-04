public class AnyCorrectChoiceQuestion extends Question {
    public AnyCorrectChoiceQuestion(){
        super();
    }
    @Override
    public boolean checkAnswer(String response){
        for (String a:getAnswer().split(" ")) {
            for (String b:response.split(" ")) {
                if (a==b)return true;
            }
        }
        return false;
    }
}
