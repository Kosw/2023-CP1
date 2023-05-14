/*
학번 : 202301741
이름 : 고선우
 */

class Dice {
    int diceFace;
    int roll() {
        diceFace = (int)(Math.random()*6) + 1;
        return diceFace;
    }
}
public class Dice1 {
    public static void main(String[] args) {
        Dice di = new Dice();
        int cnt = 0;
        while (true)
        {
            int ra = di.roll();
            int rb = di.roll();

            int sum = ra + rb;
            if(sum == 2)
            {
                System.out.print("첫 번째 주사위 : " + ra + ", 두 번째 주사위 : " + rb + ", 주사위 눈의 합 : " + sum);
                System.out.println("");
                System.out.println("2가 나온 횟수 : " + ++cnt);
                break;
            }
            else {
                System.out.print("첫 번째 주사위 : " + ra + ", 두 번째 주사위 : " + rb + ", 주사위 눈의 합 : " + sum);
                cnt++;
            }
            System.out.println("");
        }
    }
}
