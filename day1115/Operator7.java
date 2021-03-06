package day1115;
/*
	대입연산자
	=
	+=, -=, *=, /=, %=
	<<=, >>=, >>>=
	&=, |=, ^=
*/
class Operator7{
	public static void main(String[] args) {

		int i=3; // 대입
		//산술대입
		i+=2;  // i=i+2;	5
		System.out.println(i);
		i-=1;	// i=i-1;	4
		System.out.println(i);
		i*=2;	// i=i*2;	8
		System.out.println(i);
		i/=2;	// i=i/2;	4
		System.out.println(i);
		i/=3;	// i=i/3;	1	정수 / 정수= 정수 (실수없이 정수부분의 몫만 반환)
		System.out.println(i);
		i%=3;	// i=i%1;	1
		System.out.println(i);

		i=2;
		//쉬프트대입
		i<<=4; // i=i<<4; // 0000 0010 << 4 = 0010 0000
		System.out.println(i);
		i>>=1; // i=i>>1; // 0010 0000 >> 1 = 0001 0000
		System.out.println(i);			// debugging 목적으로 System.out.println()을 쓴다. (method 개발시 값 확인용으로 사용)
		// 실행중인 코드에 출력 코드가 존재하면 속도가 느려진다. (취약점 중 하나)
		i>>>=2; // i=i>>>2; // i = i >>> 2; // 0001 0000 >>> 0000 0100
		System.out.println(i);

		//비트논리 대입
		i &= 12; // i = i & 12; // 0100 & 1100 = 0100
		System.out.println(i);
		i |= 11; // i = i | 11; // 0100 | 1011 = 1111
		System.out.println(i);
		i ^= 5; // i = i ^ 5; // 1111 ^ 0101 = 1010
		System.out.println(i);
		
	}//main
}//class
