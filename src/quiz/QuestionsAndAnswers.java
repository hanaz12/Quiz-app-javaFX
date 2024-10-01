package quiz;
import java.util.ArrayList;
import java.util.Arrays;  

public class QuestionsAndAnswers {
    static ArrayList<String> questions = new ArrayList<>();
    static ArrayList<ArrayList<String>> choices = new ArrayList<>();
    static ArrayList<String> answers = new ArrayList<>(); 

    public QuestionsAndAnswers() {
        // Adding questions
        questions.add("1- What does RAM stand for?");
        questions.add("2- What does URL stand for?");
        questions.add("3- What does HTTP stand for?");
        questions.add("4- What does USB stand for?");
        questions.add("5- What does GPS stand for?");

        // Adding choices for each question
        choices.add(new ArrayList<>(Arrays.asList(
            "A) Random Access Memory",
            "B) Read Access Memory",
            "C) Run All Memory",
            "D) Random Allocation Memory"
        )));
        
        choices.add(new ArrayList<>(Arrays.asList(
            "A) Uniform Resource Locator",
            "B) Universal Resource Locator",
            "C) Uniform Reference Link",
            "D) Universal Reference Link"
        )));
        
        choices.add(new ArrayList<>(Arrays.asList(
            "A) HyperText Transfer Protocol",
            "B) HyperText Transmission Protocol",
            "C) HighText Transfer Program",
            "D) Hyper Transfer Text Protocol"
        )));
        
        choices.add(new ArrayList<>(Arrays.asList(
            "A) Universal Serial Bus",
            "B) Uniform Serial Bus",
            "C) Universal System Bus",
            "D) Uniform System Bus"
        )));
        
        choices.add(new ArrayList<>(Arrays.asList(
            "A) Global Positioning System",
            "B) General Positioning System",
            "C) Global Program System",
            "D) General Program System"
        )));

       answers.add("A");
        answers.add("A");
        answers.add("A");
        answers.add("A");
        answers.add("A");
    }
    public static int getTotalNumberOfQuestions(){
        return questions.size();
    }
    public static String getQuestionByIdx(int idx) {
       
        return questions.get(idx);
    }

    public static ArrayList<String> getChoicesForQuestion(int idx) {
       
        return choices.get(idx);
    }
    
    public static String getCorrectAnswer(int idx) {
      
        return answers.get(idx);
    }
}
