package quiz;

public class QuizDriver {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        myQuiz.createQuestions();
        myQuiz.askQuestion();
    }
}
