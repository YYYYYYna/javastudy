/*
 *    99page
 *    
 *    대문자 소문자 변경
 *    
 */


public class 문자열4 {

	public static void main(String[] args) {
		String s="abcdef";
		//대문자출력
		/*for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.print((char)(c-32));
		}*/
		System.out.println(s.toUpperCase()); //위의 for문과 같은 대문자 변환 결과를 낼수있다
		
		s="ABCDEFG";
		/*for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.print((char)(c+32));
		}*/
		System.out.println(s.toLowerCase()); //위의 for문과 같은 소문자 변환 결과를 낼수있다
				

	}

}
