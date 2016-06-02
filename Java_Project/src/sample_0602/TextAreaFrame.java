package sample_0602;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextAreaFrame extends JFrame implements ActionListener {

	protected JTextField textField;
	protected JTextArea textArea;

	public TextAreaFrame()
	{
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10,30);
		JScrollPane scrollPane = new JScrollPane(textArea);//여기 붙은 TEXTAREA때문에 밑의 것이 확실함
		add(scrollPane,BorderLayout.CENTER);
		textArea.setEditable(false);
		//add(textArea,BorderLayout.CENTER); //없으면 가운데 고정
		add(textField,BorderLayout.NORTH);

		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	public static void main(String[] args)
	{
		new TextAreaFrame();
	}
}
