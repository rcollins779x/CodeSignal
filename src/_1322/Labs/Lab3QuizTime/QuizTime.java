//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab3QuizTime;

import java.util.Scanner;

class QuizTime {
    public static void main(String[] args) {
        String question, answer;
        int menu, choice, modify, difficulty = -1;

        Scanner scan = new Scanner(System.in);
        Quiz quiz = new Quiz();                             //object created via default constructor
        for (int i = 0; i < 11; i++)                        //objects created via overloaded constructor
            quiz.QuestionList.add(new Question("Question" + i + "?", "Answer" + i, i));

        do {
            System.out.println("0. Exit");
            System.out.println("1. Add a question");
            System.out.println("2. Display questions");
            System.out.println("3. Delete/Modify a question");
            System.out.println("4. Take the Quiz");
            System.out.println("5. View Answer Sheet");
            menu = scan.nextInt(); scan.nextLine();

            switch (menu) {
                case 1 : {                                  //Add a question
                    System.out.println("Enter new question.");
                    question = scan.nextLine();

                    System.out.println("Enter the answer.");
                    answer = scan.nextLine();

                    System.out.println("Enter the difficulty");
                    difficulty = scan.nextInt(); scan.nextLine();

                    System.out.println("0. Go back without saving.");
                    System.out.println("1. Save question to quiz.");
                    choice = scan.nextInt(); scan.nextLine();
                    if (choice == 0) break;

                    quiz.Add(question, answer, difficulty);
                }
                case 2 : {                                 //Display questions
                    for (int i = 1; i < quiz.QuestionList.size(); i++)
                        System.out.println("#" + i + ". " + quiz.getQuestions(i));
                    if(quiz.QuestionList.size() == 1) System.out.println("The quiz is empty. Please add a new question.");
                    System.out.println();
                }
                case 3 : {                                 //Delete/Modify a question
                    for (int i = 1; i < quiz.QuestionList.size(); i++)
                        System.out.println("#" + i + ". " + quiz.QuestionList.get(i));
                    do {
                        System.out.println("0. Go back.");
                        System.out.println("What question number do you want to modify?");
                        modify = scan.nextInt(); scan.nextLine();

                        if (modify >= quiz.QuestionList.size())
                            System.out.println("Question not found. Please try again.");
                    } while (modify >= quiz.QuestionList.size());

                    if (modify == 0) break;
                    System.out.println("#" + modify + ". " + quiz.QuestionList.get(modify));

                    System.out.println("0. Go back.");
                    System.out.println("1. Remove question from Quiz.");
                    System.out.println("2. Replace the question.");
                    System.out.println("3. Replace the answer.");
                    System.out.println("4. Replace the difficulty.");
                    choice = scan.nextInt(); scan.nextLine();

                    switch (choice) {
                        case 1 : quiz.Remove(modify);
                        case 2 : {
                            System.out.println("Enter new question for #" + modify);
                            question = scan.nextLine();
                            quiz.Modify(modify, question, null, difficulty);
                        }
                        case 3 : {
                            System.out.println("Enter new answer for #" + modify);
                            answer = scan.nextLine();
                            quiz.Modify(modify, null, answer, difficulty);
                        }
                        case 4 : {
                            System.out.println("Enter new difficulty for #" + modify);
                            difficulty = scan.nextInt();
                            scan.nextLine();
                            quiz.Modify(modify, null, null, difficulty);
                        }
                    }
                }
                case 4 : {
                    System.out.println("The quiz will start now.");
                    System.out.println(quiz.QuizGive());
                }
                case 5 : quiz.ResultsPaper();               //Answer Sheet
            }
        }while (menu != 0);
        scan.close();
    }
}
