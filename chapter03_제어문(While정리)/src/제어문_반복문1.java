/*
 *     제어문 : 프로그램을 제어 => 반복수행, 선택한 부분만 출력, 사용자 요청 처리...
 *     
 *     for : 반복횟수가 존재할때 사용 (ex. 화면UI) => 웹프로그램(Front)에서 주로사용
 *         : ①초기값 => ②조건 검색
 *                    -> true => ③반복문장 수행 => ④초기값증가
 *                    -> false => 종료
 *         : 기본적으로 2차 for문(중첩조건문)까지는 할수 있어야함
 *         : 알고리즘(정렬,검색...)이 이쪽에서 주로 나옴(ex. 정보처리) 
 *         
 *     2차 for문 : ①초기값1 => ②조건1 검색
 *                           -> true => ③-⒜초기값2 => ③-⒝조건2 검색
 *                           -> false => 종료         -> true => ③-⒞반복문장 수행 => ③-⒟초기값증가
 *                                                   -> false => 종료
 *     
 *     while : 반복횟수가 없는 경우 => 서버(Back)에서 주로사용 => 크롤링, 데이터베이스생성, 파일읽기
 *                              => 선조건 (수행을 못할 수도 있다.)
 *           : 형식) ①초기값
 *                  while(②조건식)→false <종료>
 *                  {      ↓true 
 *                       ③반복처리문장
 *                       ④증가식
 *                  }
 *                              
 *     do~while : 무조건 반복문 한번 이상 수행
 *     
 *                => 웹 (사용반도 거의없다)
 *                => 후조건 (한번은 반드시 수행)
 *              : 형식) ①초기값
 *                     do {
 *                          ②반복문 ←------  
 *                          ③증가식       |<반복문회귀>
 *                     }while(④조건식);→true //증가된 값을 조건검색
 *                              ↓false
 *                             <종료>
 *                     
 *     while문과 do~while문의 차이 : while은 조건문을 먼저 실행하고 증감식실행
 *                              : do~while은 증감식을 실행하고 조건문을 실행
 *                
 *     --------- <반복문의 종류>
 *     아래의 반복문 형식 비교하면서 암기하기
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		System.out.println("각각 다른 형식이지만 같은 결과값이 나옴");
		System.out.println("========== for ==========");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n========== while ==========");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n========== do~while ==========");
		int j=1;
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=10);

	}

}
