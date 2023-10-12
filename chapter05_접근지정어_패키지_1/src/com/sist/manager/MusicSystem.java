package com.sist.manager;

import lombok.Getter;
import lombok.Setter;

//Music이랑 패키지 같으니까 import 안붙임
public class MusicSystem {
	//여러 유저에게 공유가 되야하기 때문에 static을 설정해야함
	//근데 static으로 설정하면 MainClass에서 접근이 불가능
	@Getter
	@Setter
	static Music[] musics=new Music[50];
	//////static의 장점은 자동으로 메모리가 할당되기 때문에 참조변수를 생성하지 않아도됨
	// ⓐ그래서! 일단 시작과 동시에값을 초기화로 가져오고!
	static
	//:static블록(static변수만사용가능/자동인식)으로 자동으로 초기화 해서 데이터를 집어넣으려함
	/////초기화 블록 특징 : 상속은 불가능, 호출없이 실행가능
	/////초기화 블록이 싫으면 생성자를 이용해서 초기화 진행해도됨
	{
		
	}
	// ⓑ리턴형으로 값을 넘겨주려함!!
	
	
}
