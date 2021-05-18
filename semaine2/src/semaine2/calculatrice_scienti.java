package semaine2;
import java.awt.*;

import javax.swing.*;
public class calculatrice_scienti {
	calculatrice_scienti(){
		//instanciation de ma fenetre
		JFrame window = new JFrame();
		window.setTitle("Calculatrice");
		window.setSize(500, 700);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Creation du champ de texte
		JTextField texte1= new JTextField();
		texte1.setBounds(0,0,500,130);
		window.getContentPane().add(texte1);
		

		//Creation des boutons
		JButton bt1= new JButton("+");
		bt1.setBounds(40,300,100,60);
		window.getContentPane().add(bt1);

	

	

}
}