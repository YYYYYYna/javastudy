package com.sist.seoul;

//1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)
//1|도봉산|하늘을 깎아세운 만길 봉우리도봉(道峰)산은 이름 그대로 봉우리가 길인 산|132-010 서울특별시 도봉구 도봉동 경기 의정부시, 양주시 장흥면 일대

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("명소(1) / 자연(2) : ");
		int no=scan.nextInt();
		
		SeoulManager sm=new SeoulManager();
		Seoul[] seoul=sm.seoulAllData(no);
		for(Seoul s:seoul)
		{
			System.out.println(s.getNo()+"."+s.getName());
		}

	}

}
