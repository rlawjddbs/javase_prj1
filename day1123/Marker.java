package day1123;

/**
 * 마카펜을 대상으로 선정하여, 추상화를 진행하고 만들어진 클래스<br>
 * 마카펜 - 명사적 특징 : 색상, 몸체, 뚜껑 → 변수<br>
 * 마카펜 - 동사적 특징 : 쓴다 → method(메소드, 메서드)<br>
 * 사용법)<br>
 * 			기본 생성자를 사용하여 객체를 생성한 후, setter method를 호출하여
 * 			값을 설정한 후 사용한다.<br>
 * 			Marker m = new Marker();<br>
 * 			m.setXxx(값);<br>
 * <br>
 * class는 사용자정의 자료형, 참조형 데이터형 이다.
 * 
 * @author owner
 */
public class Marker {
	private String color;	//마카펜의 색
	private int body;		//마카펜의 몸체의 개수
	private int cap;			//마카펜의 뚜껑의 개수
	// class 변수
	
	/**
	 *기본 생성자로 마카펜 객체가 생성되면 검은색, 뚜껑 1개, 몸체1개인
	 *마카펜 객체를 생성한다. <br>
	 *11-26-2018 코드 추가 (재 개정 이력이라 함, 언제 누가 코드를 바꿨는지 상세히)
	 */
	public Marker() {
		this("검은색", 1, 1); //인자있는 생성자를 호출하여 값 설정. (중복코드를 줄일 수 있음)
		System.out.println("Marker 기본생성자");
//		color="검은색";
//		body=1;
//		cap=1;
	}//Marker
	
	/**
	 * 인자있는 생성자 - 검은색, 뚜껑과 몸체가 1개가 아닌 마카펜을 생성할 때 사용하는 생성자<br>
	 * 색, 뚜껑의 수, 몸체의 수를 입력받아 마카펜을 생성.
	 * @param color 마카펜의 색
	 * @param cap 마카펜의 뚜껑 개수
	 * @param body 마카펜의 몸체 개수
	 */
	public Marker(String color, int cap, int body) {
		this.color=color;
		this.cap = cap;
		this.body = body;
		System.out.println("Marker 매개변수 있는 생성자");
	}
	
	/**
	 * 생성된 마카펜 객체에 색상을 설정하는 일을하는 setter 메소드 setColor<br>
	 * 검정, 파랑, 빨강만 설정한다. 그 이외의 색은 검정으로 처리한다.
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		// 인스턴스 변수에 설정될 값에 대한 검증을 if문으로 수행.
		if( !(color.equals("검은색")|| color.equals("파란색")|| color.equals("빨간색"))) {
			color = "검은색";
		}//end if
		this.color = color; //Marker 클래스의 color 변수를 의미함.
	}//setColor
	
	/**
	 * 생성된 마카펜 객체의 몸체의 개수를 설정하는 일을하는 setter 메소드 setBody
	 * @param body 몸체의 개수
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * 생성된 마카펜 객체의 뚜껑의 개수를 설정하는 일을하는 setter 메소드 setCap
	 * @param cap 뚜껑의 개수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	
	/**
	 * 생성된 마카펜 객체가 가지고 있는 색을 반환하는 일
	 * @return 색
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * 생성된 마카펜 객체가 가지고 있는 몸체의 개수
	 * @return 몸체의 개수
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * 생성된 마카펜 객체가 가지고 있는 뚜껑의 개수
	 * @return 뚜껑의 개수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * 입력된 메세지를 생성된 마카펜으로 칠판에 쓰는일을 하는 메소드 write
	 * @param msg 칠판에 쓸 메세지
	 * @return 결과
	 */
	public String write(String msg) {
		return color+"인 마카펜으로 칠판에 \""+msg+"\"를 쓴다.";
	}//write
	
}//class
