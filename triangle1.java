/*
학번 : 202301741
이름 : 고선우
 */
class Triangle{//Triangle 클래스 생성
    double width = 0;//피피티에 있는 변수 생성
    double height = 0;//피피티에 있는 변수 생성
    double area = 0;//넓이 구하기위해 변수 생성
    public Triangle(double a, double b){//입력받는 메소드 생성
        width = a;
        height = b;
    }
    double area(){//넓이 구하는 메소드 생성
        area = (width * height) * 0.5;//넓이 구하고 area 변수에 입력
        return area;//반환
    }
    boolean isSameArea(Triangle t){//같은지 판별해주는 메소드
        return this.area() == t.area();//같으면 true 아니면 false출력
    }

}
class triangle1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0,5.0);//객체 생성 후 수 입력
        Triangle t2 = new Triangle(5.0,10.0);//객체 생성 후 수 입력
        Triangle t3 = new Triangle(8.0,8.0);//객체 생성 후 수 입력
        System.out.println("삼각형 t1의 넓이: " + t1.area());//넓이 출력
        System.out.println("삼각형 t2의 넓이: " + t2.area());//넓이 출력
        System.out.println("삼각형 t3의 넓이: " + t3.area());//넓이 출력

        if (t1.isSameArea(t2)) {//같은지 판별후 아래를 출력
            System.out.println("삼각형 t1과 삼각형 t2 넓이 비교: true");//ture
        } else {
            System.out.println("삼각형 t1과 삼각형 t2 넓이 비교: false");//false
        }

        if (t1.isSameArea(t3)) {//같은지 판별후 아래를 출력
            System.out.println("삼각형 t1과 삼각형 t3 넓이 비교: true");//ture
        } else {
            System.out.println("삼각형 t1과 삼각형 t3 넓이 비교: false");//false
        }

    }
}