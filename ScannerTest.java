/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project02;

import java.util.Scanner;

public class ScannerTest {
    //TODO Auto-generated method stub
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //Scanner를 사용하기 위해 in이라는 이름을 지어줌.
    System.out.printf("Enter your name>> "); //"Enter your name>> "을 출력
    String name =in.next(); //문자열 name에 입력받는다
    System.out.printf("Enter your age>> "); //"Enter your age>> "를 출력한다.
    int age = in.nextInt(); //정수 age를 선언 후 입력받는다.
    
    System.out.println("your name is "+ name); //"your name is "을 출력하고 입력받은 name을 출력한다.
    System.out.println("your age is "+ age); //"your age is "을 출력하고 입력받은 age을 출력한다.
    in.close();
    }
}