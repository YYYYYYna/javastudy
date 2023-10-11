import java.util.*;

class A
{
	//static을 쓰면 b에 저장된 값이 여기에 저장이 되서 뒤에 a를 다시 출력해도 b의 값이 나온다
	static int[] arr=new int[5];
	//클래스 영역에는 선언만 가능하다.
	//arr[0]=1; 값 대입 불가능 초기화블록 사용해야함
	A() {//혹은 생성자 블록 사용
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100+1);
		}
	}
}

public class MainClass4 {

	public static void main(String[] args) {
		A a=new A(); //arr=>저장
		System.out.println(Arrays.toString(a.arr));
		
		A b=new A(); //arr에 따로저장됨
		System.out.println(Arrays.toString(b.arr));
		System.out.println(Arrays.toString(a.arr));
		//static을 쓰면 b에 저장된 값이 여기에 저장이 되서 뒤에 a를 다시 출력해도 b의 값이 나온다
		//모든 사이트가 같은 내용을 출력하는걸 static으로 설정함
		//예를들어 게시판부분을 static으로 공유해서 틀을 유지하며 내용만 바꾼다.
	}

}
