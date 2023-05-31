/*
학번 : 202301741
이름 : 고선우

import java.util.*;//스캐너 사용하기위해 호출
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//스캐너 객체 생성
        String a;//문자열 변수 생성
        int cnt = 0;//카운트 변수 생성
        while (true) {//무한 반복
            System.out.print("Enter a statement >> ");//출력
            a = in.nextLine();//입력받기
            if (a.equals("stop")) {//만약 stop이면 아래를 실행
                System.out.println("End the program...");//출력
                break;//무한반복에서 나가기
            }
            else{
                String[] w = a.split(" ");//공백분리하기위해서스플릿사용
                for (String arr : w) {//반복
                    if (!arr.isEmpty()) {//비어있지않으면 1추가하기위해 조건문
                        cnt++;//cnt 1추가
                    }
                }
            }
            System.out.println("number of words : " + cnt);//출력
            cnt = 0;//카운트 초기화
        }
    }
}

 */