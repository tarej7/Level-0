package o;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyTortoise {

	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		String dizzy =
JOptionPane.showInputDialog("How dizzy fo you want your robot, on a scale of 1-10.");
int dizz = Integer.parseInt(dizzy);
 // 1. Use the dance method to make the Tortoise spin.
		 dance(dizz);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			new Robot().turn(360);
			new Robot().sparkle();
		}
	}
}
