/*
학번 : 202301741
이름 : 고선우
 */
import java.util.Scanner;
class Calculator {
    int a;
    int b;

    public void setOperand(int a1, int a2) {
        a = a1;
        b = a2;
    }

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }
}

public class cac1 {
    public static void main(String[] args) {
        Calculator cs = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.print("첫 번째 수를 입력하세요: ");
        int a = in.nextInt();
        System.out.print("두 번째 수를 입력하세요: ");
        int b = in.nextInt();

        cs.setOperand(a, b);

        System.out.println("더하기: " + cs.add());
        System.out.println("빼기: " + cs.subtract());
        System.out.println("곱하기: " + cs.multiply());
        System.out.println("나누기: " + cs.divide());
    }
}
