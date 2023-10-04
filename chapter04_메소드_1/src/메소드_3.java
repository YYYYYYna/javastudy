
public class 메소드_3 {
	//리턴값을 받는 경우
	static int plus(int a, int b)
	{
		System.out.println("==== plus()메소드 call ====");
		System.out.println("요청처리 종료..");
		System.out.println("결과값을 전송..");
		return a+b;
		//return 밑에는 코딩할 수 없음
	}
	/*
	 *   main에서는 가급적이면 과정을 처리하지 않는다. => 시작메소드 호출로 처리
	 */
	public static void main(String[] args) {
		int a=plus(10,20);
		//이렇게 return형이 있는 경우에는 변수를 받아서 실행해야함
		System.out.println("결과값:"+a);

	}

}
