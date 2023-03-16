package Calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField textField = new JTextField();
	JButton[] numButton = new JButton[10];
	JButton[] actButton = new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JPanel panel;

	double num1 = 0, num2 = 0, result = 0;
	char op;

	Calculator() {

		Container pkg;
		Color bg = new Color(201, 201, 201);
		JFrame frame = new JFrame("Calculator");

		int buttonWidht = 100;
		int buttonHight = 50;
		int frameWidth = 440;
		int frameHight = 620;

		textField.setBounds(10, 10, 400, 50);
		textField.setEditable(false);

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("C");
		clrButton = new JButton("AC");
		negButton = new JButton("(-)");

		actButton[0] = addButton;
		actButton[1] = subButton;
		actButton[2] = mulButton;
		actButton[3] = divButton;
		actButton[4] = decButton;
		actButton[5] = equButton;
		actButton[6] = delButton;
		actButton[7] = clrButton;
		actButton[8] = negButton;

		for (int j = 0; j < 9; j++) {
			actButton[j].addActionListener(this);
			actButton[j].setFocusable(false);

		}

		for (int i = 0; i < 10; i++) {
			numButton[i] = new JButton(String.valueOf(i));
			numButton[i].setSize(buttonWidht, buttonHight);
			numButton[i].addActionListener(this);
			numButton[i].setFocusable(false);

		}

		frame.setSize(frameWidth, frameHight);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		pkg = frame.getContentPane();
		pkg.setBackground(bg);

		negButton.setBounds(50, 430, 100, 50);
		delButton.setBounds(150, 430, 100, 50);
		clrButton.setBounds(250, 430, 100, 50);

		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setBackground(bg);
		panel.setLayout(new GridLayout(4, 4, 10, 10));

		panel.add(numButton[1]);
		panel.add(numButton[2]);
		panel.add(numButton[3]);
		panel.add(addButton);
		panel.add(numButton[4]);
		panel.add(numButton[5]);
		panel.add(numButton[6]);
		panel.add(subButton);
		panel.add(numButton[7]);
		panel.add(numButton[8]);
		panel.add(numButton[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numButton[0]);
		panel.add(equButton);
		panel.add(divButton);

		pkg.add(panel);
		pkg.add(negButton);
		pkg.add(delButton);
		pkg.add(clrButton);
		pkg.add(textField);
		pkg.setVisible(true);

	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {

			if (e.getSource() == numButton[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == decButton) {
			textField.setText(textField.getText().concat("."));
		}
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			op = '+';
			textField.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(textField.getText());
			op = '-';
			textField.setText("");
		}
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(textField.getText());
			op = '*';
			textField.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textField.getText());
			op = '/';
			textField.setText("");
		}
		if(e.getSource() == equButton) {
			num2 = Double.parseDouble(textField.getText());
			switch (op) {
			case '+': {
				
				result = num1 + num2;
				break;
				
			}
			case '-': {
				result = num1 - num2;
				break;
			}
			case '*': {
				result = num1*num2;
				break;
			}
			case'/':{
				result = num1/num2;
				break;
			}
		
			}
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource() == clrButton) {
			num1 = 0;
			textField.setText("");

}
		if(e.getSource() == delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i = 0; i < string.length()-1; i++){
						textField.setText(textField.getText()+string.charAt(i));
			
		}
		
}
		if(e.getSource() == negButton) {
		double tmp = Double.parseDouble(textField.getText());
		tmp *= -1;
		textField.setText(String.valueOf(tmp));
		}
	}}