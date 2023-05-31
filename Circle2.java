/*
학번 : 202301741
이름 : 고선우

import java.util.*;//스캐너 사용하기위해 라이브러리 호출
class Circle{//Circle 클래스 생성
    int x = 0;//인스턴스변수 생성
    int y = 0;//인스턴스변수 생성
    int radius = 0;//인스턴스변수 생성

    public Circle(int x,int y,int radius){//생성자 메소드 생성
        this.x = x;//입력받은 수 인스턴스 변수에 넣어주기
        this.y = y;//입력받은 수 인스턴스 변수에 넣어주기
        this.radius = radius;//입력받은 수 인스턴스 변수에 넣어주기
    }

    public boolean equals(Object obj){//불리언 메소드 생성
        Circle c = (Circle)obj;//객체 생성 후 값 넣어주기
        if(x == c.x && y == c.y && radius == c.radius){//같은지 비교해서 둘다같으면 아래를 출력
            return true;
        }
        else {//아니면 아래를 출력
            return false;
        }
    }
    public String toString() {//출력 메소드 생성
        return "Circle(" + x + "," + y + ") radius : " + radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//스캐너 객체 생성
        Circle c1[] = new Circle[2];//객체 배열 생성
        int x,y,radius;//변수 생성

        for (int i = 0; i < 2; i++) {//2번 반복하는 반복문
            System.out.print("Enter center Point x and y and radius >> ");//출력
            x = in.nextInt();//입력받기
            y = in.nextInt();//입력받기
            radius = in.nextInt();//반지름 입력받기
            c1[i] = new Circle(x,y,radius);//객체 생성 후 입력받은 좌표와 반지름 입력
        }
        System.out.println();//줄바꿈

        for (int i = 0; i < 2; i++) {//2번 반복하는 반복문
            System.out.println("Circle [" + i + "] : " + c1[i]);//출력
        }
        System.out.println();//줄바꿈
        if(c1[0].equals(c1[1]))//둘이 같은지 다른지 메소드에서 불리언값 받아서 판별
            System.out.println("Same Circle!!");//같으면 출력
        else
            System.out.println("Different Circle!!");//다르면 출력
    }
}


 */