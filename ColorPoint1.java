/*
학번 : 202301741
이름 : 고선우
 */
class Point{//ppt에 있는 클래스 생성
    private int x,y;//ppt에 있는 인스턴스 생성
    public Point(int x, int y){//ppt에 있는 메소드 생성
        this.x = x;//메소드에 입력받으면 인스턴스에 넣어주기
        this.y = y;//메소드에 입력받으면 인스턴스에 넣어주기
    }
    public int getx(){//ppt에 있는 메소드 생성
        return x;
    }
    public int gety(){//ppt에 있는 메소드 생성
        return y;
    }
    protected void move(int x, int y){//ppt에 있는 메소드 생성
        this.x = x;//메소드에 입력받으면 인스턴스에 넣어주기
        this.y = y;//메소드에 입력받으면 인스턴스에 넣어주기
    }
}

class ColorPoint extends Point{//ColorPoint 클래스 생성
    private String a = "검정";//기본값 검정으로 설정
    public ColorPoint(){//기본값 메소드 생성
        super(0,0);//기본값 0,0 으로 설정
    }
    public ColorPoint(int x, int y){//입력받은 수 상속 클래스로 옮기는 메소드
        super(x, y);//상속하는 클래스로 옮김
    }
    public void setXY(int x, int y){//입력받은 수 상속 클래스로 옮기는 메소드
        move(x,y);//상속하는 클래스로 옮김
    }
    public void setColor(String c){//색 입력받는 메소드
        a = c;//기본값 검정을 입력받은걸로 바꿔준다.
    }
    public String toString(){//반환하는 클래스
        return a + "색의 (" + getx() + "," + gety() + ")의 점";//반환
    }
}
class ColorPoint1 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();//객체 생성
        System.out.println(zeroPoint.toString() + "입니다.");//기본값 출력

        ColorPoint cp = new ColorPoint(10,10);//클래스에 10,10 넣어주기
        cp.setXY(5,5);//5,5로 변경해주기
        cp.setColor("Red");//Red 색으로 변경해주기
        System.out.println(cp.toString() + "입니다.");//출력
    }
  }