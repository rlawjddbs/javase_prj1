package day1119;

/**
 *	else~if : 연관된 여러 조건을 비교할 때.<br >
 * 문법 ) if(조건식){<br>
 * 				조건에 맞을 때 수행 문장;<br>
 * 			}else if(조건식){
 * 				조건에 맞을 때 수행 문장;<br>
 * 			}else if(조건식){
 * 				조건에 맞을 때 수행 문장;<br>
 * 			}else if(조건식){
 * 				조건에 맞을 때 수행 문장;<br>
 * 			}else{<br>
 * 				모든 조건에 맞지 않을 때 수행 문장;<br>
 * 			}
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		//args[0] = "100";
		int i = Integer.parseInt(args[0]);
		System.out.println(i+"은(는)");
		if(i < 0) {
			System.out.println("0보다 작아서 실패");
		} else if (i > 100) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("0과 100사이, 입력성공");
		} // end else
		
		// 이름을 입력받아 "이재찬" 이면 "반장"을,
		// 이봉현, 박영민, 김정운, 오영근 이면 "조장"을,
		// 그렇지 않으면 평민을 이름앞에 출력하세요.
		
		if(args[1] == "이재찬") {
			System.out.print("반장 ");
		}else if(args[1].equals("이봉현") || args[1].equals("김정운") || args[1].equals("김정운") || args[1].equals("오영근")) {
			System.out.print("조장 ");
		}else {
			System.out.print("평민 ");
		}//end else
		System.out.println(args[1]+"님 안녕하세요.");
		
		//태어난해(1995)를 입력받아 띠(12) 구하기
		// 11-양, 10-말, 9-뱀, 8-용, 7-토끼, 6-호랑이, 5-소, 4-쥐, 3-돼지, 2-개, 1-닭, 0-원숭이
		
		int l = Integer.parseInt(args[2]) % 12;
		System.out.print(args[2]+"년생은 ");
		if(l == 0) {
			System.out.println("원숭이띠 입니다.");
		}else if(l==1) {
			System.out.println("닭띠 입니다.");
		}else if(l==2) {
			System.out.println("개띠 입니다.");
		}else if(l==3) {
			System.out.println("돼지띠 입니다.");
		}else if(l==4) {
			System.out.println("쥐띠 입니다.");
		}else if(l==5) {
			System.out.println("소띠 입니다.");
		}else if(l==6) {
			System.out.println("호랑이띠 입니다.");
		}else if(l==7) {
			System.out.println("토끼띠 입니다.");
		}else if(l==8) {
			System.out.println("용띠 입니다.");
		}else if(l==9) {
			System.out.println("뱀띠 입니다.");
		}else if(l==10) {
			System.out.println("말띠 입니다.");
		} else if(l==11){
			System.out.println("양띠 입니다.");
		} else {
			System.out.println("Error");
		}
		
	}//main
}//class
