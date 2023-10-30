package com.sist.lib;
/*
 *       코테에서 자바, 오라클, 스프링 문제가 주로 나옴
 *       자바와 오라클은 7문제 나오는데 이건 적어도 6문제는 맞을 각오로 공부해야함...
 *       ----------------------------------------------------------------------
 *       라이브러리
 *       **= java.lang
 *           Object
 *           String
 *           StringBuffer
 *           Math
 *           Wrapper
 *           -------------
 *       **= java.util
 *           StringTokenizer
 *           Date / Calendar
 *           ArrayList
 *           HashSet
 *           HastMap
 *           -------------
 *       **= java.io
 *           FileInputStream / FileOutputStream
 *           FileReader / FileWriter
 *           BufferedReader
 *           BufferedInputStream / BufferedOutputStream
 *           -------------------------------------------
 *         = java.sql : Connection / Statement / ResultSet
 *         = java.text , java.net : URL ...
 *           ------------------------------------------------자바를 사용하는 모든 소스의 기본
 *         = java.http.serblet (Web) ==> JSP
 *         = 외부 라이브러리
 *           org.springframework...
 *           org.mybatis...
 *           org.jsoup...
 *           
 *         = 사용자 정의
 *           => 기본
 *              = 변수 : 데이터형에 따라서 어떻게 명명할지
 *                      정수 : int , long , byte
 *                      실수 : double
 *                      논리 : boolean
 *                      문자열 : String
 *              = 연산자
 *                  증감연산자
 *                  부정연산자
 *                  형변환연산자
 *                  산술연산자
 *                  비교연산자
 *              = 제어문
 *           => 클래스
 *              = 멤버변수 / 공유변수
 *              = 메소드
 *              = 생성자
 *                = 초기화 블록
 *                  --------
 *                  인스턴스 블록 : 인스턴스변수, static변수 초기화 가능
 *                  static 블록 : static변수만 초기화가 가능
 *                               => 인스턴스 변수 초기화시에는 반드시 객체생성 후에 사용
 *           => 특성
 *              = 캡슐화 , 상속/포함 , 오버라이딩
 *              1. 데이터 보호의 목적
 *              2. 재사용의 목적
 *                 수정해서 사용 : 상속
 *                 있는 그대로 사용 : 포함
 *              3. 수정/추가 용이하게 만든다 (다형성)
 *                 수정 : 오버라이딩
 *                 추가 : 오버로딩
 *                 **오버라이딩과 오버로딩의 형태, 메소드명, 매개변수, 리턴형, 접근지정어에 따라
 *                   어떻게 쓰이는지 외우는것이 중요함
 *              ---------------------대규모 프로젝트에서 주로 사용
 *           => 클래스의 종류
 *              = 인터페이스 (80%~이기때문에 상당히 중요함)
 *                -------
 *                : 관련된 클래스를 모아서 관리
 *                : 결합성을 낮은 프로그램(영향을 줄이는 프로그램)
 *                : 상속으로 사용하며 다중상속(=implements)이 가능
 *                interface ==extends== interface
 *                interface ==implements== class
 *                class ==implements== interface A,B
 *                구성요소)
 *                   interface interfaceName
 *                   {
 *                      --------------------
 *                       변수
 *                        => public static final 데이터형 변수명=값
 *                           -------------------       -------
 *                            자동 추가(상수형 변수)
 *                           예)public int a=10;
 *                                 ------
 *                              static final이 자동 추가됨
 *                      --------------------
 *                       메소드(선언)
 *                           public abstract void 메소드명();
 *                                  --------
 *                                  =자동추가됨
 *                      --------------------
 *                       메소드(구현)
 *                           public default 리턴형 메소드명(){}
 *                                  -------구현이 가능한 메소드를 알려준다
 *                           ------생략하면 자동추가
 *                           public static 리턴형 메소드명(){}
 *                           => 항상 인터페이스를 통해서만 접근 가능
 *                      --------------------
 *                   }
 *                   *****new를 이용하지 않고 객체생성 => 추상클래스, 인터페이스
 *                        File file=new File()
 *                        List list=new List() => 오류
 *                        List list=new ArrayList() => 수많은메소드를오버라이딩해야함...
 *           => 제어어
 *              static / abstract / final
 *           => 접근지정어
 *              private / default / public
 *              
 *      ***java에서 주로 사용하는것
 *         1. 웹
 *         2. 모바일  
 *         --------->지금정리된 내용은 거의 사용됨...   
 *         
 */
import java.util.*;
public class MainClass_lib_1 {

	public static void main(String[] args) {

	}

}
