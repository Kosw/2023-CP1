/*
학번 : 202301741
이름 : 고선우
 */
class Complex {//클래스 생성
    double real = 0;//피피티에 있는 인스턴스 변수 생성
    double imag = 0;//피피티에 있는 인스턴스 변수 생성

    public Complex(double a, double b) {//입력받은 값을 받는 생선자 메소드 생성
        this.real = a;
        this.imag = b;
    }
    Complex add(Complex c){//더하고 반환하는 메소드 생성
        return new Complex(this.real + c.real, this.imag + c.imag);//더하는 값 반환
    }
    Complex subtract(Complex c){//빼고 반환하는 메소드 생성
        return new Complex(this.real - c.real, this.imag - c.imag);//빼는 값 반환
    }
    Complex multiply(Complex c){//곱하고 반환하는 메소드 생성
        return new Complex(this.real*c.real - this.imag*c.imag, this.real*c.imag + this.imag*c.real);//곱하는 값 반환
    }
    Complex divide(Complex c){//나누고 반환하는 메소드 생성
        return new Complex((this.real*c.real + this.imag*c.imag) / (c.real*c.real + c.imag*c.imag), (this.imag*c.real - this.real*c.imag) / (c.real*c.real + c.imag*c.imag));//나누는 값 반환
    }
    void print(){//출력 메소드
        System.out.println(this.real + " + " + this.imag + "i");//출력
    }
}
class Compelxnum1 {
    public static void main(String[] args) {
        double a1 = 3.0;//피피티에서 정해준 변수
        double a2 = 1.0;//피피티에서 정해준 변수
        double b1 = 4.0;//피피티에서 정해준 변수
        double b2 = 2.0;//피피티에서 정해준 변수

        Complex c1 = new Complex(a1, b1);//객체 생성 후 피피티에서 정해준 변수 입력
        Complex c2 = new Complex(a2, b2);//객체 생성 후 피피티에서 정해준 변수 입력

        System.out.println("c1: " + a1 + " + " + b1 + "i");//출력
        System.out.println("c2: " + a2 + " + " + b2 + "i");//출력

        Complex aa = c1.add(c2);//객체 생성 후 더하는 메소드에 입력
        System.out.print("Addition: ");//출력
        aa.print();//반환받은 값 출력

        Complex bb = c1.subtract(c2);//객체 생성 후 빼는 메소드에 입력
        System.out.print("Subtraction: ");//출력
        bb.print();//반환받은 값 출력

        Complex cc = c1.multiply(c2);//객체 생성 후 곱하는 메소드에 입력
        System.out.print("Multiplication: ");//출력
        cc.print();//반환받은 값 출력

        Complex dd = c1.divide(c2);//객체 생성 후 나누는 메소드에 입력
        System.out.print("Division: ");//출력
        dd.print();//반환받은 값 출력
    }
}
