class BB
{
	int a=10;
	
	//void가 붙이면 생성자가 아니고 일반함수임!!
	void B(){
		System.out.println("B클래스의 defalut생성자 호출");
	}
	/*
	 * [생성자를 만드는 경우]
	 * 
	 * 1. 초기화가 필요한경우 (명시적인 초기화가 불가능할때)
	 *    => 제어문, 파일읽기
	 *    
	 * 2. 시작과 동시에 처리가 필요할때(=가장 먼저 호출되야함)
	 *    => 자동로그인, 윈도우 화면설정, 
	 *       서버를 연결하고 들어갈때, 데이터베이스를 연결할때
	 */
}
public class MainClass6_1 {

	public static void main(String[] args) {
		
		BB b=new BB();
		//일반함수는 이렇게 불러와야함
		b.B();
		
		

	}

}
