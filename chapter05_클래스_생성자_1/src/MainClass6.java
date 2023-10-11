class B
{
	int a=10;
	
	//초기값:생성자
	B(){
		System.out.println("B클래스의 defalut생성자 호출");
	}
}
public class MainClass6 {

	public static void main(String[] args) {
		
		//생성자 호출시 이렇게 호출하면 오류남
		//B(); 
		//생성자는 반드시 new를 붙이고 호출해야 가능
		new B(); 
		
		//new를 붙이면 새로운 메모리를 생성하기 때문에 위의 a와 아래의 a가 다름
		new B().a=100;
		System.out.println("B의 a의 값 : "+new B().a);
		
		//b라고 객체생성해서 주소를 따로 저장해두고 a를 넣어두면 a값이 불변 
		B b=new B();
		b.a=100;
		System.out.println("B의 b의 a의 값 : "+b.a);
		
		//아래에 다시 new를 생성해도 여전히 위의 a값이 나옴
	    new B().a=1000;
	    System.out.println("new B의 b의 a의 값 : "+b.a);
		
		

	}

}
