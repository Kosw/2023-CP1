
/*
학번 : 202301741
이름 : 고선우
 
import java.util.Scanner;//스캐너 사용하기위해 라이브러리 불러옴

abstract class Calc {// Calc 추상클래스 생성
  int a;// 인스턴스 변수 생성
  int b;// 인스턴스 변수 생성

  public void setValue(int a, int b) {// 메소드 생성
    this.a = a;// 입력받은 값 인스턴스 변수안에 넣어주기
    this.b = b;// 입력받은 값 인스턴스 변수안에 넣어주기
  }

  public abstract int calculate();// 추상메소드 생성,오버라이딩해야해서 필요
}

class Add extends Calc {// Calc를 상속받는 Add클래스 생성
  public int calculate() {// 계산하는 메소드 생성,오버라이딩
    return a + b;// 더한 후 반환
  }
}

class Sub extends Calc {// Calc를 상속받는 Sub클래스 생성
  public int calculate() {// 계산하는 메소드 생성,오버라이딩
    return a - b;// 뺀 후 반환
  }
}

class Mul extends Calc {// Calc를 상속받는 Mul클래스 생성
  public int calculate() {// 계산하는 메소드 생성,오버라이딩
    return a * b;// 곱한 후 반환
  }
}

class Div extends Calc {// Calc를 상속받는 Div클래스 생성
  public int calculate() {// 계산하는 메소드 생성,오버라이딩
    return a / b;// 나눈 후 반환
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);// 스캐너 객체 생성
    System.out.print("Enter two integer number and an operator >> ");// 출력
    int a = in.nextInt();// 정수 입력받기
    int b = in.nextInt();// 정수 입력받기
    String c = in.next();// 정수 입력받기
    Calc result = null;// Calc 클래스의 새 인스턴스 result를 선언하고 null로 초기화
    switch (c) {// 입력받은 기로에 따라 아래를 실행
      case "+":// 더하기면 아래를 실행하고 브레이크
        result = new Add();// result에 Add반환값을 입력
        break;
      case "-":// 빼기면 아래를 실행하고 브레이크
        result = new Sub();// result에 Sub반환값을 입력
        break;
      case "*":// 곱하기면 아래를 실행하고 브레이크
        result = new Mul();// result에 Mul반환값을 입력
        break;
      case "/":// 나누기면 아래를 실행하고 브레이크
        if (b == 0) {// 만약 b가 0이라면 아래를 실행
          System.out.println("Can't Divide.");// 나눌 수 없다고 출력
          break;
        } else {
          result = new Div();// result에 Div반환값을 입력
          break;
        }
    }

    if (result != null) {// 케이스 4개중에 해당돼서 입력받은게 있으면 아래를 실행
      result.setValue(a, b);// a,b를 setValue에 입력
      System.out.println(result.calculate());// 계산 후 출력
    }
  }
}

*/