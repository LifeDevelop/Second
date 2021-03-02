package Java.JavaUtilPackage;

import java.util.Calendar;

public class CalendarExam {
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);

        String str = cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH)+1) + "월" + cal.get(Calendar.DATE) + "일";
        return str;
    }
    public static void main(String[] args) {
        // Calendar는 추상클래스이므로 new를 통해 인스턴스 생성이 불가. 따라서 자체적으로 getInstance 라는
        // 메서드를 제공하는데, getInstance 도 결국 자기 자신을 인스턴스화 해서 리턴하는건데 이게 되나?
        // => 사실 Calendar 가 인스턴스화 되는게 아니라, 그 자식 클래스인 GregorianCalendar 가 인스턴스화되어서
        // 리턴된다고 함. 달력 표준이 추후에 그레고리안에서 다른 것으로 바뀔 수 있기 때문에 이런 표준화된 방법을 설계.
        Calendar cal = Calendar.getInstance();

        // Calendar 에는 수많은 상수들이 존재. 다음과 같이 이를 꺼내서 볼 수 있음.
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1); // MONTH 상수는 0~11로 표현되기 때문에 +1 해야함
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));         // 12시 표현
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));  // 24시 표현
        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.HOUR, -5); // 시간 조절 가능

        // 시간 조절 후 cal 객체를 다시 출력해보면 5시간 전의 일시가 뜨는 것을 확인할 수 있다.
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));

        CalendarExam c = new CalendarExam();
        System.out.println(c.hundredDaysAfter());
    }
}
