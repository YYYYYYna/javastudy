/*
 *     equals (==)
 *     -----------
 *     A.equals(B)는 A==B와 같은 역할을 함
 *     equals는 대소문자를 구별함 => 아이디 대소문자가 달라도 로그인됨
 *     equalsIgnoreCase 는 대소문자 구별안함 => 비밀번호 대소문자가 다르면 로그인안됨
 *     
 */
import java.util.Scanner;
public class 문자열8 {

	public static void main(String[] args) {
		final String MID="admin",MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id=scan.next();
		System.out.println("비밀번호 입력 : ");
		String pwd=scan.next();
		
		if(id.equalsIgnoreCase(MID) && pwd.equals(MPWD))
			//A.equals(B)는 A==B와 같은 역할을 함
			//equals는 대소문자를 구별함 => 아이디 대소문자가 달라도 로그인됨
			//equalsIgnoreCase 는 대소문자 구별안함 => 비밀번호 대소문자가 다르면 로그인안됨
		{
			System.out.print(id+"님 로그인 되었습니다.");
		}
		else
		{
			System.out.print("ID나 PW가 맞지않습니다.");
		}
	}

}
