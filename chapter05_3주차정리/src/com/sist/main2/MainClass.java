package com.sist.main2;
/*
 *   static메소드 / 인스턴스 메소드 
 *   -----------  => 인스턴스나 static 상관없이 사용이 가능 
 *      | static 변수 , static 메소드를 호출 
 *        인스턴스 변수 , 인스턴스 메소드는 반드시 객체 생성후에 사용
 *         => 클래스 생성 => 객체 생성 => 자동으로 this(자신의 객체)
 *                                          |
 *                                      멤버변수와 지역변수의 구분 
 *                              ** 변수가 동일한 이름이면 지역변수 우선 순위 
 *                              ** 지역변수,매개변수 찾고 => 없는 경우에는 멤버변수에서 찾는다
 *    예) class
 *       void dispaly(int a)
 *       {
 *           System.out.println(a); //해당메소드속a찾음
 *           System.out.println(this.a); //this변수의a찾음
 *       }
 *    ====> this : 객체
 *          this() => 생성자(자신의 생성자를 호출할때 사용)
 *          ------
 *          => 생성자에서 사용이 가능
 *          => 생성자 첫줄에 온다
 *          예) class A
 *             {
 *                A()
 *                {
 *                }
 *                A(int a)
 *                {
 *                   this(); //자신의생성자호출
 *                   super(); //상위클래스의생성자호출
 *                   System.out.println("aaa");
 *                   this();//첫줄이 아니라 오류발생
 *                }
 *             }
 */
class Student
{
	int hakbun; //디폴트초기값:0
	String name; //디폴트초기값:null
	String sex; //디폴트초기값:null
	
	public Student() {
		System.out.println("디폴트 생성자 호출...");
		
		//디폴트 생성자 호출=class Student값 초기화한다는뜻
		hakbun=1; 
		name="홍길동"; 
		sex="남자";
		//원래는 this.sex="남자"; 이렇게 써야하는데
		//지역변수와 충돌이 없다면(=지역변수로 this를 사용하지 않았다면)
		//this.=>생략가능
	}
	
	public Student(int hakbun, String name)
	{
		//   멤버변수  매개변수
		this.hakbun=hakbun;
		//여기서는 멤버변수와 지역변수가 충돌이 일어나기 때문에 this.를 적어줘야함
		this.name=name;
	}
	
	//예제1
	                  //this.충돌은 이부분에 영향받지않음..?이라하심
	/*public Student(String sex)
	{
		//이렇게 this()메소드를 사용하면 해당 메소드에서 디폴트초기값이 부분에 
		//this()의 부분이 들어감 (증거:디폴트 생성자 호출...가 다시출력됨)
		this();
		this.sex=sex;
		//this();이자리에 들어가면 오류남
		//그럼 원래 이 값은 0 , null , 여자 였는데
		//this()를 통해서 1 , 홍길동 , 여자 로 바뀜
	}
	
	//[오버로딩기법] : 같은 메소드명으로 새로운 기능을 만든다
	/*public Student(int h, String n, String s)
	{
		//이번엔 변수명이 다름으로 충돌X = this.필요없음
		hakbun=h;
		name=n;
		sex=s;
	}*/
	
	//예제2 => this는 매개변수값도 반환해준다 => 갯수에 따라 불리는 메소드가 다르도록 동작시킬수 있음
	public Student(String sex)
	{
		this();
		this.sex=sex;
	}
	public Student(int h, String n, String s)
	{
		this(s);
	}
	
	public void print()
	{
		System.out.println("학번 : "+hakbun);
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+sex);
	}
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
	 *    
	 *    => 해당내용은 MainClass_1에 다시 정리해둠 
	 */
}
public class MainClass {
	public static void main(String[] args) {
		//디폴트 생성자 호출 (=매개변수없는거)
		Student s1=new Student();
		s1.print();
		
		//매개변수 1개짜리 출력 => 성별부분만 바뀜 / 학번,이름=null
		Student s2=new Student("여자");
		s2.print();
		
		//Q. 앞부분은 1,홍길동,여자로 출력하려면
		
		//매개변수 2개짜리 출력 => 학번,이름부분만 바뀜 / 성별=null
		Student s3=new Student(2,"심 청");
		s3.print();
		
		//매개변수 2개짜리 출력 => 학번,이름,성별 다 바뀜 
		Student s4=new Student(3,"박문수","남자");
		s4.print();
		
		
		
		
		/////메모리 공간이 다르기 때문에 원본 클래스값이 저장되어있음
		/////그런데 new를 사용해서 메모리를 계속 재생성해서 수정함
		/////그럼 원본에 수정값이 적용된 값으로 새로운 메모리가 생기는거임
		/////이전의 객체 대입 [얕은복사예시]와 다름
	}

}
