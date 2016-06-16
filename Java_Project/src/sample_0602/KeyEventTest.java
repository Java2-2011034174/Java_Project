package sample_0602;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KeyEventTest extends JFrame implements KeyListener 
{

	private static final String KeyCode = null;
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest()
	{
		panel = new JPanel (new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하시오 : "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3,30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		field.addKeyListener (this);//addkeylistener()메소드로 현재 객체를 이벤트 리스너로 추가
		setTitle("KeyEvent Test");
		setSize(400,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	
	{
		new KeyEventTest();
	
	}
	
	public void keyTyped(KeyEvent e)//키가 입력되면 호출
	{
		display(e, "key Typed      ");
	}
	public void keyPressed(KeyEvent e)//키를 누르는 순간 호출
	{
		display(e, "key Pressed      ");

	}

	public void keyReleased(KeyEvent e)//키에서 손을 떼는 순간 호출
	{
		display(e, "key Released      ");

	}
	
	protected void display(KeyEvent e, String s)
	{
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt : "+ e.isAltDown() + "Ctrl :  "
				+e.isControlDown() + "Shilft : " +e.isShiftDown();
		
		area.append(" " + s + "문자 " + c + "(코드 : " + KeyCode + ") " + modifiers + "\n");
	}
}
