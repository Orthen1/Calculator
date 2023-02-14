package Calculator.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Calculator.button;

public class window extends button {

	Color black = new Color(213, 213, 213);
	JFrame frame = new JFrame("Calculator");
	Container cont;

	public void okno() {

		

		int fwidth = 490;
		int fheight = 524;

		cont = frame.getContentPane();
		cont.setLayout(null);
		frame.setResizable(false);

		frame.setSize(fwidth, fheight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button();

		print.setBounds(20, 10, 430, 100);
		print.setBackground(black);

		cont.add(button1);
		cont.add(button2);
		cont.add(button3);
		cont.add(button4);
		cont.add(button5);
		cont.add(button6);
		cont.add(button7);
		cont.add(button8);
		cont.add(button9);
		cont.add(button0);
		cont.add(buttonP);
		cont.add(buttonM);
		cont.add(buttonT);
		cont.add(buttonD);
		cont.add(buttonE);
		cont.add(buttonAC);
		cont.add(buttonC);
		cont.add(buttonDP);
		cont.add(print);

		frame.setVisible(true);

		
	}

}