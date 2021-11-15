//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab3QuizTime;

import java.util.*;

class Quiz extends Question {

    ArrayList<Question> QuestionList = new ArrayList<>();

    Quiz() {

    }       //Default Constructor

    void Add(String question, String answer, int difficulty) {
        Question modQuestion = new Question(question, answer, difficulty);
        QuestionList.add(modQuestion);
    }

    void Remove(int index) {
        QuestionList.remove(index);
    }

    void Modify(int index, String question, String answer, int difficulty) {

        if (question == null) question = QuestionList.get(index).getQuestion();
        if (answer == null) answer = QuestionList.get(index).getAnswer();
        if (difficulty == -1) difficulty = QuestionList.get(index).getDifficulty();

        QuestionList.get(index).setQuestion(question);
        QuestionList.get(index).setAnswer(answer);
        QuestionList.get(index).setDifficulty(difficulty);
    }

    String getQuestions(int index) {
        return QuestionList.get(index).getQuestion();
    }

    String QuizGive() {
        Scanner scan = new Scanner(System.in);
        int score = 0, difficulty = 0;
        String answer;

        for (int i = 1; i < QuestionList.size(); i++) {
            System.out.println("#" + i + ". " + QuestionList.get(i).getQuestion());
            System.out.print("Answer:\t");
            answer = scan.nextLine();

            difficulty += QuestionList.get(i).getDifficulty();

            if (QuestionList.get(i).getAnswer().equals(answer)) {
                score += QuestionList.get(i).getDifficulty();
                System.out.println("Correct!");
            } else
                System.out.println("Wrong.\nThe correct answer is: " + QuestionList.get(i).getAnswer());
        }

        System.out.println("Quiz Completed!\nYou got " + Math.max(score, 0) + " out of a possible " + Math.max(difficulty, 0) + " points.\n");

        score = 100 * Math.max(score, 0) / Math.max(difficulty, 1);

        return "Your grade is " + Math.max(score, 0) + "%\n";
    }

    void ResultsPaper() {
        for (int i = 1; i < QuestionList.size(); i++)
            System.out.println("#" + i + ". " + getQuestions(i) + "\nAnswer: " + QuestionList.get(i).getAnswer());

        System.out.println();
    }
}
