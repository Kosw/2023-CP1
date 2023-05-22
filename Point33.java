/*
학번 : 202301741
이름 : 고선우
 */
class Point {// 클래스 생성
    int x, y;// 인스턴스 변수 생성

    public Point(int x, int y) {// 메소드 생성
        this.x = x;// 입력받은 x 인스턴스 변수에 넣어주기
        this.y = y;// 입력받은 y 인스턴스 변수에 넣어주기
    }

    public int getx() {// 메소드 생성
        return x;// 리턴
    }

    public int gety() {// 메소드 생성
        return y;// 리턴
    }

    protected void move(int x, int y) {// 메소드 생성
        this.x = x;// 입력받은 x 인스턴스 변수에 넣어주기
        this.y = y;// 입력받은 y 인스턴스 변수에 넣어주기
    }
}

class Point3D extends Point {// 클래스 생성
    int z;// 인스턴스 변수 생성

    public Point3D(int x, int y, int z) {// 메소드 생성
        super(x, y);// 입력받은 값 상속 인스턴스 변수에 넣어주기
        this.z = z;// 입력받은 인스턴스 변수에 넣어주기
    }

    public int getz() {// 메소드 생성
        return z;// 반환
    }

    protected void moveUp() {// 메소드 생성
        z++;// +1
    }

    protected void moveDown() {// 메소드 생성
        z--;// -1
    }

    protected void move(int x, int y, int z) {// 메소드 생성
        this.x = x;// 입력받은 x 인스턴스 변수에 넣어주기
        this.y = y;// 입력받은 y 인스턴스 변수에 넣어주기
        this.z = z;// 입력받은 z 인스턴스 변수에 넣어주기
    }

    public String toString() {// 메소드 생성
        return "(" + x + ", " + y + ", " + z + ") 의 점";// 리턴
    }
}

public class Point33 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);// 객체생성

        System.out.println(p.toString() + "입니다.");// 출력

        p.moveUp();// z 축으로 위로 이동
        System.out.println(p.toString() + "입니다.");// 출력

        p.moveDown();// z 축으로 아래로 이동
        p.move(10, 10);// 좌표로 이동
        System.out.println(p.toString() + "입니다.");// 출력

        p.move(100, 200, 300);// 좌표로 이동
        System.out.println(p.toString() + "입니다.");// 출력
    }
}
