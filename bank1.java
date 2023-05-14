/*
학번 : 202301741
이름 : 고선우
 */

class Account { //클래스 생성
    int balance; // int형 balance 변수 선언
    int inquiry(){// 메소드 생성
        return balance; //선언했던 금액 리턴
    }
    void deposit(int amount){//메소드 생성
        balance += amount; // balance에 더하기
    }
    void withdraw(int amount){//메소드 생성
        if(balance >= amount){ //balance가 더 크면 아래 실행
            balance -= amount; // balance에다가 값 빼기
        }else{
            System.out.println("잔액부족!"); //출력
        }
    }
}

public class bank1 {
    public static void main(String[] args) {
        Account account = new Account(); //객체 생성
        account.deposit(10000); //10000 더하기
        System.out.println("현재 잔액: "+account.inquiry()); //출력
        account.deposit(5000); // 5000 더하기
        System.out.println("저금 후 잔액:" +account.inquiry()); // 출력
        account.withdraw(2000); // 2000 빼기
        System.out.println("출금 후 잔액 :"+account.inquiry()); // 출력


        account.withdraw(3000); // 3000 더해서 현재 잔액 10000 맞추기
        System.out.println("현재 잔액: "+account.inquiry()); // 출력
        account.deposit(5000); // 5000 더하기
        System.out.println("저금 후 잔액:" +account.inquiry()); // 출력
        account.withdraw(50000); // 50000 빼기
        System.out.println("출금 후 잔액 :"+account.inquiry()); // 빼는게 더 많앗서 잔액 부족 출력
    }
}