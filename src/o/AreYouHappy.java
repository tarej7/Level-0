package o;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		int AreYouHappy =
				JOptionPane.showConfirmDialog(null, "Are you happy?");
		if(AreYouHappy == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		else if(AreYouHappy == JOptionPane.NO_OPTION) {
			int AreYouHappy2 = 
			JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
	if(AreYouHappy2 == JOptionPane.YES_OPTION) {
		JOptionPane.showMessageDialog(null, "You should change something.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing then.");
	}
	

		}
	}

}
