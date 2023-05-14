/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project02;

public class PrintTest {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        // 실습 1-1
        System.out.print("Hello, "); // Hello를 출력하는 코드 
        System.out.print("this is JAVA."); // this is JAVA.를 출력하는 코드 
        
        System.out.println("Hello, "); // Hello를 출력하고 줄바꿈 하는 코드 
        System.out.println("this is Java."); // this is java를 출력하고 줄바꿈 하는 코드 
        
        // 실습 1-2
        System.out.print("Hello, This is JAVA"); // Hello, This is JAVA를 출력하는 코드 
        System.out.print("Hello, This is JAVA \n");// Hello, This is JAVA를 출력하고 줄바꾸는 코드 
        System.out.println("Hello, ");//Hello,를 출력하고 줄을 바꿔주는 코드
        System.out.println("Hello, This is JAVA");//Hello, This is JAVA를 출력하고 줄바꾸는 코드 
        
        // 실습 1-3
        System.out.printf("Hello this is %s. \n", "JAVA");//%s에 "JAVA"를 출력
        System.out.printf("This is %d years old. \n", 20);//%ㅇ에 20을 출력
        System.out.printf("Integer : %d, Real number : %f \n", 10, 13.5);//%d에 10, %f에 13.5 출력
        System.out.printf("Character : %c, String : %s \n", 'Z', "King");//%c에 문자 Z,%s에 "KING" 문자열을 출력
    }
}