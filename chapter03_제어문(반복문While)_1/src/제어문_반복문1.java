/*
 *     웹
 *    --- 변수, 연산자, 제어문, 메소드, 클래스, 인터페이스, 예외처리 => 기본중의기본 숨쉬듯 가능할정도로 수행할것...
 *                   -----현재여기
 *                     |
 *                   if / for / while / break
 *     71page
 *     ------ while => 반복문 => 반복횟수가 없는 경우(무한)
 *            | 사용처
 *            | 데이터베이스 연동, 파일 읽기
 *            | 형식)
 *            |   초기값 -----1
 *            |   while(조건문) --2----- | 2. false(종료), true(문장 수행)3으로이어짐
 *            |   {                    |
 *            |      반복 수행 문장--3----|
 *            |      증가식------4-------|
 *            |   } 
 *            |   ex)
 *            |   초기값
 *            |   while(조건문)
 *            |   {
 *            |      반복 수행 문장
 *            |      증가식
 *            |   } *            
 *            | 순서)
 *            **do-while은 반복수행문장을 무조건 1번은 실행해야할때 사용함. 상관없으면 while
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		System.out.println("===== for =====");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===== while =====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n방식이 다른거지 결과물은 같게 할수 있음");

	}

}
