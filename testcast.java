/*
학번 : 202301741
이름 : 고선우

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("Class Casting Exception is handled in main !!");
        }
    }

    public static void casting(Shape s) {
        Circle c = (Circle) s;
    }

    static class Shape {//클래스 생성

    }

    static class Rectangle extends Shape {//앞에서 선언한 클래스를 상속받는 클래스 생성

    }

    static class Circle extends Shape {//앞에서 선언한 클래스를 상속받는 클래스 생성

    }
}


 */