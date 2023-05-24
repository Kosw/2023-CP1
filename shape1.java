/*
학번 : 202301741
이름 : 고선우

interface Shape {//인터페이스 생성
    final double PI = 3.14;//인스턴스 파이 설정
    void draw();//메소드 생성
    double getArea();//메소드 생성
    default public void redraw(){//메소드 생성
        System.out.print("--- 다시 그립니다. ");//출력
        draw();//draw실행
    }
}
class Circle implements Shape{//클래스 생성
    int r;//인스턴스 변수

    public Circle(int r){//메소드 생성
        this.r = r;//입력받은 값 인스턴스 변수에 넣어주기
    }

    public void draw(){//메소드 생성
        System.out.println("반지름이 " + r + "인 원입니다.");//출력
    }

    public double getArea(){//메소드 생성
        return r * r * PI;//반환
    }
}

class Rect implements Shape{//클래스 생성
    private int w;//인스턴스 변수
    private int h;//인스턴스 변수

    public Rect(int w, int h){//메소드 생성
        this.w = w;//입력받은 값 인스턴스 변수에 넣어주기
        this.h = h;//입력받은 값 인스턴스 변수에 넣어주기
    }

    public void draw(){//메소드 생성
        System.out.println(w + "x" + h + " 크기의 사각형 입니다.");//출력
    }

    public double getArea(){//메소드 생성
        return w * h;//반환
    }
}

class Triangle implements Shape{//클래스 생성
    private int a;//인스턴스 변수
    private int b;//인스턴스 변수

    public Triangle(int a, int b){//메소드 생성
        this.a = a;//입력받은 값 인스턴스 변수에 넣어주기
        this.b = b;//입력받은 값 인스턴스 변수에 넣어주기
    }

    public void draw(){//메소드 생성
        System.out.println("밑변 " + a + " 높이 " + b + "인 삼각형입니다.");//출력
    }

    public double getArea(){//메소드 생성
        return (a * b) / 2;//반환
    }
}
public class Main {
    public static void main(String[] args){
        Shape[] arr = new Shape[3];//배열 객체 생성
        arr[0] = new Circle(10);//객체 생성
        arr[1] = new Rect(10, 40);//객체 생성
        arr[2] = new Triangle(30, 20);//객체 생성

        for(int i = 0; i < arr.length; i++){//3번 반복
            arr[i].redraw();//반환받은 값 출력
            System.out.println("면적은 " + arr[i].getArea());//반환
        }
    }
}

 */