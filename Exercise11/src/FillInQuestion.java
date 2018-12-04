public class FillInQuestion extends Question {
    public FillInQuestion(String question){
        super();
        this.setText(question.split("_")[0]+question.split("_")[2]);
        this.setAnswer(question.split("_")[1]);
    }

}
