package sample_0526;

import javax.swing.*;
import java.awt.event.*;

class YourFrame extends JFrame
{
	private JButton button;
	private JLabel label;

	public YourFrame()
	{
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new ActionListener() //무명 클래스는 액션리스너 인터페이스를 구현단다 무명클래스의 객체도
		//동시 생성
		{
			public void actionPerformed(ActionEvent e)//무명클래스 정의. 액션퍼폼드() 메소드 구성
			{
				if (e.getSource()==button)
				
				{
					label.setText("마침내 버튼이 눌러졌습니다아아아.");
				}
				
			}
		});
	
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}


public class ActionEventTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YourFrame t = new YourFrame();
	}

}
