package Java.VariousTools;

public class JavaLangPackage {

    public static void main(String[] args){

        int i = 5;                            // 기본 타입의 정수형 데이터
        Integer i2 = new Integer(5);    // 객체 타입의 정수형 데이터
        Integer i3 = 5;                       // 컴파일 시 new Integer(5);로 변환 => 오토박싱AutoBoxing

        int i4 = i3.intValue();               // 기존 방식
        int i5 = i3;                          // 오토언박싱AutoUnboxing
                                              // : 오토박싱과 함께 Java5버전 이상부터 지원
        // 이 두 기능은 java.lang.Wrapper 클래스 관련 기능이며,
        // java.lang 패키지에는 이 외에도 (최상위클래스)Object, String, StringBuffer, StringBuilder,
        // System, Math, 그리고 Thread 관련 주요 클래스들이 있으며, import 하지 않고도 사용할 수 있다.
    }
}
