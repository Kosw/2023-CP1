/*
학번 : 202301741
이름 : 고선우
 */
class Phone {//클래스 생성
    protected String owner;//인스턴스 변수 생성

    public Phone(String owner) {//메소드 생성
        this.owner = owner;//인스턴스 변수에 입력받은 값 넣어주기
    }

    public String talk() {//메소드 생성
        return owner + "은(는) 통화중이다.";//반환
    }
}

class Telephone extends Phone {//클래스 생성
    public Telephone(String owner) {//메소드 생성
        super(owner);//상속자의 인스턴스 변수 가져오기
    }

    public String autoAnswering() {//메소드 생성
        return owner + "은(는) 부재중이다 내일 전화 주세요.";//반환
    }
}

class Smartphone extends Telephone {//클래스 생성
    private String game;//인스턴스 변수 생성

    public Smartphone(String owner, String game) {//메소드 생성
        super(owner);//상속자의 인스턴스 변수 가져오기
        this.game = game;//입력받은 값 인스턴스 변수에 넣기
    }

    public String playGame() {//메소드 생성
        return owner + "은(는) " + game + " 게임을 하는 중이다.";//반환
    }
}

public class phone1 {
    public static void main(String[] args) {
        Phone p = new Phone("홍길동");//객체 생성
        Telephone t = new Telephone("장길산");//객체 생성
        Smartphone s = new Smartphone("Peter", "테트리스");//객체 생성
    
        System.out.println(p.talk());//리턴한 값 출력
        System.out.println(t.autoAnswering());//리턴한 값 출력
        System.out.println(s.playGame());//리턴한 값 출력
    }
}
