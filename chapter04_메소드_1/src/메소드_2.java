
public class 메소드_2 {
	//매개변수를 받아서 사용하는 법 : plus라는 메소드를 임의로 생성하여 진행
	static void plus(int a, int b)
	//static은 메소드 자동저장을 시켜줌
	{
		System.out.println("==== plus()메소드 start ====");
		//시작
    	System.out.println("사용자 요청값(a):"+a);
    	System.out.println("사용자 요청값(b):"+b);
    	//사용자 요청값 출력
    	System.out.println("처리 결과값:"+(a+b));
    	//요청에 대한 처리 결과
    	System.out.println("==== plus()메소드 end... ====");
    	//기능 종료 => 메소드가 기능 처리
	}
	//프로그램 시작과 종료를 담당하는 메소드 => 여러개의 기능을 만들고 조립
	public static void main(String[] args) {
		//시작
		System.out.println("main start...");
		//기능 호출
		plus(10,20);//a=10 b=20이란뜻
		//종료
		System.out.println("main end...");

	}

}
