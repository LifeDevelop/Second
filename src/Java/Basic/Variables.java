package Java.Basic;
/**
 * 식별자(identifier) : 클래스, 메서드, 변수 등 다양한 대상에 붙여진 이름
 * Java 식별자 명명 규칙
 * - 하나 이상의 글자로 이루어져야 한다.
 * - 첫번째 글자는 문자, $, _가 쓰일 수 있다.
 * - 두번째 이후의 글자는 숫자, 문자, $, _가 쓰일 수 있다.
 * - $, _ 이외의 특수문자는 사용이 불가하다.
 * - 길이 제한이 없다.
 * - 키워드는 식별자로 사용할 수 없다.
 * - 상수 값을 표현하는 단어 true, false, null은 식별자로 사용할 수 없다.
 */

/**
 * 변수 명명 관례
 * - 첫번째 문자가 소문자인 명사로 정한다.
 * - 여러 단어로 구성된 이름의 경우 두번째 단어부터 첫글자를 대문자로 한다.
 * - '_'를 쓰지 않는다.
 */


public class Variables {         // 클래스명 첫 글자는 대문자로 해주는 것이 관례

    static boolean logic = true;    // boolean(1byte) : 논리형. true or false
    static char character = 'a';    // char(2bytes) : 문자형. 문자 한 글자
    static short a = 32767;         // short(2bytes) : 정수형. -32768 ~ 32767
    static int b = (int)Math.pow(2, 31) - 1; //int(4bytes) : 정수형. 2^(-31) ~ 2^(31) - 1. (약 -20억~20억)
    static long c = 32l;            // long(8bytes) : 정수형. 2^(-63) ~ 2^(63) - 1. 숫자 뒤에 l이나 L을 붙임
    static float d = 3231.2124f;    // float(4bytes) : 실수형. 숫자 뒤에 f를 붙여줘야 한다.
    static double e = 2315.1412972d;// double(8bytes) : 실수형. 필수는 아니지만 뒤에 d를 붙여주는 게 좋다.
    static final int f = 3252;      // 상수값 선언. f는 상수로서 3252라는 값으로 고정되어 변하지 않는다.

    public static void main(String[] args) {

        System.out.println(Variables.c);
        // static 선언한 클래스 변수는 객체 생성이나 import 없이 사용 가능 (같은 패키지 내에서)
        // 또한, 같은 클래스 내에서 선언되었더라도, 메인함수 밖에서 static으로 선언되지 않은 변수는
        // 메인함수 내에서 사용할 수 없다. (메인함수가 static이므로, static하지 않은 외부 변수는 사용 불가!)
        // 또한, 인스턴스가 여러개 생성되어도 static 변수는 하나이다.(동일 메모리 참조)
        System.out.println(f); // 상수값은 클래스 명명 없이도 사용 가능 (같은 패키지 내에서)

        int num1 = 123;
        long num1Insert = num1; // 작은 단위에서 큰 단위로는 자동 형변환이 일어난다.

        long num2 = 123l;
        int num2Inset = (int)num2; // 큰 단위에서 작은 단위로는 수동으로 형변환을 해줘야 한다.

    }


}
