import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class case2 extends Applet implements ActionListener {
	public void init(){
		setBackground(Color.white);
		setLayout(null);
		TextField firstVal, secondVal, result;
		Button operator[] = new Button[5];
		Button process[] = new Button[3];
		String op = "+-*/=";
		//TextFields
		firstVal = new TextField();
		this.add(firstVal);
		firstVal.setBounds(200, 150, 300, 50);
		secondVal = new TextField();
		this.add(secondVal);
		secondVal.setBounds(200, 250, 300, 50);
		result = new TextField();
		this.add(result);
		result.setBounds(200, 350, 300, 50);
		//OperatorButtons
		for(int i = 0; i < operator.length; i++){
			operator[i] = new Button(Character.toString(op.charAt(i)));
			this.add(operator[i]);
			if(i<4)operator[i].setBounds(200+(i*75),200, 75, 50);
			else operator[i].setBounds(200,300,300,50);
		}
		//ProcessButtons
		process[0] = new Button("CLEAR");
		process[1] = new Button("ON");
		process[2] = new Button("OFF");
		for(int i = 0; i<process.length; i++){
			process[i].setBounds(200+(i*100),400,100,50);
			this.add(process[i]);
		}
		
	}

	public void actionPerformed(ActionEvent e){
		String button = e.getActionCommand();

	}

}

