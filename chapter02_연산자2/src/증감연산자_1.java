/*
 *  증감연산자
 *  ++ : 1개증가
 *  -- : 1개감소
 *  ==> 반복문에서 주로 사용
 *  
 *  전치연산자 : ++a , --a
 *  후치연산자 : a++ , a--
 *  
 *  a++ => a=a+1
 *  
 *  =====================================
 *  
 *  int a=10;
 *  int b=++a; ==> a를 먼저 증가하고 b에 대입
 *        ---1번실행
 *      ---2번실행
 *  ==> a=11 , b=11
 *  
 *  int a=10;
 *  int b=a++; ==> b를 a값을 대입후에 나중에 a값을 증가
 *      ---1번실행
 *        ---2번실행
 *  ==> a=11 , b=10
 */
public class 증감연산자_1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=++a;
		System.out.println("a="+a+",b="+b);
		
		int c=10;
		int d=c++;
		System.out.println("c="+c+",d="+d);
		
		int e=10;
		int f= ++e + ++e + e++; //e값은 증가된 수만큼
		     //11  +  12 +  12  
		System.out.println("e="+e+",f="+f);
		
		int aa=10;
		int bb= aa++ + aa++ + ++aa; 
		       //10  +  11  +  13  
		       //처음은 증가가 안되지만 지나가면서 ++이 계산되서 11이됨
		System.out.println("aa="+aa+",bb="+bb);
		
		int h=10;
		int i= ++h + h++ + ++h + h++; 
		    // 11  +  11 +  14 +  14  
		System.out.println("h="+h+",i="+i);
		
		int aa1=10;
		int bb1= aa1++ + aa1++ + aa1++ + aa1++; 
		       //  11  +  12   +  13   +  14  
		System.out.println("aa1="+aa1+",bb1="+bb1);
		
		int a1=10;
		int b1= a1-- + a1++ + --a1 + a1++; 
		       //  11  +  12   +  13   +  14  
		System.out.println("a1="+a1+",b1="+b1);
		
	}
}
