package Java.ClassAndString;

public class ClassExam {

//    ClassExam(){                 생성자를 정의하지 않았을 때에는
//                                 클래스에 항상 기본형 생성자가 생략되어 있음
//    }

    int intField;               // 클래스의 정수형 필드 선언
    String strField;            // String형 필드 선언

    public static void main(String[] args) {

        ClassExam c1 = new ClassExam();         // Class라는 객체가 두 개 생성되고, 각각의 객체를 참조하는 c1, c2변수 선언
        ClassExam c2 = new ClassExam();         // 메모리에 만들어진 객체를 인스턴스라고도 함

        c1.intField = 3;            // c1객체의 필드 초기화
        c1.strField = "Hello";

        c2.intField = 4;            // c2객체의 필드 초기화
        c2.strField = " World";

        ClassConstructor c3 = new ClassConstructor(1, "Above"); // 매개변수별 지정한 생성자 실행
        ClassConstructor c4 = new ClassConstructor(2);
        ClassConstructor c5 = new ClassConstructor("One");
        ClassConstructor c6 = new ClassConstructor();

        c3.method3(c3.num);
        System.out.println(c4.method2(c4.num));     // 내부 메서드 먼저 실행 후, 외부 println 메서드 실행
        c5.method1();

    }

}
