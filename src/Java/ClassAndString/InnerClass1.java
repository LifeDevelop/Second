package Java.ClassAndString;

public class InnerClass1 {
    class Cal{                      // 중첩 클래스(인스턴스 클래스) 생성 (내부 클래스 유형1)
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String args[]){
        InnerClass1 t = new InnerClass1();          // 외부 클래스 객체 생성
        InnerClass1.Cal cal = t.new Cal();          // 중첩 클래스(인스턴스 클래스) 객체 생성
        cal.plus();
        System.out.println(cal.value);              // 1 출력
        cal.plus();
        System.out.println(cal.value);              // 2 출력

    }


}
