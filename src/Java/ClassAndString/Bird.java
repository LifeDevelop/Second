package Java.ClassAndString;

public abstract class Bird {                // 추상클래스 선언

    public abstract void sing();            // 추상메서드 - 추상클래스에서 선언할 수 있음. 있어도 되고 없어도 됨

    public void fly(){
        System.out.println("날다");

    }
}
