package day1129;

/**
 * 사람을 추상화하여 만든 클래스<br>
 * 명사적 특징 : 눈, 코, 입, 이름<br>
 * 동사적 특징 : 먹는다.<br>
 * <br>
 * 객체화) Person 객체명 = new Person();<br>
 * 		생성된 객체로 먹는일을 할 수 있다.
 * @author owner
 */
public class Person {
	private String name; //사람의 이름
	private int eye, nose, mouth; //사람의 눈, 코, 입
	
	/**
	 * 사람 클래스의 기본 생성자<br>
	 * 눈 2개, 코1개, 입 1개를 가진 사람 객체를 생성
	 */
	public Person() {
		this(2, 1, 1); // this를 활용해 코드를 줄일 수 있다.
//		eye=2;
//		nose=1;
//		mouth=1;
	}//Person
	
	
	/**
	 * 인자 있는 생성자
	 * 눈 2개, 코1개, 입1개가 아닌 사람 객체를 생성할 때 사용하는 생성자.
	 * @param eye 눈
	 * @param nose 코
	 * @param mouth 입
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}
	
	/**
	 * 생성된 사람 객체에 이름을 설정하는 일
	 * @param name 이름 입력
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**
	 * 생성된 사람 객체의 눈을 설정하는 일<br>
	 * 설정할 눈의 갯수는 최대 3개까지 설정할 수 있다.
	 * 3개가 넘어가면 2개로 설정
	 * @param eye 눈의 개수
	 */
	public void setEye(int eye) {
		if(eye > 3) {
			eye=2;
		}//end if
		this.eye = eye;
	}//setEye
	
	/**
	 * 생성된 사람 객체의 코를 설정하는 일.<br>
	 * @param nose 코의 개수
	 */
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	/**
	 * 생성된 사람 객체의 입 개수를 설정하는 일<br>
	 * @param mouth 설정할 입의 개수
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	
	/**
	 * 생성된 사람 객체의 이름을 반환하는 일.
	 * @return 이름
	 */
	public String getName() {
		return name;
	}//getName

	/**
	 * 생성된 사람 객체가 가지고 있는 눈의 개수를 반환하는 일.
	 * @return 눈의 개수
	 */
	public int getEye() {
		return eye;
	}//getEye

	/**
	 * 생성된 사람 객체가 가지고 있는 코의 개수를 반환하는 일.
	 * @return 코의 개수
	 */
	public int getNose() {
		return nose;
	}//getNose
	
	/**
	 * 생성된 사람 객체가 가지고 있는 입의 개수를 반환하는 일.
	 * @return 입의 개수
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * 동사적 특징<br>
	 * 생성된 사람객체가 집에서 밥을 먹는 일 구현.
	 * @return 결과
	 */
	public String eat() {
		return name+"이 집에서 밥을 먹는다.";
	}//eat
	
	/**
	 * method overload(overloading) : 다형성 - 같은 이름의 method를 여러개 정의하는 방법<br>
	 * 생성된 사람 객체가 식당에 주문한 음식을 먹는 일을 구현.
	 * @param menu 음식의 종류
	 * @param price 음식가격
	 * @return 결과
	 */
	public String eat(String menu, int price) {
		return name+"이(가) 식당에서 "+menu+"인 음식을 "+price+"원 내고 사먹는다.";
	}//eat
}//class
