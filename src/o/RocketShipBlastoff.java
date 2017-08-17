import javax.swing.JOptionPane;

public class RocketShipBlastoff {
	 
		public static void main(String[] args) {
		
			String time = 
			JOptionPane.showInputDialog("When To Start?");
			int countdown = Integer.parseInt(time);
			
		for(int i = countdown; i > 0; i--) {
			speak(i);
		}
			speak("Blastoff");
			
			
		
			// 2. ask the user when to start (JOptionPane.showInputDialog)
			// 3. convert the user's answer to an int (Integer.parseInt)

			// 4. countdown from user's starting point
			// 1. countdown from 10 to 0

			// 5. when the counting is done, print "blastoff!"
		}

	static void speak(int i) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + i).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	  }
	

	static void speak(String i) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + i).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	  }

}

