//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result = 0;

        QuestionAnswers[] quiz = new QuestionAnswers[]{
                new QuestionAnswers("Which of the following is a valid variable name in Java?",
                        new String[]{"1variable", "variable_name", "@variable", "variable-name"},
                        "variable_name"),
                new QuestionAnswers("What is the size of an `int` data type in C#?",
                        new String[]{"8 bits", "16 bits", "32 bits", "64 bits"},
                        "32 bits"),
                new QuestionAnswers("Which of the following is a loop structure in Java?",
                        new String[]{"for", "switch", "if", "case"},
                        "for"),
                new QuestionAnswers("In Python, which keyword is used to define a function?",
                        new String[]{"function", "func", "def", "define"},
                        "def"),
                new QuestionAnswers("Which of the following is a valid way to create an object in C#?",
                        new String[]{"ClassName object = new ClassName();", "ClassName object();", "new ClassName object();", "object = new ClassName();"},
                        "ClassName object = new ClassName();"),
                new QuestionAnswers("What is the purpose of the `break` statement in Java?",
                        new String[]{"To exit a loop or switch statement", "To create an infinite loop", "To skip the current iteration of a loop", "To break a line of code into multiple lines"},
                        "To exit a loop or switch statement"),
                new QuestionAnswers("Which of the following is a keyword in Java?",
                        new String[]{"boolean", "define", "print", "include"},
                        "boolean"),
                new QuestionAnswers("Which method is used to find the length of a string in Java?",
                        new String[]{"getSize()", "size()", "length()", "getLength()"},
                        "length()"),
                new QuestionAnswers("In C#, which symbol is used for a single-line comment?",
                        new String[]{"/* */", "<!-- -->", "//", "#"},
                        "//"),
                new QuestionAnswers("What is the output of the following Python code?\nprint(2 ** 3)",
                        new String[]{"6", "8", "9", "10"},
                        "8")
        };


//        int randomNumber = (int)(Math.random() * 5) + 1;

        Random random = new Random();

        for (int i = quiz.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            QuestionAnswers temp = quiz[i];
            quiz[i] = quiz[j];
            quiz[j] = temp;
        }


        for (int i = 0; i <=   5 ; i++) {

            displayQuestion(quiz[i]);


            String useranswer = getUserAnswer(scanner);

            if (useranswer != null && useranswer.length() > 0)  {
                if (Objects.equals(useranswer.toUpperCase(), quiz[i].getCorrectAnswer().toUpperCase())){
                result  ++;
                    }
                else{

                    displayQuestion(quiz[i]);


                     useranswer = getUserAnswer(scanner);


                    if (Objects.equals(useranswer.toUpperCase(), quiz[i].getCorrectAnswer().toUpperCase())){
                        result  = result + 0.5 ;
                    }

                }

            }
            else{
                System.out.println("Please Enter Correct Answer");
            }


        }


        System.out.println("Your Score is " + result  + "Great Job" );



    }


    private static void displayQuestion(QuestionAnswers question) {
        System.out.println(question.getQuestion());
        String[] shuffledAnswers = question.shuffleAnswers();
        for (String answer : shuffledAnswers) {
            System.out.println(answer);
        }
    }

    private static String getUserAnswer(Scanner scanner) {
        System.out.println("Please write the correct answer:");
        return scanner.nextLine();
    }


}

