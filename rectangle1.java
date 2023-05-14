/*
학번 : 202301741
이름 : 고선우
 */
class Rectangle {//클래스 생성
    int x;        // int형 변수 선언
    int y;        // int형 변수 선언
    int width;    // int형 변수 선언
    int height;   // int형 변수 선언
    public void setRectangle(int a, int b, int c, int d) {//메소드 생성
        x = a;//메소드에 입력받은 a 값을 x에 저장
        y = b;//메소드에 입력받은 b 값zz을 y에 저장
        width = c;//메소드에 입력받은 c 값을 width에 저장
        height = d;//메소드에 입력받은 d 값을 height에 저장
    }

    int area() {
        return width * height;//넓이 리턴
    }

    boolean contains(Rectangle r) {//불리언 메소드 생성
        if ((r.x >= x && r.width + r.x <= x + width) && (r.y >= y && r.height + r.y <= y + height)) {
            return true;//사각형이 포함되는지 판단 후 포함되면 불리언 참 값을 리턴
        } else {
            return false;//사각형이 포함되는지 판단 후 포함안되면 불리언 거짓 값을 리턴
        }
    }

    public void show() {//메소드 생성
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형",x,y,width,height);//출력
    }
}

public class rectangle1 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();    //객체 생성
        Rectangle r2 = new Rectangle();    //객체 생성
        Rectangle r3 = new Rectangle();    //객체 생성

        r1.setRectangle(2, 2, 8, 7);//만들어둔 메소드에 정수 4개 보내기
        r1.show();//위에서 보낸 정수로 만들어진 사각형 좌표와 크기 출력
        System.out.println("");//줄바꿈

        r2.setRectangle(5, 5, 6, 6);//만들어둔 메소드에 정수 4개 보내기
        r2.show();//위에서 보낸 정수로 만들어진 사각형 좌표와 크기 출력
        System.out.println("");//줄바꿈

        r3.setRectangle(1, 1, 10, 10);//만들어둔 메소드에 정수 4개 보내기
        r3.show();//위에서 보낸 정수로 만들어진 사각형 좌표와 크기 출력
        System.out.println("");//줄바꿈

        System.out.println("r의 면적은 " + r1.area());//2,2좌표 8*7 사각형의 크기 출력

        if(r3.contains(r1)){//r1이 r3에 포함되는지 판별
            System.out.println("t은 r을 포함합니다.");//참이면 출력
        } else {
            System.out.println("t은 r을 포함하지 않습니다.");//거짓이면 출력
        }
    }
}
