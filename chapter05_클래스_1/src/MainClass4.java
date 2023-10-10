// 클래스 => 데이터형 => 배열사용이 가능

import java.util.*;

//3명의 학생 => 이름, 국,영,수, 총점, 평균
class Student2
{
	String name;
	int kor;
	int eng;
	int math;
	
}
public class MainClass4 {

	public static void main(String[] args) {
		//3명학생배열생성 
		//아래부분에 Student로 그냥 쓰면 이전페이지에서 생성된 클래스 사용함
		Student2[] std=new Student2[3];//객체배열 => 일반배열과 다름
		//=>아직 여기까지는 메모리 할당 아님...배열만 선언
		//왜냐면 아직 초기화 상태라서 std[0]=null 이기 때문에

		//[입력과정]
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			std[i]=new Student2();
			//여기서 new없으면 오류남!
			
			System.out.print((i+1)+"번째 이름을 입력 : ");
			std[i].name=scan.next();
			
			System.out.print((i+1)+"번째 학생 국어 점수 : ");
			std[i].kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생 영어 점수 : ");
			std[i].eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생 수학 점수 : ");
			std[i].math=scan.nextInt();
			
		}
		
		//[출력과정]
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("%-7s%-5d%-5d%-5d\n",
					std[i].name,std[i].kor,std[i].eng,std[i].math);
		}

	}

}
