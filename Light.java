/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project03;

public class Light {
	public static void main(String[] args) {
	long lightspeed = 300000;//빛의 속도 지정
	long distance = lightspeed * 365 * 24 * 60 * 60;//변수를 만들고 빛의 속도랑 시간을 곱해서 거리를 구함
	System.out.print("빛이 1년 동안 가는 거리 :");//출력
	System.out.print(distance);//거리 출력
	System.out.print(" km.");//출력
	}
}
