package Lec07;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mylab {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel label1 = new JLabel("화씨온도"); // 페널의 이름
		JLabel label2 = new JLabel("섭씨온도"); // 페널의 이름
		JTextField field1 = new JTextField(15); // 기본적인 텍스트 필드와 크기
		JTextField field2 = new JTextField(15); // 기본적인 텍스트 필드와 크기
		JButton button = new JButton("변환");
		
		panel.add(label1);
		panel.add(field1);
		
		panel.add(label2);
		panel.add(field2);
		
		panel.add(button);
		
		f.setSize(250,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
		
	}
}
