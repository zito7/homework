package semaine2;
import java.awt.*;
import java.awt.*;

import javax.swing.*;
public class calculatrice_scienti {
	calculatrice_scienti(){
		//instanciation de ma fenetre
		JFrame window = new JFrame();
		window.setTitle("Calculatrice");
		window.setSize(500, 750);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Creation du champ de texte
		JTextField texte1= new JTextField();
		texte1.setBounds(0,0,500,150);
		window.getContentPane().add(texte1);
		

		//Creation des boutons
		JButton bt1= new JButton("7");
		bt1.setBounds(0,150,125,150);
		window.getContentPane().add(bt1);
		JButton bt2= new JButton("8");
		bt2.setBounds(125,150,125,150);
		window.getContentPane().add(bt2);
		JButton bt3= new JButton("9");
		bt3.setBounds(250,150,125,150);
		window.getContentPane().add(bt3);
		JButton bt4= new JButton("Delete");
		bt4.setBounds(375,150,125,150);
		window.getContentPane().add(bt4);
		JButton bt5= new JButton("4");
		bt5.setBounds(0,300,125,150);
		window.getContentPane().add(bt5);
		JButton bt6= new JButton("5");
		bt6.setBounds(125,300,125,150);
		window.getContentPane().add(bt6);
		JButton bt7= new JButton("6");
		bt7.setBounds(250,300,125,150);
		window.getContentPane().add(bt7);
		JButton bt8= new JButton("/");
		bt8.setBounds(375,300,125,150);
		window.getContentPane().add(bt8);
		JButton bt9= new JButton("1");
		bt9.setBounds(0,450,125,150);
		window.getContentPane().add(bt9);
		JButton bt10= new JButton("2");
		bt10.setBounds(125,450,125,150);
		window.getContentPane().add(bt10);
		JButton bt11= new JButton("3");
		bt11.setBounds(250,450,125,150);
		window.getContentPane().add(bt11);
		JButton bt12= new JButton("*");
		bt12.setBounds(375,450,125,150);
		window.getContentPane().add(bt12);
		JButton bt13= new JButton("0");
		bt13.setBounds(0,600,125,150);
		window.getContentPane().add(bt13);
		JButton bt14= new JButton(".");
		bt14.setBounds(125,600,125,150);
		window.getContentPane().add(bt14);
		JButton bt15= new JButton("=");
		bt15.setBounds(250,600,125,150);
		window.getContentPane().add(bt15);
		JButton bt16= new JButton("-");
		bt16.setBounds(375,675,125,75);
		window.getContentPane().add(bt16);
		JButton bt17= new JButton("+");
		bt17.setBounds(375,600,125,75);
		window.getContentPane().add(bt17);
		

	

	

}
}