//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import exercise1.Test;
import exercise2.Lotto;
import exercise3.Multiply;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //For exercise 1, test class.
        Test test1 = new Test();

        //Starting at 1 instead of 0, because there is no question 0. That would sound weird.
        for (int i = 1; i <= 5; i++) {
            test1.simulateQuestion(i);
            test1.inputAnswer(i);
        }
        test1.calculatePercent();

        JOptionPane.showMessageDialog(null, "Corret answers: " + test1.correctAnswers +
                        " , incorrect answers: " + test1.incorrectAnswers + " , percentage of correct answers: " + test1.calculatePercent());

        //For exercise 2: lottery.
        Lotto lotto1 = new Lotto();
        lotto1.getWinningNumber();
        lotto1.play();

        //For exercise 3: multiple
        System.out.println(Multiply.multiply(5));
        System.out.println(Multiply.multiply(5, 2));
        System.out.println(Multiply.multiply(5, 2, 3));
    }

}

