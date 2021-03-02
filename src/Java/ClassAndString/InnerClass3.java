package Java.ClassAndString;

public class InnerClass3 {
    public void exec(){                 // 메서드 안에 클래스 선언하는 경우
        class Cal{                      // 지역 중첩 클래스(지역 클래스) 선언 (내부 클래스 유형3)
            int value = 0;              // => 메서드 안에서만 사용 가능
            public void plus(){
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }


    public static void main(String args[]){
        InnerClass3 t = new InnerClass3();
        t.exec();                               // 1 출력
        t.exec();                               // 1 출력 => 위에서 만들어진 클래스 메모리는 메서드 종료 후
    }                                           //          사라지기 때문!
}
