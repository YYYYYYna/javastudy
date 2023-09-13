
public class 예제문제0913 {

	public static void main(String[] args) {
	    int num1=(int)(Math.random()*100)+1;
	    int num2=(int)(Math.random()*100)+1;
	    int re1=num1-num2;
	    int re2=num1*num2;
	    System.out.println("num1 : "+num1+" ,num2 : "+num2);
	    System.out.println("뺄셈 : "+re1);
	    System.out.println("곱셈 : "+re2);
	    
	    int num4=(int)(Math.random()*4)+1;
	    int num5=(int)(Math.random()*4)+1;
	    int num6=(int)(Math.random()*4)+1;
	    int re3=num4*num5+num6;
	    System.out.println("num4 : "+num4+" ,num5 : "+num5+" ,num6 : "+num6);
	    System.out.println("결과값 : "+re3);
	    
	    int num7=(int)(Math.random()*100)+1;
	    int num8=(int)(Math.random()*100)+1;
	    int re4=num7%num8;
	    System.out.println("num7 : "+num7+" ,num8 : "+num8);
	    System.out.println("결과값 : "+re4);
	    
	    int a = 5;
	    int b = 5;
	    System.out.println("a와 b가 같은가요?" + (a==b));
	    System.out.println("a가 b보다 큰가요?" + (a>b));
	    System.out.println("a가 b보다 작은 가요 ?" + (a<b));
	    System.out.println("a가 b와 같은면서 3보다 큰가요?" + (a==b && a>3));
	    System.out.println("a가 50이 아닌가요? " + (a!=50));
	    
	    //두개의 print 차이 기억하기
	    System.out.println("System.out.printf(\"a의 값: %d \\n\", a);"); 
	    System.out.printf("a의 값: %d \n", a);
	    System.out.println("System.out.println(\"a의 값: \"+ a); "); 
	    System.out.println("a의 값: "+ a);   

	}

}
