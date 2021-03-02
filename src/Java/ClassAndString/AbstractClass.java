package Java.ClassAndString;

public class AbstractClass {

    public static void main(String[] args) {

        Duck duck = new Duck();         // 추상클래스 Bird를 상속받은 Duck 클래스 객체 생성

        duck.sing();                    // 추상클래스 Bird의 추상메서드 - Duck에서 Override됨
        duck.fly();                     // 추상클래스 Bird의 메서드

    }

}
