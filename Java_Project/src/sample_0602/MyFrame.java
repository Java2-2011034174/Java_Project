package sample_0602; // ¸¶¿ì½º ¾î´ðÅÍ

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



	class MyPanel extends JPanel
	{
		BufferedImage img = null;
		int img_x = 0, img_y = 0;
		//밑의 2랑 비교. 이건 어댑터 클래스. 2는 리스너를 하나하나 구현. 원하는 건 한개인데도 인터페이스 때문에 할 수
		//없이 구현해야함. 하지만 어댑터는 하나만 쓰면 됨
		//리스너 - 인터페이스(implements) / 어댑터 - 클래스(extends)
		//어댑터 장점 - 깔끔 편리 / 단점 - 동시 상속이 안되는 자바 특성상 내부 클래스로 정의해서 사용하는 것이 좋다
		public MyPanel()
		{
			try {
				img = ImageIO.read(new File("car.gif"));//패널에 마우스 리스너 추가. 무명클래스로 작성
			} catch(IOException e)
			{
				System.out.println("no image");
				System.exit(1);
			}
			addMouseListener(new MouseAdapter()
			{
				public void mousePressed(MouseEvent e)
				{
					img_x = e.getX();
					img_y = e.getY();
					repaint();
				}//mousepressed 만 재정의 한다.
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawImage(img, img_x,img_y, null);
		}
	}

	public class MyFrame extends JFrame
	{
		public MyFrame()
		{
			add(new MyPanel());
			setSize(300, 500);
			setVisible(true);
		}
		public static void main(String[] args)
		{
			new MyFrame();
		}
	}
	
