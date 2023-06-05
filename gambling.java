/*
학번 : 202301741
이름 : 고선우

import java.util.*;  // 랜덤과 스캐너 라이브러리를 사용하기위해 호출

class Person {  // 클래스 생성
    String name;  // 인스턴스 변수 생성
    int age;  // 인스턴스 변수 생성

    public Person(String name) {  // 생성자 생성
        this.name = name;  // 메소드에 입력받은 값 인스턴스 변수에 넣어주기
    }

    public String getName() {  // 메소드 생성
        return name;  // 반환
    }

    public int getAge() {  // 메소드 생성
        return age;  // 반환
    }

    public String game() {
        Random ra = new Random();  // Random 객체 생성
        int a = ra.nextInt(3) + 1;  // 1부터 3까지의 난수 생성
        int b = ra.nextInt(3) + 1;  // 1부터 3까지의 난수 생성
        int c = ra.nextInt(3) + 1;  // 1부터 3까지의 난수 생성

        System.out.println("[" + name + "]: <Enter>");//출력
        Scanner in = new Scanner(System.in);//스캐너 객체 생성
        in.nextLine();// 피피티대로 엔터를 입력받고 넘길수 있도록

        System.out.print(a + " " + b + " " + c);//출력
        if (a == b && b == c) {
            return name + " wins!";// 모두 같은 숫자가 나왔을 때 반환
        } else {
            return "That's too bad!";// 같은 숫자가 나오지 않았을 때 반환
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1st player's name>>");//출력
        String per1 = in.nextLine();//사람1 입력받기
        Person person1 = new Person(per1);// 첫 번째 사람 객체 생성
        System.out.print("2nd player's name>>");//출력
        String per2 = in.nextLine();//사람2 입력받기
        Person person2 = new Person(per2);// 두 번째 사람 객체 생성

        Person cnt = person1;//지금 누구 차롄지 판별하기위해 생성

        while (true) {
            String win = cnt.game();//자신의 자례에 랜덤을 생성
            System.out.println(" " + win);//출력
            if (win.equals(" wins!")) {//이기면 무한반복 브레이크
                break;
            }
            if (cnt == person1) {//차례 변경
                cnt = person2;
            } else {
                cnt = person1;
            }
        }
        System.out.println("Game Over...");//출력
        in.close();
    }
}


 */