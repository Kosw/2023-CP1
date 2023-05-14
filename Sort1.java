/*
학번 : 202301741
이름 : 고선우
 */
import java.util.Arrays;
import java.util.Random;

class Sorting {//정렬하기위한 클래스 생성
    int[] sort(int[] sor){
        Arrays.sort(sor);//정렬 메소드를 사용하여 받은 배열 정렬
        return sor;// 정렬한 배열 출력
    }
}

class Sort1{
    public static void main(String[] args) {
        int[] arr = new int[10];// 크기가 10인 배열 생성
        Random random = new Random();//난수설정을 위해 객체 생성
        int i = 0;
        System.out.print("sorting 전 배열 :");// 글 출력


        for (i = 0; i<arr.length; i++){//배열 크기만큼 반복
            arr[i] = (int)(Math.random()*100)+1;//1~100 사이에 수 지정
            System.out.printf(" %d",arr[i]); // 출력
        }
        System.out.println();// 줄바꿈

        Sorting sort = new Sorting();// 정렬하기위해 객체 생성
        int[] sss = sort.sort(arr);// 정렬

        System.out.print("sorting 후 배열 :");// 출력

        for (i = 0; i<sss.length; i++){//배열 크기만큼 반복
            System.out.printf(" %d",sss[i]);// 출력
        }

    }
}