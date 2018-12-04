/**
   A question with a text and an answer.
*/
public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   @Override
   public String toString() {
      return super.toString();
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   public void addText(String addtion){
      StringBuffer buffer=new StringBuffer();
      buffer.append(text+"\n");
      buffer.append(addtion);
      text=buffer.toString();
   }
   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      response.replaceAll(" ","");
      response.toLowerCase();
      answer.replaceAll(" ","");
      answer.toLowerCase();
      return response.equals(answer);
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }

   public String getAnswer() {
      return answer;
   }
}
