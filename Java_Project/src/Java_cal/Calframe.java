package Java_cal;

import javax.swing.*;
import java.awt.*;

public class Calframe extends JFrame {
	
	private JButton[] button;
	private JTextField field;
	private JPanel panel;
	private String[] labels = {"7","8","9","C","4","5","6","*","1","2","3","-" ,"0","/","+","=" };
	public Calframe()
	{
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		JTextField field = new JTextField(35);
		field.setText("0");
		field.setEnabled(false);
		
		panel = new JPanel();
		
		panel.setLayout(new GridLayout(0,4,3,3));
		button = new JButton[25];
		
		int i =0;
		for (int r= 0; r<4; r++)
		{
			for (int c = 0; c<4; c++)
			{
				button[i] = new JButton(labels[i]);
				panel.add(button[i]);
				i++;
			}
			
			
		}
		
		add(field,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		setVisible(true);
		pack();
		
	}
	
	public static void main(String args[])
	{
		Calframe s = new Calframe();
	}
	
}
