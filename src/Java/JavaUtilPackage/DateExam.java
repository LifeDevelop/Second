package Java.JavaUtilPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {
        // 현재 시스템 시간을 객체로 생성하는 Date 클래스 - 지역화가 고려되지 않아서 Calendar로 많이 대체됨
        Date date = new Date();
        System.out.println(date.toString());

        // SimpleDateFormat 클래스를 이용해 날짜와 시간, 국가 등을 내가 원하는 format으로 출력 가능
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));

        System.out.println(date.getTime());         // Date객체가 만들어진 시간을 long타입으로 반환

        long today = System.currentTimeMillis();    // 현재 시간을 long타입으로 반환 (위와 동일)
        System.out.println(today);

        // 10번 줄과 19번 줄 사이의 밀리초
        System.out.println(System.currentTimeMillis() - date.getTime());
    }
}
