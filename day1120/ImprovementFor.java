package day1120;

import java.util.ArrayList;
import java.util.List;

/**
 * 개선된 for문 : 배열이나 Collection들의 모든 방의 값을 처음부터<br>
 * 순차적으로 출력하기위해 제공.<br>
 * 개선된 for문은 JDK1.5에서부터 사용가능<br>
 * <br>
 * 문법 )<br>
 * for( 데이터형 변수명 : 배열명(Collection명)){<br>
 * 변수명;(배열(Collection)방의 값을 사용할 수 있다.)<br>
 * }<br>
 * a
 * 
 * @author owner
 */
public class ImprovementFor {

	public static void main(String[] args) {
		// 기존의 방식으로 배열값을 출력
		int[] tempArr= {2018, 11, 20, 16, 5};
		//이전의 for로 모든 방의 값을 출력
		for (int i=0; i < tempArr.length; i++) {
			System.out.println(tempArr[i]);
		}//end for
		System.out.println("--------------------------------------------------");
		// 개선된 방식으로 배열값을 출력
		for (int value:tempArr) {
			System.out.println(value);
		}//end for
		
		
		//Collection 이라고 함
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(110);
		list.add(1);
		System.out.println("-------------------List 기존 방식으로 for-----------------------");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}//end for
		
		
		System.out.println("-------------------List 개선된 방식으로 for-----------------------");
		for(int i : list) {
			System.out.println(i);
		}//end for
		
		
	}// main

}
