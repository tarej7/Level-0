package o;

import javax.swing.JOptionPane;

public class RiddleMe {

	public static void main(String[] args) {
int score = 0;

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = 
JOptionPane.showInputDialog("What tree can you hold in your hands?");
if(answer.equals("Palm Tree")) {
JOptionPane.showMessageDialog(null,"Correct!");
score++;
}
else {
	JOptionPane.showMessageDialog(null,"Nope, incorrect.");
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, score);
		
	}
}
