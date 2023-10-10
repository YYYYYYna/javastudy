/*
 *    [클래스를 만드는 기본흐름]
 *    1. 필요한 변수를 묶는다.
 *    
 *    2. 구분자 설정 => 참조번호 생성
 *    
 *    3. 여러개 있는경우 => 배열사용인지 문자열사용인지 판단하기
 *                     -----    -------
 *                    갯수동일할때   갯수가변수마다다를때
 *    4. 데이터형 설정 => String , int , double
 *    
 *    5. 저장하는 과정
 *       → new : 동적 메모리 할당
 *       
 *    6. 사용법
 *       : 객체.변수명 ==> 읽기/쓰기 둘다가능 ==> .은 메모리 접근 연산자
 *                      int a=10;
 *                      a=100; //=쓰기
 *                      System.out.print(a);//=읽기
 *                      
 *    7. 사용자 정의 데이터형 
 *       : ~VO 혹은 ~DTO 혹은 ~Bean
 *     각각 Spring  MyBatis  JSP 에서 자주쓰임
 *         ex. MemberVO는 Member의 카테고리만 명명하는 클래스를 뜻함
 *         
 *    8. 변수의 종류
 *       = 멤버변수
 *         => new를 사용해야 메모리에 저장
 *         => 메모리 공간이 따로 생성
 *       = 정적변수(static)
 *         => 컴파일시에 메모리가 자동 할당
 *         => 메모리 공간이 1개생성 ==> 공유변수
 *       = 나머지는 지역변수~~
 *         
 */

// 망고플레이트 실습
// 카테고리 => 맛집
// 클래스는 반드시 구분자를 필요로 한다 => 정수형
class FoodCategory
{
	int cno;//카테고리 번호 (=구분자)
	String poster,title,subject;
}
class FoodHouse
{
	int cno;//카테고리 번호 (=구분자)
	int fno;//맛집 번호 (=구분자)
	
	//이미지는 출력갯수가 고정되어있어서 배열사용
	String[] poster=new String[5];
	
	//멤버변수 포함 => 기본형, 클래스, 배열
	String name;
	double score;
	String address;//substring
	String phone;
	String type;
	String price;
	String parking;
	String time;
	
	//매뉴는 가게마다 갯수가 변해서 배열사용불가능
	String menu; //a , b , c , d
	
}
public class MainClass_1 {

	public static void main(String[] args) {
		

	}

}
