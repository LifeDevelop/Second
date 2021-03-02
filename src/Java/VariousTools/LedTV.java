package Java.VariousTools;

// 클래스는 인터페이스를 여러 개 구현할 수 있다.
public class LedTV implements TV{                // 인터페이스를 구현하는 클래스에서 implements 키워드 이용
    @Override                                    // 인터페이스가 가지고 있는 메서드는 단 하나도 빼먹지 않고
    public void turnOn() {                       // 모두 구현해야 함 => 하나라도 안 할 시 추상클래스가 되어
        System.out.println("켜다");               // 인스턴스 생성 불가
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println(volume + "(으)로 볼륨조절하다");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(channel + "(으)로 채널조절하다");
    }

}
