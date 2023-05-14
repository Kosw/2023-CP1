/*
학번 : 202301741
이름 : 고선우
 */
import java.util.*; // 스캐너 불러오기

class Dictionary {
    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" }; //ppt에 있는 한국어
    private static String[] eng = { "love", "baby", "money", "future", "hope" };//ppt에 있는 영어
    public static String kor2Eng(String word) {
        String a = "사전에 없습니다.";
        for (int i = 0; i < kor.length; i++) {//배열의 크기만큼 반복
            if (word.equals(kor[i])) { //입력받은 word가 한국어 중에 있는거면 아래를 출력
                a = eng[i]; //만들어둔 문자열에 한국어에 맞는 영어 입력
            }
        }
        return a; //반환
    }
}
class dictionary1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 스캐너 객체 생성
        Dictionary dd = new Dictionary(); // 객체 생성
        System.out.println("한영 단어 검색 프로그램.");//출력
        while (true) { //무한반복
            System.out.print("한글 단어?"); //출력
            String eksdj = in.next();//문자열 입력받기
            if (eksdj.equals("그만")) {//입력받은 값이 그만이면 아래를 출력
                break;//그만이면 무한반복 탈출
            }
            System.out.println(eksdj + "는(은) " + dd.kor2Eng(eksdj));//출력

        }

    }
}