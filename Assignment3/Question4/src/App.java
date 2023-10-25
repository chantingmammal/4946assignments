import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int score = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What numbers of questions do you want");
        int numQuestions = scanner.nextInt();
        scanner.nextLine();
        
        // make the questions and answers arrays the right size.
        String[] questions = new String [numQuestions];
        String[] answers = new String [numQuestions];
        
        // fill the questions and answers arrays
        
        // Give the questions, get answer, check, and score
        for (int i = 0; i  < numQuestions; i++) {
           
            System.out.println("Question" + (i + 1) + ":" + questions[i]);
            System.out.print("Answer is:");
            String answer = scanner.nextLine();
        
            if (answer.equalsIgnoreCase(answers[i])) {
                score++;
                System.out.print("Correct Answer");
            } else {
                System.out.print("Wrong Answer");
            }
        }

        // Tell the final score.
        System.out.println("Your Score:" + score + "/" + numQuestions);
    
        scanner.close();
    }
}