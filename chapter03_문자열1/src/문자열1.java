/*
 *   문자열과 문자는 서로 다름
 *   문자 '' => 한글자 저장 => char
 *          => 'a','b',...
 *             -----------이런걸 한번에 저장하게 하는것 = String => 문자열 ""
 *                                               => 따라서 문자열은 문자여러개를 한번에 저장하게 하는도구
 *             
 *   일반데이터형
 *     String name="홍길동"; ==> 제어
 *   클래스형
 *     기능 => 메소드
 *     
 *   웹은 데이터형이 존재하지 않음 따라서 모든게 문자열 단위임
 *   예를들어 HTML할때 숫자던 뭐던 p 넣던거 생각하면됨...
 */


import java.util.Scanner;

public class 문자열1 {
	public static void main(String[] args) {
		//데이터 저장
		String name="홍길동";
		System.out.println(name);
		
		char a='홍';
		char b='길';
		char c='동';
		System.out.println(a+""+b+""+c);
		
		String addr="https://www.mangoplate.com/restaurants/V1pDpcDIntci";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 : ");
		String findData=scan.next();
		System.out.println(findData);
		
	}

}
