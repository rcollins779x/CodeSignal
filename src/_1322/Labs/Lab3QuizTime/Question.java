//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab3QuizTime;

class Question {
    private String question, answer;
    private int difficulty;

    //Default Constructor
    Question() {
        this("null","null",0);
    }
    //Overloaded Constructor
    Question(String question, String answer, int difficulty) {
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }

    //Setters
    void setQuestion(String question) {
        this.question = question;
    }
    void setAnswer(String answer) {
        this.answer = answer;
    }
    void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    //Getters
    String getQuestion() {
        return question;
    }
    String getAnswer() {
        return answer;
    }
    int getDifficulty() {
        return difficulty;
    }

    @Override   //toString override
    public String toString() {
        return "Question :\t" + question + "\n" +
                "Answer :\t\t" + answer + "\n" +
                "Difficulty :\t" + difficulty + "\n";
    }
}
