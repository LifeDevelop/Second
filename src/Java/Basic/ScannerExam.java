package Java.Basic;

import java.util.Scanner;

public class ScannerExam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();             // String을 입력받는 Scanner 메서드
        int num = input.nextInt();             // 정수를 입력받는 Scanner 메서드

        System.out.println(str + num + "을 입력받았습니다.");

    }

}
