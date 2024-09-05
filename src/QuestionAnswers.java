import java.util.Random;

public class QuestionAnswers {


    private String question;
    private String[] answers;
    private String CorrectAnswer;

    public QuestionAnswers(String question, String[] answers , String CorrectAnswer) {
        this.question = question;
        this.answers = answers;
        this.CorrectAnswer = CorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }
    public String[] getAnswers() {

        return answers;

    }
    public String getCorrectAnswer() {
        return CorrectAnswer;
    }


    public String[] shuffleAnswers() {
        Random random = new Random();
        for (int i = answers.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = answers[i];
            answers[i] = answers[j];
            answers[j] = temp;
        }

        return answers;
    }





}

