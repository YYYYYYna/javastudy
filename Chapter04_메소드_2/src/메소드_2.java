/*
 *    1. 문자열을 입력 받아서 대문자=>소문자로, 소문자=>대문자로 변경
 *       --------------겹치는부분이 있으니 메소드를 따로 만드는게 좋음
 *    2. 문자열을 입력 받아서 반대로 출력하기
 */

import java.util.Scanner;
public class 메소드_2 {
	
	//[문자열 입력받는 메소드]
	      //-----return형,매개변수X
    static String userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		return scan.nextLine();
		//next() : 엔터시에 메모리 저장 (=>공백전까지만 문자열로 인식)
		//         aaa bbb ccc => aaa
		//nextLine() : 엔터시에 메모리에 저장 (=>공백있어도 이어서 문자열로 인식)
		//             aaa bbb ccc => aaa bbb ccc
	}
    
    //[문자크기 변경하는 메소드]
           //------return형,매개변수O(=String)
           //결과값 받아서 출력 or 메소드 안에서 처리(v)=void
    static void alphaChange(String msg)
    {
    	String result="";//알파벳크기바꾼거 모아두는 문자열변수
    	for(int i=0;i<msg.length();i++)
    	{
    		char c=msg.charAt(i);//문자열 문자1씩 자르기
    		if(c>='A' && c<='Z')//자른문자가 대문자면
    		{
    			//[방법1]소문자로 바꿈
    			//result+=(char)(c+32);
    			
    			//[방법2]문자열로다시바꿔서소문자로
    			result+=String.valueOf(c).toLowerCase();
    		}
    		else if(c>='a' && c<='z')//자른문자가 소문자면
    		{
    			//[방법1]대문자로 바꿈
    			//result+=(char)(c-32);
    			
    			//[방법2]문자열로다시바꿔서대문자로
    			result+=String.valueOf(c).toUpperCase();
    		}
    		else//자른문자가 해당사항이 없으면
    		{
    			result+=c;//그냥 출력하시오
    		}
    	}
    	System.out.println("결과값 : "+result);
    }
    
    //[문자반대로 출력하는 메소드]
            //-----return형,매개변수O(=String)
            //결과값 받아서 출력(v) or 메소드 안에서 처리
    static String alphaReverse(String msg)
    {
    	String result="";//거꾸로 뒤집은거 모아두는 문자열변수
    	for(int i=msg.length()-1;i>=0;i--)//뒤에서부터 출력
    	{
    		char c=msg.charAt(i);//뒤에서부터 저장=반대로뒤집음
    		result+=c;
    	}
    	return result;
    }
	public static void main(String[] args) {
		String msg=userInput();
		System.out.println("msg : "+msg);
		//alphaChange(msg);
		String res=alphaReverse(msg);
		System.out.println("res : "+res);

	}

}
