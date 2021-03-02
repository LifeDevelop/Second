package Java.VariousTools;

public interface TV {

    public int MIN_VOLUME=0;                // 인터페이스에 정의되는 변수는 상수처럼 작용한다.(컴파일 시 final)
    public int MAX_VOLUME=100;

    public void turnOn();                   // 추상클래스와 같이 기능이 없는 메서드 선언 가능
    public void turnOff();                  // 추상 메서드처럼 작용함 (컴파일 시 abstract 붙음)
    public void changeVolume(int volume);
    public void changeChannel(int channel);

    default void radioWave(){               // default 접근제한자를 이용하면 인터페이스에서 기능 구현 가능
        System.out.println("전파 수신 양호");
    }

    static void lightAdapting(){            // static 접근제한자를 이용하면 객체생성없이 인터페이스명.메서드명
        System.out.println("빛 밝기 조절");   // 으로 호출 가능 => 간편한 기능을 가지는 유틸리티성 인터페이스
    }

}
