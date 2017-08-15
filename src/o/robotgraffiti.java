package o;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
	public static void main(String[] args) {
		Robot bot = new Robot();
		bot.penDown();
		bot.move(150);
		bot.turn(90);
		bot.move(100);
		bot.turn(180);
		bot.move(200);

	}

}
