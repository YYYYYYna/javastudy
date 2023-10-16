package com.sist.manager;

public class Super {
	private int a;
	protected int b;
	int c;
	public int d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	//b와d는 getter/setter없이도 sub()에서 접근 가능
	
}
