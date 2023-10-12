
public class try_catch_예제 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			//try-catch안에 들어간 문장은 에러가 있어도 넘어가서 마지막 문장까지 실행시켜줌
			int a=10/0;
		}catch(Exception ex) {}
		System.out.println("프로그램 종료");
	}

}
