
//substring() => 문자를 자른다.
/*
 *    "Hello Java"
 *     0123456789 → index번호
 *     
 *    substring(6) => "Java"
 *    
 *    substring(0,4) => "Hell"
 *    =substring(시작번호,끝번호-1)
 */
public class 문자열__4 {

	public static void main(String[] args) {
		String s="Hello Java";
		//String s1=s.substring(0, 5);//처음숫자부터 마지막숫자-1까지
		//System.out.println(s1);
		String s1=s.substring(6);//해당숫자부터 끝까지
		System.out.println(s1);
		
		//indexOf() : 앞쪽에서부터 index 번호 찾는것 (긴 문장의 경우에는 index로 자르는것이 아님)
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
		String addr1=address.substring(0,address.indexOf("지번"));//index 숫자 대신 값을 대입하여 자를수 있음
		System.out.println(addr1);
			
		String addr2=address.substring(address.indexOf("지번")+3);//+3은 "지번" 다음 3글자부터 출력하도록 명명
		System.out.println(addr2);
		
		//신사동만 출력하기 1
		String addr3=address.substring(address.indexOf("신사"),address.indexOf("동")+1);
		System.out.println(addr3);
		
		//lastIndexOf() : 뒤쪽에서부터 index 번호 찾는것
		//신사동만 출력하기 2
		int a=address.lastIndexOf(" ");//뒤쪽에서부터 찾는것
		String addr4=address.substring(a-3,a);
		System.out.println(addr4);
		
		String ext="Hello.Java.java";
		String ss=ext.substring(ext.lastIndexOf(".")+1);//.다음값부터 필요함으로 +1을 넣어야함
		System.out.println(ss);
		
		

	}

}
