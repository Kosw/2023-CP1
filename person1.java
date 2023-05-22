/*
학번 : 202301741
이름 : 고선우
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String show() {
        return "Person[name: " + name + ", age: " + age + "]";
    }
}

class Student extends Person {
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String show() {
        return "Student[name: " + getName() + ", age: " + getAge() + ", studentNumber: " + studentNumber + "]";
    }
}

class ForeignStudent extends Student {
    private String nationality;

    public ForeignStudent(String name, int age, int studentNumber, String nationality) {
        super(name, age, studentNumber);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public String show() {
        return "ForeignStudent[name: " + getName() + ", age: " + getAge() + ", studentNumber: " + getStudentNumber()
                + ", nationality: " + nationality + "]";
    }
}

public class person1 {
    public static void main(String[] args) {
        Person pe = new Person("Hong Kil-Dong", 25);
        Student st = new Student("Chang kil-San", 20, 202302111);
        ForeignStudent fo = new ForeignStudent("Peter", 27, 201702999, "USA");

        System.out.println(pe.show());
        System.out.println(st.show());
        System.out.println(fo.show());
    }
}
