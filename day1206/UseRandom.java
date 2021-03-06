package day1206;

import java.util.Random;

/**
 *	Random : 다양한 난수를 얻기위한 객체.
 * @author owner
 */
public class UseRandom {

	public UseRandom() {
		//1. 생성)
		Random r = new Random();
		//실수 난수
		double d = r.nextDouble();
		System.out.println(d);
		System.out.println(d*5); // 0.0000000000000000 ~ 0.4999999999999999
		System.out.println((int)(d*5));

		System.out.println("-----------------------------------");
		
		//정수 난수
		int i=r.nextInt();
		System.out.println(i);
		System.out.println(i%5);//음수가 발생하므로 절대값을 구해야한다.
		System.out.println(Math.abs(i%5)); //Math 클래스의 abs() method를 이용하여 절대값만 출력되도록 한다.
		int j = r.nextInt(5); // 음수가 발생하지 않는다.
		System.out.println(j);
		
		System.out.println("-----------------------------------");
		
		//불린 난수
		boolean b = r.nextBoolean();
		System.out.println(b);
		
		
		
		
	}//UseRandom
	
	public static void main(String[] args) {
		new UseRandom();
	}//main

}//class
