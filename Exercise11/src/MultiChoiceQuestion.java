import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiChoiceQuestion extends Question {
    public MultiChoiceQuestion(){
        super();
    }
    @Override
    public boolean checkAnswer(String response){
        ArrayList<String> answerList=new ArrayList<>(Arrays.asList(getAnswer().split(" ")));
        Collections.sort(answerList);
        ArrayList<String> responseList=new ArrayList<>(Arrays.asList(response.split(" ")));
        Collections.sort(responseList);
        return answerList.equals(responseList);
    }
}
