package day1214;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class UseLineBorder extends JFrame implements ActionListener {

	private JButton btn1, btn2;
	
	public UseLineBorder() {
		super("LineBorder");
		
		btn1 = new JButton("확인");
		btn2 = new JButton("취소");
		
		
		JPanel panel = new JPanel();
		panel.add(btn1);
		panel.add(btn2);
		
		//LineBorder 사용
		panel.setBorder(new LineBorder(Color.RED));
		
		setLayout(null);
		
		//이벤트 등록
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		panel.setBounds(200, 350, 135, 40);
		add(panel);
		
		setBounds(100, 100, 410, 450);
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseLineBorder
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btn1) {
			new UseTitledBorder();
		}//end if

		if(ae.getSource() == btn2) {
			dispose();
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseLineBorder();
	}//main

}//class
