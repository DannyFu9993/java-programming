package exercise2;

import javax.swing.*;


public class Lotto {
    int[] winningNumbers;

    public Lotto() {
        winningNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            //Getting random number for every iteration of the loop
            //Instead of getting the same number 3 times in a row.
            int randomNumber = (int) (Math.random() * 9) + 1;
            this.winningNumbers[i] = randomNumber;
            //System.out.println(winningNumbers[i]);
        }
    }

    //To retreive the numbers
    public int getWinningNumber() {
        //add the numbers together for one instance
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += this.winningNumbers[i];
        }
        System.out.println("Winning number: " + total + "\n");

        return total;
    }

    //Start playing
    public void play() {
        //create array to strore the unique values for each attempt.
        int[] winningArray = new int[5];
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int total = lotto.getWinningNumber();
            winningArray[i] += total;
        }
        //To view the winning number for each loop.
        for (int i = 0; i < 5; i++) {
            System.out.println("Winning number for loop[" + i + "]: " + winningArray[i]);
        }


        int i = 0;
        //This first iteration, it is not in the loop
        System.out.println("Loop iteration: " + i);
        int inputLotto = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer:"));
        //int input = Integer.parseInt(inputLotto);
        //This will loop for 4 times (since the player already did the first iteration, assuming they didn't win), or until the player wins.
        while (i < 5) {
            //When the player picks a winning number
            if (inputLotto == winningArray[i]) {
                JOptionPane.showMessageDialog(null, "You win!");
                break;
                //When the player didn't pick a winning number
            } else {
                JOptionPane.showMessageDialog(null, "Keep trying!");
                i++;
                System.out.println("Loop iteration: " + i);
            }
            //Play again
            inputLotto = Integer.parseInt(JOptionPane.showInputDialog(null, "Select your number: "));
        }

        //After 5 fail attempts, display this message.
        if (i == 5) {
            JOptionPane.showMessageDialog(null, "You didn't win, better luck next time!");
        }

        //JOptionPane.showMessageDialog(null, "You left the input blank," +
        //" or entered something else other than number. Please enter a number.");


    }
}

