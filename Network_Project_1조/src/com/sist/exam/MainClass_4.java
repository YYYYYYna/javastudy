package com.sist.exam;
//쓰레드는 하나의 프로그램안에 여러개를 수행할수 있다
public class MainClass_4 implements Runnable{
	/*
	//임플리먼츠 방식
	public void run()
	{
		System.out.println("run Call.....");
	}
*/
	public static void main(String[] args) {
		/*
		//임플리먼츠 방식
		MainClass_4 m=new MainClass_4();
		Thread t=new Thread(m);
		t.start();
		*/
		/*
		//방법3:익명의함수()=>run : 람다식(메소드명 없이 사용=>코딩이간결)
		Runnable r=()->{
			System.out.println("run Call...");
		};
		Thread t=new Thread(r);
		t.start();
		*/
		
		//방법4
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run call........");
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		/*
		 *    function aaa(){} => implements
		 *    let aaa=function(){}
		 *    let aaa=() =>{} =>
		 *    메소드는 메소드명이 주소이다
		 */
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
