package Java.VariousTools;

public class LedTVExam {

    public static void main(String[] args) {

     TV tv = new LedTV();           // LcdTV클래스를 정의한다면, 여기에서 LedTV를 LcdTV로만 바꿔도 똑같이
                                    // 프로그램이 동작할 것이다. => 인터페이스 사용의 의의
     tv.turnOn();                   // 근데 LedTV tv = new LedTV랑 저거의 차이점을 모르겠다. 똑같이 동작하는데?
     tv.turnOff();
     tv.changeVolume(32);
     tv.changeVolume(13);

     tv.radioWave();                // defalut 인터페이스 메서드는 LedTV에서 Override하지 않아도 공동사용 가능
     TV.lightAdapting();            // static 인터페이스 메서드는 객체명(tv)가 아닌 인터페이스명(TV)로 호출
    }

}
