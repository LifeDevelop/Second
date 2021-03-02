package Java.ClassAndString;

public class Duck extends Bird{
    @Override                           // 메서드 Override시, 항상 자식클래스의 메서드가 실행됨.
    public void sing(){                 // 추상클래스에 추상메서드가 있다면, 자식클래스에서는 그 추상클래스를
                                        // Override해줘야 함. 하지 않으면 자식클래스도 추상클래스가 됨
        System.out.println("꽥꽥");
    }

}
