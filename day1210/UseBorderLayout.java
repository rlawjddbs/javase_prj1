package day1210;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	일반 컴포넌트와 LayoutManager의 사용
 *	NonVisualComponent
 *	
 * @author owner
 */
//1. Window Component 상속( 사용자에게 보여지는 일 )
public class UseBorderLayout extends Frame {

	public UseBorderLayout(){
		super("BorderLayout 연습"); // 부모(Frame)의 매개변수를 받는 생성자를 호출한다.
		//2. 사용할 일반 컴포넌트를 생성
		TextField tfNorth = new TextField("North");
		Label lblEast = new Label("East");
		TextArea taCenter = new TextArea("Center");
		Label lblWest = new Label("West");
		Choice choSouth = new Choice();
		choSouth.add("South");
		
		// 3. 배치관리자 설정 : Window Component인 Frame, Dialogs는 BorderLayout이 기본 설정
		// BorderLayout 기본설정
		setLayout(new BorderLayout()); // 따로 설정하지 않아도 BorderLayout이 기본 설정값이다.
		
		// 4. 컴포넌트의 배치관리자를 사용하여 배치
		// add("배치위치", 컴포넌트); add(상수, 컴포넌트);
		// 문자열 상수 사용하여 배치
		add("North", tfNorth); //Overloading된 add method
		add("Center",taCenter);
		// Constant(Field)를 사용하여 배치
		add(BorderLayout.WEST, lblWest);
		add(BorderLayout.EAST, lblEast);
		add(BorderLayout.SOUTH, choSouth);
		
		//Center만 배치하면 테두리인 North, West, South, East의 자리가 사라진다.
		
		//5. 윈도우 크기 설정
		setSize(400, 400);
		
		//6. 사용자에게 보여주기
		setVisible(true);
		
		//종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		}/*anonymous inner class*/);
		
		
	}//UseBorderLayout
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}//main
}//class
