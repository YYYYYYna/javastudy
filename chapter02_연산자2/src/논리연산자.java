//   &&(직렬연산자:and)   ||(병렬연산자:or) 
/*
 *   사용처
 *   -----
 *   && => 기간이나 범위안에 포함
 *   || => 기간이나 범위가 아닌경우
 *   
 *   사용법
 *   -----
 *   ==> 조건에 사용할 수 있는 연산자 (부정연산자, 비교연산자)
 *   
 *   (조건) && (조건)         (조건) || (조건)  
 *     |        |
 *     ----------
 *         |
 *       결과값 
 *
 *   경우의 수
 *   -------
 *               &&            ||
 *   true true   ==>  true     ==>  true
 *   true false  ==>  false    ==>  true
 *   false true  ==>  false    ==>  true
 *   false false ==>  false    ==>  false
 *   
 *   그런데 &&와 ||는 효율적인 연산을 수행한다.
 *   따라서 
 *   &&는 앞이 false면 뒤에있는 조건은 수행하지 않는다(결국 false니까)
 *   ||는 앞이 true면 뒤에있는 조건은 수행하지 않는다(결국 true니까)
 *   
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
