package o;
import java.util.Random;

import javax.swing.JOptionPane;

//Copyright Wintriss Technical Schools 2013
public class HiLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.print(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
for (int i = 0; i < 10; i++) {
	
	String Guess = 
			JOptionPane.showInputDialog("Guess a number, 1-100.");
			 int guess = Integer.parseInt(Guess);
			// 5. if the guess is correct
			 if(guess == random) {
				 JOptionPane.showMessageDialog(null,"Your guess is correct!");
			 }
				// 6. win
			if(guess > random) {
				JOptionPane.showMessageDialog(null,"Your guess is higher than the real number...");
			}
			if(guess < random) {
				JOptionPane.showMessageDialog(null,"Your guess is lower than the real number...");
			}
}		
JOptionPane.showMessageDialog(null,"Sorry, but Game Over! The answer was "+random);
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
	}

}

