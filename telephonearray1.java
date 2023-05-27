/*
학번 : 202301741
이름 : 고선우

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

public class Main {
    public static void main(String[] args) {
        Phone[] arr = {//객체 배열을 만들고 배열에 객체를 넣는다.
                new Phone("홍길동"),
                new Telephone("장길산"),
                new Smartphone("Peter", "테트리스")
        };

        for (Phone phone : arr) {//배열 크기만큼 반복
            switch (phone.getClass().getSimpleName()) {//스위치문으로 판별
                case "Smartphone"://만약 스마트폰이면 아래를 실행하고 브레이크
                    System.out.println(((Smartphone) phone).playGame());
                    break;
                case "Telephone"://만약 텔레폰이면 아래를 실행하고 브레이크
                    System.out.println(((Telephone) phone).autoAnswering());
                    break;
                default://해당되는게 없으면 아래를 실행하고 브레이크
                    System.out.println(phone.talk());
                    break;
            }
        }
    }
}

 */