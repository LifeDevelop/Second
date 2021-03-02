package Java.ClassAndString;

public class StringBufferExam {

    public static void main(String[] args) {

    StringBuffer sb = new StringBuffer();   // 아무 값도 가지지 않은 StringBuffer 객체를 생성
    sb.append("Hello");                     // sb 객체에 순서대로 문자열을 첨가한다
    sb.append(" ");
    sb.append("World");

    String str = sb.toString();             // String 객체에 StringBuffer 객체 문자열을 반환해주는 메서드
        System.out.println(str);            // 출력 : Hello World

    String str2 = new StringBuffer().append("Hello World").toString();
    // 자기 자신의 메서드를 호출하여 자신의 값을 바꿔나가는 메서드체이닝 방식으로 설계된 StringBuffer 클래스
        System.out.println(str2);           // 출력 : Hello World

    StringBuffer sb1 = sb;                  // 객체 복제

        System.out.println(sb == sb1);      // true
        System.out.println(sb1);            // Hello World

    String str1 = str;                      // 객체 복제

        System.out.println(str == str1);    // true
        System.out.println(str1);           // Hello World

        // ... 뭐가 다른 거지? append 도 그냥 concat 으로 하면 똑같은데
        // 아 String은 불변클래스니까 수정하거나 할 때 제한이 있겠다

    String str3 = "";
    for(int i=0;i<100;i++)
        str3 += "*";
    System.out.println(str3);

    StringBuffer sb3 = new StringBuffer();
    for(int i=0;i<100;i++)
        sb3.append("*");
    System.out.println(sb3.toString());
        // 두 코드 모두 결과는 같지만, String 객체는 수정이 일어날 때 내부적으로 StringBuffer 객체가 만들어진 뒤
        // 그 안에서 수정하여 그 값을 String 에 반환함. 즉, 첫 번째 코드는 객체가 100번 만들어지므로
        // 프로그램의 속도가 현저히 저하된다. 반면, 두 번째 코드는 객체가 한번만 만들어졌으므로 효율적이다.

        // 성능 비교는 다음 코드를 통해 가능하다.
/**
        // (1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<10000;i++){
            str=str+"*";
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime1 = System.currentTimeMillis();

        // (2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10000;i++){
            sb.append("*");
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime2 = System.currentTimeMillis();

        // 방법(1)과 방법(2)가 걸린 시간을 비교합니다.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;

        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);
*/

    }


}
