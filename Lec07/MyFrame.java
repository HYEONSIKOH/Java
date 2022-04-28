package Lec07;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame /* JFrame �̶�� ���� Ŭ������ ��� */ {
	public MyFrame() { // ������
		Toolkit kit =Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200); // â�� ũ��
		setLocation(screenSize.width/2,screenSize.height/2); // �� ȭ�鿡�� ����� Location
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ�
		setTitle("MyFrame"); // ������ �̸�����
		
		Image img = kit.getImage("arrow.gif"); // ������ ������ ���� [��ġ: eclipse-workspace\JAVA]
		setIconImage(img);
		
		setLayout(new FlowLayout()); // ��ġ ������ ���� (��ư�� ��ġ ����)
		JButton button = new JButton("��ư"); // ������Ʈ ���� �� �߰�
		this.add(button);
		
		setVisible(true); // ȭ�鿡 ��Ÿ����
	}

}
