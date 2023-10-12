//패키지 생성시에 이름에 키워드(int...)쓰면 안됨!!

/*
 * 이전 기수 자료를 보면 패키지가 아래로 나눠져 있는데
 * 모델 : 처리한 결과를 브라우저로 보냄
 * 이에이오 : 데이터베이스 연동
 * vo : 
 * 암튼 이런식으로 패키지 별로 나누는데 프로젝트를 할때는 
 * 하나 책임지고 만들수 있는 능력이 필요함
 */

package com.sist.main;
//     소속기관.기관명.분류명칭

import com.sist.util.User;
//다른 패키지 부를때는 import 를 사용해야함

public class MainClass {
	public static void main(String[] args) {
		
		MainClass2 m=new MainClass2();
		//같은 패키지는 별도의 import과정 없이 바로 부를수 있음
		
	}

}
