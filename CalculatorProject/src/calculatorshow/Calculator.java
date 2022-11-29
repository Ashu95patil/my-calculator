package calculatorshow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JTextArea textarea=new JTextArea(2,10);
JButton Button1=new JButton();
JButton Button2=new JButton();
JButton Button3=new JButton();
JButton Button4=new JButton();
JButton Button5=new JButton();
JButton Button6=new JButton();
JButton Button7=new JButton();
JButton Button8=new JButton();
JButton Button9=new JButton();
JButton Button0=new JButton();


JButton Buttonadd=new JButton();
JButton Buttonmul=new JButton();
JButton Buttondiv=new JButton();
JButton Buttonsub=new JButton();
JButton Buttonclear=new JButton();
JButton Buttondot=new JButton();
JButton Buttonequal=new JButton();

double number1,number2,result;
int add=0,mul=0,div=0,sub=0;
public Calculator()
{
	frame.setSize(340,450);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setTitle("Ashwinis Calculator");
	//frame.setResizable(false);
	frame.add(panel);
	panel.setBackground(Color.LIGHT_GRAY);
	Border border=BorderFactory.createLineBorder(Color.RED,4);
	panel.add(textarea);
	textarea.setBackground(Color.BLACK);
	Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
	textarea.setBorder(tborder);
	Font font=new Font("arial",Font.BOLD,33);
	textarea.setFont(font);
	textarea.setForeground(Color.WHITE);
	textarea.setPreferredSize(new Dimension(2,10));
	textarea.setLineWrap(true);
	
	Button1.setPreferredSize(new Dimension(100,40));
	Button1.setIcon(new ImageIcon("\\1\\Button1.png"));
	
	Button2.setPreferredSize(new Dimension(100,40));
	Button2.setIcon(new ImageIcon("\\2\\Button2.png"));

	Button3.setPreferredSize(new Dimension(100,40));
	Button3.setIcon(new ImageIcon("\\3\\Button3.png"));

	Button4.setPreferredSize(new Dimension(100,40));
	Button4.setIcon(new ImageIcon("\\4\\Button4.png"));

	Button5.setPreferredSize(new Dimension(100,40));
	Button5.setIcon(new ImageIcon("\\5\\Button5.png"));

	Button6.setPreferredSize(new Dimension(100,40));
	Button6.setIcon(new ImageIcon("\\6\\Button6.png"));

	Button7.setPreferredSize(new Dimension(100,40));
	Button7.setIcon(new ImageIcon("\\7\\Button7.png"));

	Button8.setPreferredSize(new Dimension(100,40));
	Button8.setIcon(new ImageIcon("\\8\\Button8.png"));
	
	Button9.setPreferredSize(new Dimension(100,40));
	Button9.setIcon(new ImageIcon("\\9\\Button9.png"));

	Button0.setPreferredSize(new Dimension(100,40));
	Button0.setIcon(new ImageIcon("\\0\\Button0.png"));
	
	Buttonadd.setPreferredSize(new Dimension(100,40));
	Buttonadd.setIcon(new ImageIcon("\\+\\Buttonadd.png"));

	Buttonmul.setPreferredSize(new Dimension(100,40));
	Buttonmul.setIcon(new ImageIcon("\\*\\Buttonmul.png"));

	Buttondiv.setPreferredSize(new Dimension(100,40));
	Buttondiv.setIcon(new ImageIcon("\\/\\Buttondiv.png"));

	Buttonsub.setPreferredSize(new Dimension(100,40));
	Buttonsub.setIcon(new ImageIcon("\\-\\Buttonsub.png"));

	Buttondot.setPreferredSize(new Dimension(100,40));
	Buttondot.setIcon(new ImageIcon("\\.\\Buttondot.png"));

	Buttonclear.setPreferredSize(new Dimension(100,40));
	Buttonclear.setIcon(new ImageIcon("\\clear\\Buttonclear.png"));

	Buttonequal.setPreferredSize(new Dimension(100,40));
	Buttonequal.setIcon(new ImageIcon("\\=\\Buttonequal.png"));
	
	panel.add(Button1);
	panel.add(Button2);
	panel.add(Button3);
	panel.add(Button4);	
	panel.add(Button5);
	panel.add(Button6);
	panel.add(Button7);
	panel.add(Button8);
	panel.add(Button9);
	panel.add(Button0);
	panel.add(Buttonadd);
	panel.add(Buttonmul);
	panel.add(Buttondiv);
	panel.add(Buttonsub);
	panel.add(Buttondot);
	panel.add(Buttonclear);
	panel.add(Buttonequal);
	
	Button1.addActionListener((ActionListener) this);
	Button2.addActionListener((ActionListener) this);
	Button3.addActionListener((ActionListener) this);
	Button4.addActionListener((ActionListener) this);
	Button5.addActionListener((ActionListener) this);
	Button6.addActionListener((ActionListener) this);
	Button7.addActionListener((ActionListener) this);
	Button8.addActionListener((ActionListener) this);
	Button9.addActionListener((ActionListener) this);
	Button0.addActionListener((ActionListener) this);
	Buttonadd.addActionListener((ActionListener) this);
	Buttonmul.addActionListener((ActionListener) this);
	Buttondiv.addActionListener((ActionListener) this);
	Buttonsub.addActionListener((ActionListener) this);
	Buttondot.addActionListener((ActionListener) this);
	Buttonclear.addActionListener((ActionListener) this);
	Buttonequal.addActionListener((ActionListener) this);
}
public void actionPerformed(ActionEvent e) {
	Object source= e.getSource();
	if (source==Buttonclear){
		number1=0.0;
		number2=0.0;
		textarea.setText("");
	}
	if(source==Button1)
	{
		textarea.append("1");
		
	}
	if(source==Button2)
	{
		textarea.append("2");
		
	}
	if(source==Button3)
	{
		textarea.append("3");
		
	}
	if(source==Button4)
	{
		textarea.append("4");
		
	}if(source==Button5)
	{
		textarea.append("5");
		
	}
	if(source==Button6)
	{
		textarea.append("6");
		
	}
	if(source==Button7)
	{
		textarea.append("7");
		
	}if(source==Button8)
	{
		textarea.append("8");
		
	}if(source==Button9)
	{
		textarea.append("9");
		
	}
	if(source==Button0)
	{
		textarea.append("0");
		
	}
if (source==Buttonadd) {
	number1=number_reader();
	textarea.setText("+");
	add=1;
	mul=0;
	div=0;
	sub=0;
}
if (source==Buttonmul) {
	number2=number_reader();
	textarea.setText("*");
	add=0;
	mul=1;
	div=0;
	sub=0;
}
if (source==Buttondiv) {
	number1=number_reader();
	textarea.setText("/");
	add=0;
	mul=0;
	div=1;
	sub=0;
}
if (source==Buttonsub) {
	number1=number_reader();
	textarea.setText("-");
	add=0;
	mul=0;
	div=0;
	sub=1;
}
if (source==Buttonequal) {
	number2=number_reader();
	if (add>0)
	{
		result=number1+number2;
		textarea.setText(Double.toString(result));
	}
	if (mul>0)
	{
		result=number1*number2;
		textarea.setText(Double.toString(result));
	}
	if (div>0)
	{
		result=number1/number2;
		textarea.setText(Double.toString(result));
	}
	if (sub>0)
	{
		result=number1-number2;
		textarea.setText(Double.toString(result));
	}

}
}
public double number_reader() {
	double num1;
	String s;
	s=textarea.getText();
	num1=Double.valueOf(s);
	return num1;
}
}













	








