package day1128;

/**
 * 행과 열로 구성된 이차원 배열
 * 
 * @author owner
 */
public class UseArray2 {
	/**
	 * 참조형 형식으로 2차원 배열 사용
	 */
	public void refType() {
		//1. 선언) 데이터형[ ][ ] 배열명 = null;
		int[][]arr=null;
		//2. 생성) 배열명 = new 데이터형[행의개수][열의개수]
		//배열은 생성시 모든 방의 값은 각 데이터형에 맞춰 초기화 된다.
		arr=new int[3][4]; // 3행 4열로 구성
		System.out.println("행의 수 : "+arr.length+", 열의 수 : "+arr[0].length);
		
		//1+2) 데이터형[][] 배열명 = new 데이터형[행의수][열의수];
		int[][] arr1 = new int[4][5];
		System.out.println("행의 수 : "+arr1.length+", 열의 수 : "+arr1[0].length);
		
		//3. 값 할당) 배열명[행의번호][열의번호]=값;
		arr[0][0]=10;
		arr[1][1]=20;
		arr[2][2]=30;
		
		//4. 값 사용
		System.out.println(arr[0][0] + " / " + arr[0][1] + " / " + arr[0][2]);
		System.out.println(arr[1][0] + " / " + arr[1][1] + " / " + arr[1][2]);
		System.out.println(arr[2][0] + " / " + arr[2][1] + " / " + arr[2][2]);

		//모든 방의 값 출력
		for(int i=0; i < arr.length; i++) {//열의 인덱스
			for(int j=0; j < arr[i].length; j++) {// 행의 인덱스
				System.out.printf("arr[%d][%d]=%-4d",i,j,arr[i][j]);
			}//for
			System.out.println();
		}//for
		
		//2차원 배열의 한행은 1차원 배열로 이루어져 있다.
		for(int[] temp : arr1) {
			//1차원 배열의 방은 단일 데이터형으로 이루어졌다.
			for(int val : temp) {
				System.out.print(val + "\t");
			}//end for
			System.out.println();
		}//for

	}// refType

	/**
	 * 기본형 형식으로 2차원 배열 사용
	 */
	public void priType() {
		//행구분 괄호에 따라 행이 생성
		//1. 선언 및 초기화) 데이터형[][] 배열명={{0행값1, ... }, {1행값1, ...}, {2행값1, ... }, ...};
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //4행 3열의 배열 완성
		System.out.println("행 : "+arr.length + ", 열 : "+arr[0].length);
		//2. 값 할당)
		arr[0][0]=100;
		//3. 값 사용)
		System.out.println(arr[0][0] + " / " + arr[0][1]);
		
		for(int i=0; i<arr.length; i++) {//행
			for(int j=0; j<arr[i].length; j++) {//열
				System.out.printf("arr[%d][%d]=%-4d",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
	}// priType

	public static void main(String[] args) {
		UseArray2 ua2 = new UseArray2();
		ua2.refType();
		System.out.println("-------------------------------------------");
		ua2.priType();
	}// main

}// class
