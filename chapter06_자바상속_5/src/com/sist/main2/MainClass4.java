package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
public class MainClass4 {
	static String str;
	public static void main(String[] args) {
		
		//Super>Sub라서 따로 형변환 필요없음
		Super s=new Sub();
		
		//Super>Sub라서 따로 형변환 필요함!!
		//Sub s=new Super();//에러남!!
		//Super>Sub라서 이렇게 형변환을 거쳐서 받아야함
		Sub ss=(Sub)s;

	}

}
