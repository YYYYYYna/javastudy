//좌우대칭 코테 대표적인 문제예제
//코딩시험문제는 구글문제에서 많이 출제됨
import java.util.Scanner;
// 사용자로부터 입력값(문자열) => 좌우대칭 여부 확인
// 조건1) 짝수가 나와야함 : ABBA=4(짝수)
//       따라서 문자갯수를 세야함 : length()
public class 문자열_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String msg=""; //공백값으로 출력해도 에러안남
		String aa;//=null값 : 출력시 에러남
		
		//1. 오류처리 : 좌우대칭여부
		while(true)
		{
			System.out.println("문자열을 입력해라 : ");
			msg=scan.next();
			if(msg.length()%2==0)//=문자열이 짝수인가?
			{
				break;
			}
		}
		
		//2. 좌우대칭여부판단
		boolean bCheck=true;
		//int j=msg.length()-1;//<-[방법2]
		for(int i=0;i<msg.length()/2;i++)
			//<msg.length()/2인 이유는 좌우대칭인지 확인할때 글자수 반절만큼 돌려야 하니까
		{
			int j=msg.length()-1-i;//<-[방법1]
			char c=msg.charAt(i);//앞에서부터확인
			char c1=msg.charAt(j);//뒤에서부터확인
			System.out.println(c+","+c1);
			if(c!=c1)
			{
				bCheck=false;
				break;
			}//여기서 else문을 사용못하는 이유는 첫번째 경우만 수행하고 빠져나가게됨
			j--;
		}
		if(bCheck==false)
		{
			System.out.println(msg+"는/은 대칭구조가 아니다.");
		}
		else
		{
			System.out.println(msg+"는/은 대칭구조가 맞다.");
		}

	}

}
