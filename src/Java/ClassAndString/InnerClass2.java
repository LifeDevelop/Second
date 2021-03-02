package Java.ClassAndString;

public class InnerClass2 {
    static class Cal{                       // 정적 중첩 클래스(정적 클래스) 선언 (내부 클래스 유형2)
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String args[]){
        InnerClass2.Cal cal = new InnerClass2.Cal();        // 정적 중첩 클래스 객체는 외부 클래스 객체
        cal.plus();                                         // 생성 없이 바로 생성 가능
        System.out.println(cal.value);                      // 1 출력
        cal.plus();
        System.out.println(cal.value);                      // 2 출력
    }

}
