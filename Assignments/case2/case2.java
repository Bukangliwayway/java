import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;

public class case2 extends Applet implements ActionListener {
	public void init(){
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		JFormattedTextField firstVal, secondVal, result;
		Button operator[] = new Button[5];
		Button process[] = new Button[3];
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

		firstVal.addActionListener(this);
		secondVal.addActionListener(this);
		result.addActionListener(this);
		//OperatorButtons
		for(int i = 0; i < operator.length; i++){
			operator[i] = new Button(Character.toString(op.charAt(i)));
			this.add(operator[i]);
			if(i<4)operator[i].setBounds(200+(i*75),200, 75, 50);
			else operator[i].setBounds(200,300,300,50);
			operator[i].addActionListener(this);
		}
		//ProcessButtons
		process[0] = new Button("CLEAR");
		process[1] = new Button("ON");
		process[2] = new Button("OFF");
		for(int i = 0; i<process.length; i++){
			this.add(process[i]);
			process[i].setBounds(200+(i*100),400,100,50);
			process[i].addActionListener(this);
		}
	}

	public void actionPerformed(ActionEvent e){
		String clicked = e.getActionCommand();
		switch(clicked.charAt(0)){
			case '+': break;
			case '-': break;
			case '/': break;
			case '*': break;
			case '=': break;
			case 'C': break;
			case 'O': break;
			default: break;
		}
		System.out.println(clicked);
	}

// 	public void paint(Graphics g){
// 	}
}

