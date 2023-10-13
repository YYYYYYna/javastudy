package com.sist.main;
/*
 *      [***자바 소스 코딩의 위치 형식]
 *         package => 한번만 사용가능
 *         import => 여러개 사용 가능
 *         public class ClassName
 *         {
 *             멤버변수선언
 *             생성자
 *             멤버메소드
 *             {
 *                 변수선언 => 지역변수 => 메소드호출이 종료되면 자동으로 사라진다
 *             }
 *             //=> 가독성 => 지금 순서로 코딩
 *         }
 *      -------------------------------------------------------------
 *      1. 접근지정어 : 접근이 가능한 범위를 설정
 *         -------
 *         1. private : 멤버변수 선언시 주로 사용
 *            => 자신의 클래스에서만 사용이 가능 (=은닉화)
 *            
 *         2. default : 윈도우(버튼,기타 컴포넌트)에서 사용:int num...
 *            => 접근 범위 : 같은 패키지에 있는 클래스
 *            
 *         3. protected : 사용빈도가 없다
 *            => 접근 범위 : 같은 패키지에 있는 클래스
 *                        다른 패키지까지 접근이 가능(상속)
 *                        
 *         4. public : 생성자, 클래스, 메소드...두루두루미 사용됨 => 다른 클래스 통신
 *            => 접근 범위 : 패키지 상관없이 모든 클래스에서 접근 가능
 *            
 *         접근지정어의크기비교)
 *              private < default < protected < public
 *              --------------------------------------
 *                |오버라이징 => 접근지정어의 축소는 불가능 확장은 가능
 *         
 *      2. 관련된 클래스를 모아서 관리 (=찾기쉽게)
 *         -------------------
 *         => [패키지] : 폴더개념(=클래스를 분리)
 *         
 *              패키지명칭) 키워드는 사용할 수 없다
 *                 com/org.회사명/기관명.분리단위
 *                 
 *              패키지분류)
 *                 VO => 클래스형 데이터
 *                 DAO => 데이터베이스 연동
 *                 Model => 브라우저로 전송
 *                 manager => 크롤링, 파일
 *                 service => 데이터베이스 여러개 한번에 처리(JOIN,SUBQUERY)
 *              
 *              패키지사용법)
 *                 패키지가 다른 경우(=다른 폴더에 클래스가 저장)
 *                 => 반드시 import를 이용해서 클래스를 읽어온다
 *                 패키지가 같은 경우(=같은 폴더에 클래스가 저장)
 *                 => import없이 클래스를 사용한다.
 *                    ------
 *                    라이브러리 혹은 사용자정의클래스도 호출에 사용
 *                               =import com.sist.dao.*
 *                 => 패키지를 사용하면 default로 선언된 메소드, 변수, 생성자는 사용할 수 없다.
 *       
 */
public class MainClass2_기타요소 {

}
