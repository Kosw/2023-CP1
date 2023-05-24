/*
학번 : 202301741
이름 : 고선우

class Person {//클래스 생성
    String name;//인스턴스 변수 생성
    int age;//인스턴스 변수 생성

    public Person(String name, int age) {//메소드 생성
        this.name = name;//메소드에 입력받은 값 인스턴스 변수에 넣어주기
        this.age = age;//메소드에 입력받은 값 인스턴스 변수에 넣어주기
    }

    public String getName() {//메소드 생성
        return name;//반환
    }

    public int getAge() {//메소드 생성
        return age;//반환
    }

    public String show() {//메소드 생성
        return "Person[name: " + getName() + ", age: " + getAge() + "]";//반환
    }
}

class Student extends Person {//클래스 생성 후 상속받기
    int studentNumber;//인스턴스 변수 생성

    public Student(String name, int age, int studentNumber) {//메소드 생성
        super(name, age);//메소드에 입력받은 값 상속 인스턴스 변수에 넣어주기
        this.studentNumber = studentNumber;//메소드에 입력받은 값 인스턴스 변수에 넣어주기
    }

    public int getStudentNumber() {//메소드 생성
        return studentNumber;//반환
    }

    public String show() {//메소드 생성
        return "Student[name: " + getName() + ", age: " + getAge() + ", studentNumber: " + getStudentNumber() + "]";//반환
    }
}

class ForeignStudent extends Student {//클래스 생성 후 상속받기
    String nationality;//인스턴스 변수 생성

    public ForeignStudent(String name, int age, int studentNumber, String nationality) {//메소드 생성
        super(name, age, studentNumber);//메소드에 입력받은 값 상속 인스턴스 변수에 넣어주기
        this.nationality = nationality;//메소드에 입력받은 값 인스턴스 변수에 넣어주기
    }

    public String getNationality() {//메소드 생성
        return nationality;//반환
    }

    public String show() {//메소드 생성
        return "ForeignStudent[name: " + getName() + ", age: " + getAge() + ", studentNumber: " + getStudentNumber() + ", nationality: " + getNationality() + "]";//반환
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] arr = new Person[3];//배열 객체 생성
        Person p = new Person("Hong Kil-Dong", 25);//객체 생성
        Student s = new Student("Chang Kil-San", 20, 202302111);//객체 생성
        ForeignStudent f = new ForeignStudent("Peter", 27, 201702999, "USA");//객체 생성

        arr[0] = p;//배열에 Person 객체 생성 했던거 값 넣어주기
        arr[1] = s;//배열에 Student 객체 생성 했던거 값 넣어주기
        arr[2] = f;//배열에 ForeignStudent 객체 생성 했던거 값 넣어주기
        for (int i = 0; i < arr.length; i++) {//3번 반복
            System.out.println(arr[i].show());//출력
        }
    }
}


 */