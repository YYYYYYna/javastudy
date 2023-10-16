package com.sist.main2;
/*
 *    //헌재 데이터형이 다 다름으로 오버로딩중임
 *    ⓐ void display(int a,int b,int c)
 *    ⓑ void display(char c, double d, int a)
 *    ⓒ void display(double d, double d1, double d2)
 *    
 *    //1. 이렇게 호출을 한다면?
 *    display(10.5,'A',100) => double , char , int
 *    //2. 일단 위의 void형중 똑같은걸 찾음
 *    //3. 근데 없으면? 해당 데이터형을 다 받을수 있는 void ⓒ 가져옴
 */

public class MainClass_1 {
	void display(int a,int b,int c)
	{
		System.out.println("a");
	}
	void display(char c, double d, int a)
	{
		System.out.println("b");
	}
	//일단은 받을수 있는 가장 큰 값을 가져오고
	
	void display(double d, double d1, double d2)
	{
	    System.out.println("c");	
	}
	
	
	//위처럼 근사치가 없다면 가장 비슷한 값을 가져옴
	void display(double d, int d1, int d2)
	{
	    System.out.println("d");	
	}

	public static void main(String[] args) {
		MainClass_1 m=new MainClass_1();
		m.display(10.5,'A',100);

	}

}
