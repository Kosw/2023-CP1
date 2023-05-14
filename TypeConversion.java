/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project03;

public class TypeConversion {
	public static void main(String[] args) {
		int i;//int형 변수를 만든다.
		double f;//double형 변수를 만든다.
		//3-1
		f = 5 /4;//double형 f에 5 / 4를 입혁한다.
		System.out.println(f);//5랑 4는 정수라서 소수점이 사라지고 1.0만 출력된다
		//3-2
		f = (double) 5 /4;//double형 f에 5 / 4를 double로 계산해서 입혁한다.
		System.out.println(f);//double로 계산하고 f에 넣었기때문에 1.25가 나온다.
		//3-3
		i = (int) 1.3 + (int) 1.8;//1.3을 int형으로 바꾸면 1, 1.8도 int형으로 바꾸면 1이기때문에 1+1이 i에 입력된다.
		System.out.println(i);//입력된 2가 출력된다.
		
		}
}
