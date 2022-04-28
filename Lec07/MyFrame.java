package Lec07;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame /* JFrame 이라는 공용 클래스를 상속 */ {
	public MyFrame() { // 생성자
		Toolkit kit =Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200); // 창의 크기
		setLocation(screenSize.width/2,screenSize.height/2); // 내 화면에서 실행될 Location
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기
		setTitle("MyFrame"); // 프레임 이름변경
		
		Image img = kit.getImage("arrow.gif"); // 프레임 아이콘 변경 [위치: eclipse-workspace\JAVA]
		setIconImage(img);
		
		setLayout(new FlowLayout()); // 배치 관리자 설정 (버튼의 위치 설정)
		JButton button = new JButton("버튼"); // 컴포넌트 생성 및 추가
		this.add(button);
		
		setVisible(true); // 화면에 나타내기
	}

}
