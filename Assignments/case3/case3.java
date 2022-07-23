/*<applet code="case3.class" height="685" width="700"></applet> */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.AbstractButton;
import java.text.DecimalFormat;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;

public class case3 extends Applet implements ActionListener{
	int c = 9;
	Label titles[] = new Label[4];
	JCheckBox selection[] = new JCheckBox[c];
	Button inc[] = new Button[c];
	Button dec[] = new Button[c];
	JFormattedTextField quantity[] = new JFormattedTextField[c];
	JFormattedTextField total = new JFormattedTextField();
	DecimalFormat nf = new DecimalFormat("0.00");
	boolean[] selected = new boolean[]{false,false,false,false,false,false,false,false,false};

	public void init(){
		setLayout(null);
		int selectionw = 200, height = 40, marginx = 200, marginy= 100, incdecw=25, quantityw=50;
		Font normal = new Font("Font.arial",Font.BOLD, 20);
		Font small = new Font("Font.arial",Font.PLAIN, 12);
		Font large = new Font("Font.arial",Font.BOLD, 30);

		titles[0] = new Label("Menu Dish", Label.CENTER);
		titles[1] = new Label("Extras");
		titles[2] = new Label("Drinks");
		titles[3] = new Label("PHP", Label.CENTER);
		selection[0] = new JCheckBox("Combo Meal 1 Php 100.00");
		selection[1] = new JCheckBox("Combo Meal 2 Php 120.00");
		selection[2] = new JCheckBox("Combo Meal 3 Php 150.00");
		selection[3] = new JCheckBox("Extra Rice Php  15.00");
		selection[4] = new JCheckBox("Extra Siomai Php  20.00");
		selection[5] = new JCheckBox("Extra Egg Php  10.00");
		selection[6] = new JCheckBox("Coffee Php	 20.00");
		selection[7] = new JCheckBox("Tea Php	 20.00");
		selection[8] = new JCheckBox("Softdrinks Php  15.00");
		titles[0].setFont(large);
		titles[1].setFont(normal);
		titles[2].setFont(normal);
		titles[3].setFont(normal);
		total.setFont(normal);
		titles[0].setBounds(marginx + 50, marginy-80, 200, 75);
		titles[1].setBounds(marginx, 140 + marginy, 150, 50);
		titles[2].setBounds(marginx, 330 + marginy, 150, 50);
		titles[3].setBounds(marginx, 360 + marginy +  height*4, 100, 50);
		total.setBounds(marginx + 100, 360 + marginy + height*4, 200, 50);
		this.add(titles[0]);
		this.add(titles[1]);
		this.add(titles[2]);
		this.add(titles[3]);
		this.add(total);
		total.setHorizontalAlignment(JFormattedTextField.CENTER);
		total.setText(nf.format(0));
		total.setEditable(false);
		
		for(int i = 0; i < c; i++){
			inc[i] = new Button("+");
			dec[i] = new Button("-");
			quantity[i] = new JFormattedTextField("0");
			
			selection[i].setFont(small);
			quantity[i].setHorizontalAlignment(JFormattedTextField.CENTER);
			quantity[i].setEditable(false);

			inc[i].setEnabled(false);
			quantity[i].setEnabled(false);
			dec[i].setEnabled(false);

			inc[i].setActionCommand("+"+i);
			quantity[i].setActionCommand("q"+i);
			dec[i].setActionCommand("-"+i);		
			selection[i].setActionCommand("c"+i);

			selection[i].addActionListener(this);
			inc[i].addActionListener(this);
			// quantity[i].addActionListener(this);
			dec[i].addActionListener(this);

			this.add(selection[i]);
			this.add(inc[i]);
			this.add(quantity[i]);
			this.add(dec[i]);

			//MainDish
			if(i < 3){
				selection[i].setBounds(marginx, marginy+(i*height), selectionw, height);
				inc[i].setBounds(marginx+selectionw, marginy+(i*height), incdecw, height);
				quantity[i].setBounds(marginx+selectionw+incdecw, marginy+(i*height), quantityw, height);
				dec[i].setBounds(marginx+selectionw+incdecw+quantityw, marginy+(i*height), incdecw, height);
			}
			//Extras
			else if(i < 6 && i > 2){
				selection[i].setBounds(marginx, 70+marginy+(i*height), selectionw, height);
				inc[i].setBounds(marginx+selectionw,70+marginy+(i*height), incdecw, height);
				quantity[i].setBounds(marginx+selectionw+incdecw, 70+marginy+(i*height), quantityw, height);
				dec[i].setBounds(marginx+selectionw+incdecw+quantityw, 70+marginy+(i*height), incdecw, height);
			}
			//Drinks
			else {
				selection[i].setBounds(marginx, 140+marginy+(i*height), selectionw, height);
				inc[i].setBounds(marginx+selectionw, 140+marginy+(i*height), incdecw, height);
				quantity[i].setBounds(marginx+selectionw+incdecw, 140+marginy+(i*height), quantityw, height);
				dec[i].setBounds(marginx+selectionw+incdecw+quantityw, 140+marginy+(i*height), incdecw, height);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		String clicked = e.getActionCommand();
		int[] prices = new int[]{100, 120, 150, 15, 20, 10, 20, 20, 15};
		int index = Integer.parseInt(String.valueOf(clicked.charAt(1)));
		int net = 0;
	
		switch(clicked.charAt(0)){
			case 'c': 
				//Activate and Deactivate Buttons 
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				boolean state = abstractButton.getModel().isSelected();
				inc[index].setEnabled(state);
				quantity[index].setEnabled(state);
				//Set Quantity to 1 or 0
				if(state)quantity[index].setText("1");
				else quantity[index].setText("0");
				//Activate Selected Product
				selected[index] = state;
			break;
			case '+': 
				//Increment the called Quantity Index
				quantity[index].setText(Integer.toString(Integer.parseInt(quantity[index].getText())+1));
				if(Integer.parseInt(quantity[index].getText()) > 1) dec[index].setEnabled(true); 	//Summ bug fix
			break;
			case '-':
				//Decrement the called Quantity Index
				quantity[index].setText(Integer.toString(Integer.parseInt(quantity[index].getText())-1));
				dec[index].setEnabled(true); 
				//Blocks if it quantity is 1 already 
				if(Integer.parseInt(quantity[index].getText()) < 2)dec[index].setEnabled(false); 
			break;
		}
		//Update Total For Every Selected Price
		for(int i = 0 ; i < c; i++) if(selected[i]) net += prices[i]*Integer.parseInt(quantity[i].getText());
		total.setText(nf.format(net));
	}
}
