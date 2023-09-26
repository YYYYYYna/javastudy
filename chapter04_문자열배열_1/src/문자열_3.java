/*
 *          String toUpperCase() => 대문자로변환한 문자열
 *          String toLowerCase() => 소문자로변환한 문자열
 *          => 느낌표같은건 변환안됨!! 문자만
 *          
 *          대문자로 변환하는 것은 자주나옴 소문자는 가끔
 *          -> 오라클에서 대문자 구분을 필요로 함
 */
public class 문자열_3 {

	public static void main(String[] args) {
		String msg="Hello Java";
		//경우1: 변경만명명 원본변경X
		msg.toUpperCase();
		System.out.println(msg);//변경안됨!
		
		//경우2 : 변수재명명 원본변경O
		msg=msg.toUpperCase();//이렇게 다시 정정해줘야함
		System.out.println(msg);//바뀐값으로 출력
		
		msg=msg.toLowerCase();//이렇게 다시 정정해줘야함
		System.out.println(msg);//바뀐값으로 출력
		
		//경우3 : 출력때만변경 원본변경X
		System.out.println(msg.toUpperCase());
		//=>처리는가능,변경해서출력 : 그러나 원본은그대로
		System.out.println(msg);//위에 저렇게 설정해도 원본은 유지한다.

	}

}
