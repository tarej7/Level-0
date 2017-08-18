package o;
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickel = 
JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(Nickel);
		// Ask the user how many dimes they have, and convert their answer
String Dime = 
JOptionPane.showInputDialog("And how many dimes do you have?");
int dimes = Integer.parseInt(Dime);
		// Ask the user how many quarters they have, and convert their answer
String Quarter =
JOptionPane.showInputDialog("And how many quarters do you have?");
int quarters = Integer.parseInt(Quarter);
		// Calculate how much money the user has and save it in a double variable 
double Change = (nickels * .05) + (dimes * .10) + (quarters * .25);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, Change);
	}
}
