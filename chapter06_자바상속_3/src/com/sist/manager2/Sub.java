package com.sist.manager2;

import com.sist.manager.*;
public class Sub extends Super {
	/*
	 * [Super에서 상속받은 내용 : 변수, 메소드]
	 * private int a;
	 * : 자신의 클래스 안에서만 접근가능
	 * 
	 * protected int b; 
	 * : 같은 패키지 혹은 상속내린 패키지에 접근가능
	 * 
	 * int c;
	 * : 같은 패키지 안에서 접근가능
	 * 
	 * public int d; 
	 * : 모든 클래스에서 접근가능
	 * 
	 * : getter/setter가 없을 경우에는 b,d만 사용가능하다
	 */
	public Sub() {
		this.getA(); //getter.setter를 통해 접근가능
	}
}
