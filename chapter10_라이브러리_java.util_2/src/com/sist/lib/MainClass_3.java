package com.sist.lib;

import java.text.MessageFormat;

public class MainClass_3 {

	public static void main(String[] args) {
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String phone="010-1111-1111";
		
		//오라클의 경우엔 INSERT => 문자열:'' , 정수는 그대로
		String sql="INSERT INTO member VALUES('"+name+"','"+sex+"',"+age+",'"+addr+"','"+phone+"')";
		System.out.println(sql);
		//위의 방법 너무복잡함....
		System.out.println("==========변환이용1==========");
		sql="INSERT INTO member VALUES(''{0}'',''{1}'',"+"{2},''{3}'',''{4}'')"; //''가 겹침으로 한번씩 더 적어줘야함
		Object[] obj={name,sex,age,addr,phone};
		System.out.println(MessageFormat.format(sql, obj));

	}
	//***DecimalFormet , ***SimpleDataFormat , MessageFormat
	//출력 형식으로 변환 => java.text

}
