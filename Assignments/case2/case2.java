import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;

public class case2 extends Applet implements ActionListener {
	JFormattedTextField firstVal, secondVal, result;
	DecimalFormat nf = new DecimalFormat("##.###");
	Button process[] = new Button[2];
	Button operator[] = new Button[5];
	String res = "0";

	public void init(){
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		String op = "+-*/=";
		//TextFields
		firstVal = new JFormattedTextField(NumberFormat.getNumberInstance());
		secondVal = new JFormattedTextField(NumberFormat.getNumberInstance());
		result = new JFormattedTextField(NumberFormat.getNumberInstance());
		firstVal.setBounds(200, 150, 300, 50);
		secondVal.setBounds(200, 250, 300, 50);
		result.setBounds(200, 350, 300, 50);
		this.add(firstVal);
		this.add(secondVal);
		this.add(result);
		//Colored Input
		firstVal.setBackground(Color.lightGray);
		secondVal.setBackground(Color.lightGray);
		result.setBackground(Color.lightGray);
		//Centered Input
		firstVal.setHorizontalAlignment(JFormattedTextField.CENTER);
		secondVal.setHorizontalAlignment(JFormattedTextField.CENTER);
		result.setHorizontalAlignment(JFormattedTextField.CENTER);
		//Action Listener
		firstVal.addActionListener(this);
		secondVal.addActionListener(this);
		result.addActionListener(this);
		//Set to 0
		firstVal.setText("0");
		secondVal.setText("0");
		result.setText("0");
		//Disable Actions
		firstVal.setEnabled(false);
		secondVal.setEnabled(false);
		result.setEnabled(false);

		//OperatorButtons
		for(int i = 0; i < operator.length; i++){
			operator[i] = new Button(Character.toString(op.charAt(i)));
			this.add(operator[i]);
			if(i<4)operator[i].setBounds(200+(i*75),200, 75, 50);
			else operator[i].setBounds(200,300,300,50);
			operator[i].addActionListener(this);
			operator[i].setEnabled(false);
		}
		//ProcessButtons
		process[0] = new Button("CLEAR");
		process[0].setEnabled(false);
		process[1] = new Button("ON");
		for(int i = 0; i<process.length; i++){
			this.add(process[i]);
			process[i].setBounds(200+(i*150),400,150,50);
			process[i].addActionListener(this);
		}
	}

	public void actionPerformed(ActionEvent e){
		String clicked = e.getActionCommand();
		switch(clicked.charAt(0)){
			case '+':
				res = nf.format(Double.parseDouble(firstVal.getText()) + Double.parseDouble(secondVal.getText()));
			break;
			case '-':
				res = nf.format(Double.parseDouble(firstVal.getText()) - Double.parseDouble(secondVal.getText()));
			break;
				case '/':
				res = nf.format(Double.parseDouble(firstVal.getText()) / Double.parseDouble(secondVal.getText()));
			break;
				case '*': 
				res = nf.format(Double.parseDouble(firstVal.getText()) * Double.parseDouble(secondVal.getText()));
			break;
			case '=': 
				result.setText(res);
			break;
			case 'C': 
				res = "0";
				firstVal.setText(res);
				secondVal.setText(res);
				result.setText(res);
			break;
			case 'O':
				if(process[1].getLabel().equalsIgnoreCase("ON"))process[1].setLabel("OFF");				
				else process[1].setLabel("ON");
				process[0].setEnabled(process[1].getLabel().equalsIgnoreCase("OFF"));
				for(int i = 0; i < operator.length; i++) operator[i].setEnabled(process[1].getLabel().equalsIgnoreCase("OFF"));
				firstVal.setEnabled(process[1].getLabel().equalsIgnoreCase("OFF"));
				secondVal.setEnabled(process[1].getLabel().equalsIgnoreCase("OFF"));
				result.setEnabled(process[1].getLabel().equalsIgnoreCase("OFF"));
				if(process[1].getLabel().equalsIgnoreCase("OFF")){
					res = "0";
					firstVal.setText(res);
					secondVal.setText(res);
					result.setText(res);
				}
		}
	}
}

