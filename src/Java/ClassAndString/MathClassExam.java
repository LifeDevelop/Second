package Java.ClassAndString;

public class MathClassExam {
// Math 클래스는 private로 선언되어 있어 new 연산자로 생성은 불가 but 메서드와 속성이 모두 static이므로
// 객체 생성 없이 호출 가능
    public static void main(String[] args) {
        int value1 = Math.max(5, 20);           // 20
        int value2 = Math.min(5, -5);           // -5
        int value3 = Math.abs(-10);             // 절댓값(10)
        double value4 = Math.random();          // 0~1 사이의 랜덤한 값 생성
        double value5 = Math.sqrt(25);          // 제곱근을 구하는 메서드(square root)
        System.out.println("2의 10승 = " + Math.pow(2, 10));
        System.out.println("16의 1/2승 = : " + Math.pow(16, 0.5));
        System.out.println("log200 = " + Math.log10(200));
    }

}
