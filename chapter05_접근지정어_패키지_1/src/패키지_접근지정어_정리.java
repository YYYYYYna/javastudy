/*
 *       [접근지정어]
 *        => 어느 클래스까지 접근할 수 있는지 설정
 *      **private : 자신의 클래스에서만 사용가능
 *                  => 멤버변수(저장된 데이터 보호목적=보안)
 *        default : 같은 패키지 안에서만 접근가능
 *                  => 사용빈도가 거의 없다
 *        protected : 같은 패키지 안에서 접근 가능 (default보다 약간큼)
 *                  : 상속을 받은 경우에 상속 내린 클래스의 패키지까지 접근이 가능
 *                  => 사용빈도가 거의 없다
 *      **public : 패키지와 관계없이 모든 클래스에서 접근 가능
 *                 => 클래스 => public class ClassName
 *                 => 메소드 => public 리턴형 메소드명()
 *                 => 생성자 => public 클래스명()
 *                 => 객체지향 프로그램은 객체와 객체의 상호작용을 통해 만들어짐
 *                                  --------
 *                                  2개이상을 연결해야함 => 메모리할당
 *                                                 => 교환시 필요한게 메소드
 *        => 멤버변수에서 사용가능 (지역변수에서는 사용이 불가능)
 *           [접근지정어] 데이터형 변수명;
 *           =private : 기본형 , 참조형 (사용자정의 => 배열/클래스)
 *            private int a;
 *            private boolean b;
 *            private int[] arr=new int[5];
 *            private Music music=new Music();
 *            이런식으로 사용가능하다는뜻
 *           
 *        => 생성자 (클래스명과 동일, 리턴형이 없다, 여러개 이용이 가능)
 *           public class A
 *           {
 *               A(){} => 이렇게쓰지마셈
 *               
 *               public A(){}
 *               public A(int a){} => 이렇게 쓰셈
 *           }
 *           
 *        => 멤버메소드
 *           [접근지정어] 리턴형 메소드명 (매개변수...)
 *           {
 *               접근지정어 => public(거의 public으로 쓰임)
 *           }
 *       ------------------------------------------------------------------------------------------    
 *       [패키지] : 폴더의 개념 => 관련된 클래스를 모아서 저장
 *                            ---------
 *                           패키지가 다르면 같은 이름의 클래스 사용 가능(MainClass계속사용가능한거처럼)
 *        => 패키지끼리 묶는 연습을 많이 해야함
 *           : 찾기 쉽기 위해 / 재사용성이 좋기 위해
 *           ① 관련된 데이터 끼리 묶음 => 같은 데이터형 => "배열"
 *                              => 다른 데이터형 => "클래스"
 *           ② 명령문을 (기능별로 분리)해서 묶으면 => "메소드"
 *           ③ 관련된 클래스끼리 묶으면 => "패키지"
 *           : 따라서 패키지 > 클래스 > 메소드
 *           : 이렇게 되면 HTML에서 찾아서 수정하는것보다 기능부분에 들어가서 수정하기 쉬움
 *        
 *        => 패키지를 사용하면 
 *           같은 패키지의 경우 : import 없이 사용 가능
 *           다른 패키지의 경우 : import를 사용해서 클래스를 읽어온다
 *                          -------
 *                          라이브러리 / 사용자 정의 클래스
 *        
 *        => 패키지 이름명 약속
 *           com/org.기관명.기능별압축
 *           따라서 DB연결은 com.sist.dao로 저장되어있음
 *                DAO는 액션(기능)만 모아둔 클래스
 *                model은 처리한 결과를 브라우저로 보냄
 *                VO는 데이터형만 모아둔 클래스
 *       ------------------------------------------------------------------------------------------ 
 *       [멤버변수] : 데이터 보호
 *                 --------
 *                    |
 *                  private => 다른 클래스에서는 사용이 불가능 하다.
 *                  -------변수의 기능을 생성
 *                         --------
 *                         class A
 *                         {
 *                            int a;
 *                         }
 *                         
 *                         A aa=new A(); //*메모리 공간 확보*
 *                           --aa라는 참조변수에 a를 저장한다.
 *                           => 나중에 부를때는 aa.a로 불러야함
 *                           
 *                         aa.a=100; //*메모리에 값을 저장*
 *                         System.out.println(aa.a);
 *                         
 *                         위의 *메모리 공간 확보*=읽기 와 
 *                             *메모리에 값을 저장*=저장 을 ==> 메소드화 
 *                                                   ==> getter(읽기) / setter(저장)
 *                                                   ==> String name;
 *                                                     =>public String getName()
 *                                                       {
 *                                                          return name;
 *                                                       }
 *                                                       get000() => age getAge()
 *                                                     =>public void setName(String name)
 *                                                       {
 *                                                          this.name=name
 *                                                       }
 *                                                   ==> 변수는 은닉화 메소드를 이용해서 변수사용이 가능 (=캡슐화)
 *       ------------------------------------------------------------------------------------------
 *       [분리]
 *        서버단 : 데이터를 관리
 *        클라이언트단 : 화면 출력 => main ==> JSP
 *       ------------------------------------------------------------------------------------------
 *       118page : 클래스 구조 확인하기
 *       122page : 객체생성에 대해 확인하기 (형식익히기)
 *       123page : 객체사용에 대해 확인하기
 *       127page : 접근지정어에 대해 익히기
 *       132page : 패키지에 관하여
 *       136page : import에 관하여
 *       140page : 메소드 공부하기
 *       152page : getter/setter 공부하기
 *       166page : 생성자에 관하여                   
 */
public class 패키지_접근지정어_정리 {

}
