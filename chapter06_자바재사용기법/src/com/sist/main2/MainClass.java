package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
public class MainClass {

	public static void main(String[] args) {
		//1. 묵시적 형변환(자동형변환)
		Super su=new Sub();
	    //=> double su=10; 이런형태라고 보면됨
		
		//2. 강제형변환
		//Sub s=su;//에러남
		//=> int su=10.0; 이런형태라서 에러난다고 보면됨
		Sub s=(Sub)su;
		//=> int su=(int)10.0; 이런형태라고 보면됨
		
		//[객체비교시사용연산자:instanceof]
		String str="";
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		
		//str보다 Object가 크냐고 물어보는뜻 = true
		if(str instanceof Object)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		//모든 클래스는 Object 상속이기 때문에 = true
		if(sb instanceof Object)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		//obj는 String으로부터 상속을 받았냐고 물어보는뜻 = false
		if(obj instanceof String)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
