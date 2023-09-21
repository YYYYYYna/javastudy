import java.util.Scanner;
//문자열 입력을 받아서 A,a가 몇개인지 확인
public class 문자열3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String data=scan.next();//next()는 공백앞에서 끊김
		
		int count=0; //A || a 인 갯수
		
		//charAt() => 문자를 하나씩 잘라올때 사용
		//length() => 문자의 갯수를 셀때 사용
		for(int i=0;i<data.length();i++)
		{          //문자의 끝번이 n-1임으로 범위가 <=이아닌 <로 넣어야함
			char c=data.charAt(i);
			if(c=='A' || c=='a')
			{
				count++;
			}
		}
		System.out.println("갯수 : "+count);

	}

}
