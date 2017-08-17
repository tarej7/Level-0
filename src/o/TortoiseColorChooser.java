import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
	for(;true;)	{
	String color = 
		JOptionPane.showInputDialog("What color would you like the tortoise to draw with?");
		if(color.equalsIgnoreCase ("red")) {
			Tortoise.setPenColor(Color.red);
		}
		else if(color.equalsIgnoreCase ("green")) {
        	Tortoise.setPenColor(Color.green);
        }
       
        else if(color.equalsIgnoreCase ("blue")) {
        	Tortoise.setPenColor(Color.blue);
        }

        else {
            int r = new Random().nextInt (255);
            int g = new Random().nextInt (255);
            int b = new Random().nextInt (255);
        	Tortoise.setPenColor(new Color(r,g,b));
        }
	
Tortoise.setSpeed(10);
		//3. ask the user what color they would like the tortoise to draw
		
		//4. use an if/else statement to set the pen color that the user requested

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		String Sides = 
		JOptionPane.showInputDialog("How Many Sides for your shape?");
	//1. make the tortoise draw a shape (this will take more than one line of code)
		int sides = 4; 
		sides = Integer.parseInt(Sides);
		for(int i = 0; i < sides; i++) {
			Tortoise.move(100);
			Tortoise.turn(360/sides);
			
	

		}
Tortoise.turn(1);
	
}
}
}

