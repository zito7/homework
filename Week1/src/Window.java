
import java.awt.*;

import javax.swing.*;
public class Window {

	
Window(){
	//instanciation de ma fenetre
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 600);
	fenetre.setTitle("Bienvenue");
	fenetre.setLocationRelativeTo(null);
	fenetre.setVisible(true);
	fenetre.setLayout(null);


	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Creation label et Champ texte
	JLabel lb1 = new JLabel("Entrer un premier nombre:");
	JTextField texte1= new JTextField();
	lb1.setBounds(40, 60, 150, 90);
	
	texte1.setBounds(260,60,100,60);
	fenetre.getContentPane().add(lb1);
	fenetre.getContentPane().add(texte1);
	JLabel lb2 = new JLabel("Entrer un deuxieme nombre:");
	JTextField texte2= new JTextField();
	lb2.setBounds(40, 200, 150, 90);
	texte2.setBounds(80,200,100,60);
	fenetre.getContentPane().add(lb2);
	fenetre.getContentPane().add(texte2);
	


	
	//Creation des boutons
	JButton bt1= new JButton("additionner");
	bt1.setBounds(60,300,100,60);

	fenetre.getContentPane().add(bt1);
	JButton bt2= new JButton("soustraire");
	bt2.setBounds(120,300,100,60);

	fenetre.getContentPane().add(bt2);
	JButton bt3= new JButton("diviser");
	bt3.setBounds(180,300,100,60);

	fenetre.getContentPane().add(bt3);
	JButton bt4= new JButton("multiplier");
	bt3.setBounds(240,300,100,60);

	fenetre.getContentPane().add(bt4);
	
	
	
	
	
}

	

}
