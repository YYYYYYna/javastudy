/*   
 *    replace(char, char)
 *    replace(String, String)
 */
public class 문자열6 {

	public static void main(String[] args) {
		
		String s="1상승";
		String id=s.replace("[가-힣]", "");
		String state=s.replace("[0-9]", "");
		System.out.println("id : "+id);
		System.out.println("state : "+state);
		System.out.println("▲ "+id);
		//와....css로 개고생했던거 이렇게 쉽게 바꿀수 있음..ㅠㅠ
		//원래는 <span>으로 감싸진 1에 또<span class=hide>상승이엇는데...
		
		s="Hello Java!!";
		String ss=s.replace('a', 'b'); //문자변경가능
		System.out.println(ss);
		ss=s.replace("Java", "Python"); //문자열을 바꿀수도 있음
		//다른출처라도 System.out.p 처럼 이후에 나오는 수많은 메소드라도 뜻이 다른것처럼
		//위에 같은 부분이라도 'a'를 선택하거나 "Java"를 다르게 선택할수 있음
				

	}

}
