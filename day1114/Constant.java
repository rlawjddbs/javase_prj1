package day1114;
/*
	Constant(변수를 상수처럼 사용하는 것)의 사용
	선언 : class field에서만 선언 및 초기화
*/

class Constant{
	//Constant 선언
	public static final int MAX_SCORE=100;
	public static final int MIN_SCORE=0;

	public static void main(String[] args) {
		//public static final int MIN_SCORE=0; 
		//상수는 필드에서만 선언이 가능하다.(method 내에서는 선언할 수 없다. 선언시 Error 발생)

		//상수의 사용 : 상수명
		System.out.println(MAX_SCORE+" / "+MIN_SCORE);
		//상수의 사용 : 클래스명.상수명
		System.out.println(Constant.MAX_SCORE+" / "+Constant.MIN_SCORE);

		int my_score=95;
		my_score=93;
		//MAX_SCORE=90; //상수는 초기화 이후 값 할당이 되지 않는다.
		my_score=83;

		System.out.println("점수의 최고점은 "+Constant.MAX_SCORE+
		"점이고, 최저점은 "+my_score+"점 입니다. 획득점수는 "+ 
		my_score+"점 이고, 최고점과 획득점수의 차이는 "+(MAX_SCORE - my_score)+"점 입니다.");

		System.out.println("long 최대값 : "+Long.MAX_VALUE+" / 최소값 : "+Long.MIN_VALUE);
	}//main
}//class
