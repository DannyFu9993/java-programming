import javax.swing.*;
import java.util.Random;

public class Lotto {
    int[] winningNumbers;
    public Lotto(){
        winningNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            //Getting random number for every iteration of the loop
            //Instead of getting the same number 3 times in a row.
            int randomNumber = (int) (Math.random() * 9) + 1 ;
            this.winningNumbers[i] = randomNumber;
            //System.out.println(winningNumbers[i]);
        }
    }
    //To retreive the numbers
    public int getWinningNumber(){
        //add the numbers together for one instance
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += this.winningNumbers[i];
        }
        System.out.println("Winning number: " +  total + "\n");

        return total;
    }

    public void play(){
        //create array to strore the unique values for each attempt.
        int[] winningArray = new int[5];
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int total = lotto.getWinningNumber();
            winningArray[i] += total;
        }
        //To view the winning number for each loop.
        for (int i = 0; i < 5; i++) {
            System.out.println("Winning number for loop["+ i + "]: " + winningArray[i]);
        }

        //This first iteration, it is not in the loop
        String inputString = JOptionPane.showInputDialog(null, "Select your number: ");
        int input = Integer.parseInt(inputString);
        int i = 0;
        //This will loop for 4 timeso, or until the player wins.
        while (i < 5) {
            this.getWinningNumber();
            if (input == winningArray[i]) {
                JOptionPane.showMessageDialog(null, "You win!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Keep trying!");
                i++;
            }
            inputString = JOptionPane.showInputDialog(null, "Select your number: ");
            input = Integer.parseInt(inputString);
        }
        if (i == 5){
            JOptionPane.showMessageDialog(null, "You didn't win, better luck next time!");
        }
    }
}
