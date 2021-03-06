package day1114;
/*
	강제형변환 : 변수의 데이터형을 일시적으로 변환하여 사용하는 것
*/

class UseCasting{
	public static void main(String[] args) {
		byte b1=10, b2=20; //자동형변환
		// byte result = b1 + b2; //연산의 결과가 int로 자동형변환
		byte result = (byte)(b1 + b2);
		// 연산의 결과가 int로 자동형변환 되는 것을 byte로 강제형변환
		System.out.println( b1+" + "+b2+" = "+result);
		
		double d = 11.14;
		float f = (float)d;
		System.out.println("double : " + d + ", float : " + f);

		float f1=(float)2018.11; // 강제형변환은 상수에도 사용가능
		System.out.println("float : "+f1);

		// long l=(long)2147483648; 
		// 상수값이 literal보다 크다면 casting을 실행하기전에 Error 가 발생하므로 강제형변환 되지않는다.

		int i=(int)f1; //값 손실 발생 (변수 f1의 값 중 실수부의 값이 모두 사라진채로 할당 됨)
		System.out.println("int : "+i+", float : "+f1);

		char c = 'A';
		System.out.println(c+"의 unicode(ASCII code) 값 "+c);
		System.out.println(c+"의 unicode(ASCII code) 값 "+(int)c);
		
		// 형이(기본형 <-> 참조형) 다르면 강제형 변환이 되지 않는다.
//		String s="11"; //참조형 변수
//		int i=(int)s; //기본형

		// boolean형은 boolean형 끼리만 변환가능.
		boolean b=true;
//		i = (boolean)b; //error
		boolean bc = (boolean)b;
		System.out.println(bc);
	}//main
}//class
