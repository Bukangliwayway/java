/*<applet code="case1.class", width="700", height="700"></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class case1 extends Applet implements ActionListener {
	JFormattedTextField height, weight;
  DecimalFormat nf = new DecimalFormat("##.###");
  int top = 150, right = 200, fullwidht=500;
  public void init(){
    setBackground(Color.darkGray);
    setLayout(null);
    Label lheight = new Label("Height in Meters       : ");
    Label lweight = new Label("Weight in Kilograms : ");
    Button compute = new Button("Compute BMI");
    Font font = new Font("Font.arial",Font.BOLD, 15);
    height = new JFormattedTextField(NumberFormat.getNumberInstance());
    weight = new JFormattedTextField(NumberFormat.getNumberInstance());
    this.add(height);
    this.add(weight);
    this.add(lweight);
    this.add(lheight);
    this.add(compute);

    //Background and Foreground Color
    height.setBackground(Color.lightGray);
    weight.setBackground(Color.lightGray);
    compute.setBackground(Color.black);

    height.setForeground(Color.black);
    weight.setForeground(Color.black);

    lheight.setForeground(Color.white);
    lweight.setForeground(Color.white);
    compute.setForeground(Color.white);
    
    //Text Alignment
    height.setHorizontalAlignment(JFormattedTextField.CENTER);
    weight.setHorizontalAlignment(JFormattedTextField.CENTER);
    
    lheight.setFont(font);
    lweight.setFont(font);
    height.addActionListener(this);
    weight.addActionListener(this); 
    compute.addActionListener(this); 

      //SetBounds : weight, height, lweight, lheight
    lweight.setBounds(150,250,300,50);
    lheight.setBounds(150,320,300,50);
    weight.setBounds(320, 250, 200, 50);
    height.setBounds(320, 320, 200, 50);
    compute.setBounds(290, 400, 100, 50);
  }

  public void actionPerformed(ActionEvent e){
    String clicked = e.getActionCommand(), msg;
    double bmi;
    if(clicked.charAt(0) == 'C' && !weight.getText().equals("") && !height.getText().equals("")){
      bmi = Double.parseDouble(weight.getText())/Math.pow(Double.parseDouble(height.getText()),2);
      if(bmi > 20) msg = "You have to lose some gains! You need to EXERCISE and have a HEALTHY DIET!";
      else if(bmi < 20) msg = "You’re under weight, eat and gain some weight!";
      else msg = "Congratulations for having a healthy weight!";
      JOptionPane.showMessageDialog(null, "Your BMI is " + nf.format(bmi) + "\n" + msg);
    }
  }
}
