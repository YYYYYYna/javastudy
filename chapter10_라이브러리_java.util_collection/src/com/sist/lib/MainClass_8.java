package com.sist.lib;
/*
 *     데이터 베이스는 중복데이터가 많은데
 *     중복데이터는 => ArrayList
 *     중복이 없는 데이터 => HashSet
 *     두개를 저장해서 찾는다 => HashMap : 클래스/sql문장 찾기에 주로 사용
 *                        ------- Annotation으로 추후 바뀜
 *                                ----------인터페이스처럼 하나의 에러가 전체에 영향을 끼치지않음
 *                                
 *     Map => 인터페이스(349page)
 *     ---
 *      |
 *     ------------------
 *     |                |
 *     Hashtable        HashMap => Hashtable을 보완
 *                              => 동기 / 비동기 // 보통은 비동기를 많이 사용함
 *                              => Ajax
 *     특징)
 *        두개를 동시에 저장(key,value)
 *        key는 중복할 수 없다 , value는 중복이 가능
 *        ("id","hong"),("id","shim") 이렇게는 가능
 *     사용처)
 *        웹에서 제공하는 90% 클래스 => Map을 이용하고 있다
 *        데이터 전송
 *          HttpServletRequest : 서버에서 브라우저 전송
 *          setAttribute("id","hong")
 *          setAttribute("pw","1234")
 *          => session / cookie(최신방문)
 *          
 *          
 *     라이브러리)
 *        Spring ==> HashMap => key로 클래스 객체의 관리와 찾기를 진행
 *                                                  ---getBean("key")
 *               : 객체의 생성부터 소멸까지 관리하는 역할
 *                 여기서 Web은 라이브러리의 일부임....
 *        MyBatis ==> 데이터베이스와 관련 => ORM
 *                                  => key로 SQL문장들을 관리
 *                                  => 등록은 XML과 Annotation으로 함
 *        
 *     주요메소드)
 *        1) 저장 => put("key",value)
 *                      ----반드시 문자로 시작
 *        2) 읽기 => get(key)
 *           
 *           예) ISBN/책이름 , ko/한국...
 *        --------------------------------
 *        프로그램은 데이터가 많이 있음
 *         [정형 데이터를 구분하는 방법]
 *         ArrayList => 인덱스로 구분
 *         Set => 중복없음.구분할필요없음
 *         Map => key값으로 구분
 *         오라클 => Primary Key
 *         ----------------------
 *         [비정형 데이터를 구분하는법] => 분석 => 시각화 
 *          --------댓글,트위터...    -----------(빅데이터)
 *                                  정형화된 데이터로 변경 ===> 더 나아가서 예측(AI)도 가능
 *         
 *         Application은 exe가 필요(C,C++)
 *         웹/모바일 => java인데 현재는 kotlin으로 바뀌는 추세...
 *         분석 => python
 *         실시간 => 스칼라
 *         
 *     
 */
import java.util.*;

public class MainClass_8 {

	public static void main(String[] args) {
		
		//Map은 key와 value를 둘다 데이터형을 명명해야함 <type,type>이렇게
		Map<String,String> map=new HashMap<String,String>();
		//값 대입도 add가 아니라 put으로 하고! 두개씩 넣음
		map.put("id", "hong"); 
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("addr", "서울");
		map.put("phone", "010-1111-1111");
		//현재까지는 1명에 대한 값만 저장됨
		//System.out.println("ID : "+map.get("id"));
		
		//근데 키 데이터는 중복되면 안됨
		//그래서 중복값에 해당 객체를 오버라이딩함
		//키 데이터 중복걱정없이 반복돌리는법
		Set<String> set=map.keySet();
		System.out.println(set);//우선 키값만 모아주고
		//for문으로 키+키값호출 로 부르기 가능
		for(String key:set)
		{
			System.out.println(key.toUpperCase()+":"+map.get(key));
			//문제는 이렇게 출력하면 map의 출력순서가 달라짐
		}
		//이건 for문으로 키값 호출없이 데이터값만 가져오기
		for(String s:map.values())
		{
			System.out.println(s); 
		}
		/*
		 * clear() : 전체삭제. 오라클에서는 TRONCATE
		 * get() : 실제 데이터를 읽어온다
		 * put() : 데이터를 저장할때 사용
		 * isEmpty() : 데이터가 있는지 여부
		 * size() : 저장 갯수
		 * keySet() : 키만 가지고 온다
		 * 
		 */
		

	}

}
