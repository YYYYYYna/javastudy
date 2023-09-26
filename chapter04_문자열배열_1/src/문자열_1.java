/*
 *   자바 => 문자열(웹, 윈도우) => 가장 많이 사용되는 데이터형
 *              --------대부분 문자열을 가지고 있다.
 *   문자열 사용법
 *   ---------
 *   => 데이터형
 *      String : 일반 데이터형, 클래스형으로 사용이 가능
 *               ---------
 *                   |
 *                String name="홍길동";
 *                String name=new String("박문수");
 *                ** 문자열의 저장 갯수는 제한이 없다.
 *      String => 클래스형으로 만들어져 있다.
 *      ------char[]
 *      "Hello Java" == {'H','e','l','l','o',' ','J','a','v','a'}
 *                   => 형태만 다를뿐이지 둘이 같은뜻임
 *                   => 인덱스 번호로 배열형식을 사용해 0번부터 잘라져 있다고 생각하면됨
 *                      -> 오라클 : 1번부터 / MySQL : 0번부터
 *                      
 *      ***String 기능(메소드) 종류 다 외워야함
 *      --------------=>라이브러리(변경해서 사용 할 수 없다.)=final class 
 *      1. 변환                                      (ex. java.lang에 있는 대부분의 클래스)
 *          toUpperCase() => 대문자로변환
 *          toLowerCase() => 소문자로변환
 *          ***valueOf() => 모든 데이터형을 String으로 변경
 *                       ex.int a=10;
 *                          valueOf(a) ==> "10"
 *                          valueOf(a)+100 ==> "10100"
 *      2. 제어
 *          substring => 문자 자르기 (ex.말줄임표사용하려고)
 *      3. 변경
 *          ***trim() : 공백(좌우)
 *          replace() : 문자,문자열변경
 *          replaceAll() : 변경(정규식)
 *          split() => 분리 / 문자 자르기 후 배열까지 해줌
 *      4. 찾기
 *          indexOf() => 위치 (앞에서)
 *          lastIndexOf() => 위치 (뒤에서)
 *            ex. Java의 1번a를 찾을때는 indexOf(), 3번째를 찾을때는 lastIndexOf()
 *      5. 결합
 *          concat() => + / 문자열 결합
 *      6. 비교
 *          equals() => == / 같은문자열일때 (ex.로그인,아이디찾기)
 *          contains() => 문자열이 포함여부 (ex.검색)
 *          startsWith() => 시작문자열이 같은경우 (ex.Cookie)
 *          endsWith() => 끝문자열이 같은경우
 *      7. 기타
 *          charAt() => 문자중에 한개의 char 얻는다
 *          toCharArray() => char[]
 *      
 */
public class 문자열_1 {

	public static void main(String[] args) {
		System.out.println(Math.random());

	}

}
