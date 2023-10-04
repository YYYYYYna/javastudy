
public class 메소드_8 {
	//여기서 선언하는게 전역변수
    static void increment()
    {
    	int num=1;//지역변수 : 메소드안에서만 사용됨
    	System.out.println(num);
    	num++;//지역변수는 메소드안에서만 사용되기 때문에 실행시 num=1에서 변하지 않음
    }
    /*
     * 위와같이 메소드를 생성했을때
     * increment() => num=1
     * increment() => num=1
     * increment() => num=1
     * 이런식으로 증가하지 않고 계속 1이 나옴
     * num은 해당 메소드가 종료됨과 동시에 사라짐으로
     * num++이 수행되었던 값도 삭제가됨!!!! 적용안됨!!
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
