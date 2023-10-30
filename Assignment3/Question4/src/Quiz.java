import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        int score = 0;
        int numQuestions = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many questions do you want? ");
        try {
            numQuestions = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry, that isn't an integer!");
            System.exit(1);
        }
        
        // make the questions and answers arrays the right size.
        String[] questions = new String [numQuestions];
        String[] answers = new String [numQuestions];
        
        // fill the questions and answers arrays
        for (int i = 0; i < numQuestions; i++) {
            setUpTheQuestionAndAnswer(questions, answers, i);
        }
        
        // Give the questions, get answer, check, and score
        for (int i = 0; i  < numQuestions; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println("Answer is: ");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase(answers[i])) {
                score++;
                System.out.println("Correct Answer");
            } else {
                System.out.println("Wrong Answer");
            }
        }
        // Tell the final score.
        System.out.println("Your Score:" + score + "/" + numQuestions);}
    
    }
    
    public static void setUpTheQuestionAndAnswer(
        String[] questions,
        String[] answers,
        int indice
    ) {
        Scanner scanner = new Scanner(System.in);
        String question; 
        String answer;
        System.out.println("What questions?");
        question = scanner.nextLine();
        System.out.println("Answer?"); 
        answer = scanner.nextLine();
        questions[indice] = question;
        answers[indice] = answer;
    }
}
