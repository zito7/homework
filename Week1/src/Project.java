
import javax.swing.*;
public class Project {

	public static void main(String[] args) {
		Window screen = new Window();
		 SwingUtilities.invokeLater(new Runnable() {   public void run() {  
			 new Window();  
			 }  
			 });  


	}

}
