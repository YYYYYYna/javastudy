package com.sist.common;
//웹에서는 구분자 없이 사용함 => 대신 파일명(중복없음)으로 구분자 대신함
//현재실습에서는 구분자 사용하고 있음
public class Funtion {
	//각자 서버에서 요청값을 아래번호로 받으면 해당 메소드를 실행하도록 구분자 생성하는중임
	//=내부프로토콜 (예)80=인터넷실행) , 포트번호와 비슷한 개념
	public static final int LOGIN=100;
	public static final int MYLOG=110;//MY가 붙은 부분은 예를 들어 로그인이라면 그 이후 실행된 처리를 뜻함
	public static final int WAITCHAT=200;
	public static final int EXIT=900;
	public static final int MYEXIT=910;//MY로 나누는 이유는 실제 "나간"사람과 "나가는중인"사람이 다 다르기 때문
	//모든 내용이 서버에서 지시를 내리고 => 클라이언트가 수행 => 같은 내용(공유)
	//MY부분은 "요청"과 "완료" 부분을 나누기 위해 만들어짐
	
	
}
