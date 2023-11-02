package com.sist.exam;
/*
 *        웹서버
 *        ----아파치/IIS => 톰캣(테스트용 => 웹서버)
 *                        => WAS
 *        데이터베이스 서버 : 오라클(서버)
 *        서버는 한개 수행(사용자 요청에 대한 처리 ==> 쓰레드)
 *     
 *     ==>사용자 정의 쓰레드
 *        => 서버개발자
 *        => 서버측 사이드(서버에서 동작하게 코딩) => 백엔드
 *        => 방법1:쓰레드상속
 *           public class MyThread extends Thread
 *           {
 *              Thread 확장
 *       
 *              public void run()
 *              {
 *                 //=>이부분에서 쓰레드가 동작하도록 구성
 *                 //1가지만 수행할 수 있게 만든다
 *              }
 *           }
 *        => 방법2:확장없이 동작만 할수 있도록
 *           =인터페이스 구현(=윈도우에서 주로 사용)
 *           public class MyThread implements Runnable
 *           {
 *              public void run()
 *              {
 *                 =>확장없이 동작만...
 *              }
 *           }
 *        => 방법3:익명의함수()=>run : 람다식(메소드명 없이 사용=>코딩이간결)
 *                              : 단점=재사용(객체지향을 벗어난다)
 *           Runnable r=() -> {
 *               //구현부
 *           }
 *        
 *        => 쓰레드 생명 주기 (생성~소멸)
 *           쓰레드 생성 
 *           Thread => java.lang
 *            ****run()은 호출하지 않는다
 *                start(){run()}
 *           new Thread() =================> start() ==============> run() ======> sleep()
 *           쓰레드 생성 ===============> 대기(쓰레드 필요한 자원 확보) =====> 쓰레드 동작 ==2==> 일시정지
 *                                                                     |
 *                                                                  1쓰레드종료
 *                                                                     ↓
 *                                                                 interrupt()
 *           start() => run()수행
 *           sleep() => 일시정지
 *           interrupt() => 쓰레드 소멸
 *           => 쓰레드는 시분할 프로그램
 *                    -----나눠서 작업
 *           예) 1~10 => 출력
 *              => new Thread() => 1
 *                 1) JVM
 *                    => 이름부여 ==> Thread-0 => 변경
 *                    => 우선순위 ==> 사용자 정의 => 5
 *                       1~10 => 5
 *                       10 => main (=메인에 가장 높은 우선순위줌)
 *                       1 => gc
 *              => new Thread() => 1
 *              => new Thread() => 1
 *                 ==> 근데 쓰레드는 우선순위(가상머신이설정함)이 있기 때문에 한번씩 수행한 이후 다음 순위가 몇번쓰레드인지 예측 불가능
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(100); //  1/1000초
			}catch(Exception ex) {}
		}
	}
}
public class MainClass_1 {
	
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		//동작 => run() => start()
		t1.start(); //Thread-0 
		t2.start(); //Thread-1
		t3.start(); //Thread-2
		//지금 이게 비동기화 결과가 나와서 1~10이 3번(1~10,1~10,1~10) 
		//나오는게 아니라 3번씩 10번(111,222,333...101010)이 나옴
		
		
	}

}
