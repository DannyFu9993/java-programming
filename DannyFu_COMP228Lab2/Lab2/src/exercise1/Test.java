package exercise1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.util.Random;


public class Test {
    //Made these variables public so it can be accessed outside
    public double correctAnswers = 0;
    public double incorrectAnswers = 0;
    public double percentageOfCorrectAnswers = 0;

    //This is called at the final step. It will take number of correct answers and divide it by 5, then multiplies by 100 for the percentage.
    public String calculatePercent() {
        percentageOfCorrectAnswers = (correctAnswers / 5) * 100;
        return percentageOfCorrectAnswers + "%";
    }

    //First one is left blank because test starts at question 1, not 0.
    String[] questions = {"", "How do you declare a string array?",
            "Which data type allows for numbers with decimals?",
            "Which of the following Java program units defines a group of related objects?",
            "Methods of the same name can be declared in the same class, what is it called?",
            "A ____ method is a method that is associated with the class in which it is defined rather than with any object."
    };
    //2D array. First one is left blank because test starts at question 1, not 0. It is 2D because there are multiple answers per question.
    String[][] answers = {
            {},
            {"String[] myString = {}", "string[] myString = {}", "String{} myString =[]", "Sting[]"},  //question 1, correct is 1
            {"int", "double", "string", "char"},                //question 2, correct is 2
            {"Method", "Strings", "Classes", "Inheritance"},        //question 3, correct is 3
            {"Parameters", "inheritance", "Method overloading", "Function"}, // Question 4, correct is 3
            {"inheritance", "Overloaded", "void", "static"}         //Question 5, correct is 4
    };

    String[] correctAnswer = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
    String[] wrongAnswer = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying"};

    Random randomObject = new Random();

    public void simulateQuestion(int questionNumber) {
        JOptionPane.showMessageDialog(null, questions[questionNumber],
                "Question " + questionNumber + ": ", JOptionPane.INFORMATION_MESSAGE);

    }

    public void generateMessage(String correctOrWrong) {
        //To randomise the output of the correctAnswer or wrongAnswer array.
        int randomNumber = (int) (Math.random() * 4);

        //Depending on what string was passed by the checkAnswer method, it will give eitehr a correct or wrong message.
        switch (correctOrWrong) {
            case "correct":
                JOptionPane.showMessageDialog(null, correctAnswer[randomNumber]);
                break;
            case "wrong":
                JOptionPane.showMessageDialog(null, wrongAnswer[randomNumber]);
                break;
        }
        System.out.println("Input in checkAnswer method: ");
        System.out.println("Random feedback: " + correctAnswer[randomNumber]);
    }

    public void checkAnswer(int answerInput, int questionNumber) {
        //The isCorrect boolean will be false by default, it can only be changed to true when it matches the answer.
        boolean isCorrect = false;

        // The correct answer based on the question number will make the isCorrect boolean true.
        switch (questionNumber) {
            case 1:
                isCorrect = (answerInput == 1);
                break;
            case 2:
                isCorrect = (answerInput == 2);
                break;
            case 3:
                isCorrect = (answerInput == 3);
                break;
            case 4:
                isCorrect = (answerInput == 3);
                break;
            case 5:
                isCorrect = (answerInput == 4);
                break;
//          default:
//                        isCorrect = false;
        }

        //When the answer is correct then the string "correct" gets passed into generateMessage method.
        if (isCorrect) {
            this.correctAnswers++;
            generateMessage("correct");

        }
        //When the answer is wrong, the string wrong will get passed into generateMessage method.
        else {
            this.incorrectAnswers++;
            generateMessage("wrong");
        }
    }

    public void inputAnswer(int questionNumber) {
        //Retrieve the answers dynamically
        String[] selectedAnswers = answers[questionNumber];

        // Display the possible answers to the user and prompt for input

        String input = JOptionPane.showInputDialog(null,
                questions[questionNumber] +
                        "\n1: " + selectedAnswers[0] +
                        "\n2: " + selectedAnswers[1] +
                        "\n3: " + selectedAnswers[2] +
                        "\n4: " + selectedAnswers[3]
        );
        checkAnswer(Integer.parseInt(input), questionNumber);
        System.out.println("User input: " + input);


    }

}


