package Calculator;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.Expression;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Calculator.GUI.window;

public class button implements MouseListener {

	Color grey = new Color(128, 128, 128);
	protected JTextField print = new JTextField();
      

		

	protected JButton button1 = new JButton("1");
	protected JButton button2 = new JButton("2");
	protected JButton button3 = new JButton("3");
	protected JButton button4 = new JButton("4");
	protected JButton button5 = new JButton("5");
	protected JButton button6 = new JButton("6");
	protected JButton button7 = new JButton("7");
	protected JButton button8 = new JButton("8");
	protected JButton button9 = new JButton("9");
	protected JButton button0 = new JButton("0");
	protected JButton buttonP = new JButton("+");
	protected JButton buttonM = new JButton("-");
	protected JButton buttonT = new JButton("*");
	protected JButton buttonD = new JButton("/");
	protected JButton buttonE = new JButton("=");
	protected JButton buttonAC = new JButton("AC");
	protected JButton buttonC = new JButton("C");
	protected JButton buttonDP = new JButton("."); // desatinna carka

	public void button() {
		int bwidth = 100;
		int bheight = 50;
		

		button1.setBounds(20, 190, bwidth, bheight);
		button2.setBounds(130, 190, bwidth, bheight);
		button3.setBounds(240, 190, bwidth, bheight);
		button4.setBounds(20, 260, bwidth, bheight);
		button5.setBounds(130, 260, bwidth, bheight);
		button6.setBounds(240, 260, bwidth, bheight);
		button7.setBounds(20, 330, bwidth, bheight);
		button8.setBounds(130, 330, bwidth, bheight);
		button9.setBounds(240, 330, bwidth, bheight);
		button0.setBounds(130, 400, bwidth, bheight);
		buttonP.setBounds(350, 120, bwidth, bheight);
		buttonM.setBounds(350, 190, bwidth, bheight);
		buttonT.setBounds(350, 260, bwidth, bheight);
		buttonD.setBounds(350, 330, bwidth, bheight);
		buttonE.setBounds(350, 400, bwidth, bheight);
		buttonAC.setBounds(20, 120, 210, bheight);
		buttonC.setBounds(240, 120, bwidth, bheight);
		buttonDP.setBounds(240, 400, bwidth, bheight);

		button0.setBackground(grey);
		button1.setBackground(grey);
		button2.setBackground(grey);
		button3.setBackground(grey);
		button4.setBackground(grey);
		button5.setBackground(grey);
		button6.setBackground(grey);
		button7.setBackground(grey);
		button8.setBackground(grey);
		button9.setBackground(grey);
		buttonP.setBackground(grey);
		buttonM.setBackground(grey);
		buttonT.setBackground(grey);
		buttonD.setBackground(grey);
		buttonE.setBackground(grey);
		buttonAC.setBackground(grey);
		buttonC.setBackground(grey);
		buttonDP.setBackground(grey);

		button0.addMouseListener(this);
		button1.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button4.addMouseListener(this);
		button5.addMouseListener(this);
		button6.addMouseListener(this);
		button7.addMouseListener(this);
		button8.addMouseListener(this);
		button9.addMouseListener(this);
		buttonP.addMouseListener(this);
		buttonM.addMouseListener(this);
		buttonT.addMouseListener(this);
		buttonD.addMouseListener(this);
		buttonE.addMouseListener(this);
		buttonAC.addMouseListener(this);
		buttonC.addMouseListener(this);
		buttonDP.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == button0) {
			print.setText(print.getText() + button0.getText());
		}
		if (e.getSource() == button1) {
			print.setText(print.getText() + button1.getText());
		}
		if (e.getSource() == button2) {
			print.setText(print.getText() + button2.getText());
		}
		if (e.getSource() == button3) {
			print.setText(print.getText() + button3.getText());
		}
		if (e.getSource() == button4) {
			print.setText(print.getText() + button4.getText());
		}
		if (e.getSource() == button5) {
			print.setText(print.getText() + button5.getText());
		}
		if (e.getSource() == button6) {
			print.setText(print.getText() + button6.getText());
		}
		if (e.getSource() == button7) {
			print.setText(print.getText() + button7.getText());
		}
		if (e.getSource() == button8) {
			print.setText(print.getText() + button8.getText());
		}
		if (e.getSource() == button9) {
			print.setText(print.getText() + button9.getText());
		}
		if (e.getSource() == buttonP) {
			print.setText(print.getText() + buttonP.getText());
		}
		if (e.getSource() == buttonM) {
			print.setText(print.getText() + buttonM.getText());
		}
		if (e.getSource() == buttonT) {
			print.setText(print.getText() + buttonT.getText());
		}
		if (e.getSource() == buttonD) {
			print.setText(print.getText() + buttonD.getText());
		}
		if (e.getSource() == buttonE) {
			
			
		
		
			
			
			
		}
		if (e.getSource() == buttonAC) {
			print.setText("");
		}
		if (e.getSource() == buttonC) {
			print.setText(print.getText() );
		}
		if (e.getSource() == buttonDP) {
			print.setText(print.getText() + buttonDP.getText());
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
