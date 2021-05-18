package semaine2;
import javax.swing.*;

public class Playbook {

	public static void main(String[] args) {
		calculatrice_scienti screen = new calculatrice_scienti();
		 SwingUtilities.invokeLater(new Runnable() {   public void run() {  
			 new calculatrice_scienti();  
			 }  
			 });  
	}

}
