package Java.Repeat;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        /**
         * <while문 문법>
         * while(조건문){
         *         실행문;
         *     }
         */

        //example, 1부터 100까지의 합 구하기
        int total = 0; // i의 값을 누적할 변수를 선언합니다.
        int i = 1;
        while(i <= 100){
            total = total + i;
            i++;
        }

        /**
         * <do-while문 문법>
         *    : while문은 한번도 실행되지 않을 수 있는 반면, do-while문은 무조건 한 번은 실행됨
         * do{
         *         실행문;
         *     }while(조건문);
         */

        //example, 10 입력 받을때까지 반복문 실행
        int value = 0;

        // Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받을 때 유용하게 사용할 수 있는 클래스임
        Scanner scan = new Scanner(System.in);
        //이처럼 작성하면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성된다.

        do{
            value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받는다.
            System.out.println("입력받은 수 : " + value);
        }while(value != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복한다.

        System.out.println("반복문 종료");

    }

}
