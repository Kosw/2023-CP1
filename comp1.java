/*
학번 : 202301741
이름 : 고선우
 */
import java.util.Scanner;//스캐너 사용하기위해 라이브러리 불러옴
class Add{//Add 클래스 생성
    int a = 0;//int형 인스턴스 변수 생성
    int b = 0;//int형 인스턴스 변수 생성
    void setValue(int a,int b){//메소드 생성하고 입력받은 수를 위에 인스턴스 변수에 입력
        this.a = a;
        this.b = b;

    }
    int calculate(){//계산하는 메소드 생성 아래를 반환
        return a + b;
    }
}
class Sub{//Sub 클래스 생성
    int a = 0;//int형 인스턴스 변수 생성
    int b = 0;//int형 인스턴스 변수 생성
    void setValue(int a,int b){//메소드 생성하고 입력받은 수를 위에 인스턴스 변수에 입력
        this.a = a;
        this.b = b;

    }
    int calculate(){//계산하는 메소드 생성 아래를 반환
        return a - b;
    }
}
class Mul{//Mul 클래스 생성
    int a = 0;//int형 인스턴스 변수 생성
    int b = 0;//int형 인스턴스 변수 생성
    void setValue(int a,int b){//메소드 생성하고 입력받은 수를 위에 인스턴스 변수에 입력
        this.a = a;
        this.b = b;

    }
    int calculate(){//계산하는 메소드 생성 아래를 반환
        return a * b;
    }
}
class Div{//Div 클래스 생성
    int a = 0;//int형 인스턴스 변수 생성
    int b = 0;//int형 인스턴스 변수 생성
    void setValue(int a,int b){//메소드 생성하고 입력받은 수를 위에 인스턴스 변수에 입력
        this.a = a;
        this.b = b;

    }
    int calculate() {//계산하는 메소드 생성 아래를 반환
        if (b == 0) {//b가 0이면 아래를 출력
            System.out.println("나눌 수 없습니다.");
            return 0;
        } else {
            return a / b;
        }
    }
}
class comp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// 스캐너 객체 생성
        System.out.print("Enter two integer number and an operator >> ");//출력
        int a = in.nextInt();//정수 입력받기
        int b = in.nextInt();//정수 입력받기
        String c = in.next();//문자열 입력받기
        switch (c) {//스위치 문
            case "+"://+면 아래를 출력
                Add a1 = new Add();//객체 생성
                a1.setValue(a, b);//입력받은 a랑 b 클래스에 입력
                System.out.println(a1.calculate());//결과값 출력
                break;
            case "-"://-면 아래를 출력
                Sub s = new Sub();//객체 생성
                s.setValue(a, b);//입력받은 a랑 b 클래스에 입력
                System.out.println(s.calculate());//결과값 출력
                break;
            case "*"://*면 아래를 출력
                Mul m = new Mul();//객체 생성
                m.setValue(a, b);//입력받은 a랑 b 클래스에 입력
                System.out.println(m.calculate());//결과값 출력
                break;
            case "/":///면 아래를 출력
                Div d = new Div();//객체 생성
                d.setValue(a, b);//입력받은 a랑 b 클래스에 입력
                System.out.println(d.calculate());//결과값 출력
                break;
        }
    }
}