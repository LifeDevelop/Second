package Java.ClassAndString;

public class InnerClass4 {
    public static void main(String[] args) {

        // 내부 클래스 유형4는 '익명 중첩 클래스(익명 클래스)'이다.
        // 익명 클래스를 사용하기 위해서는 추상 클래스가 필요한데,
        // 이전에 만들어 둔 Bird 추상 클래스를 이용하도록 하겠다.
        Bird bird = new Bird() {            // 기존에 공부한 바로는, 추상 클래스는 객체를 생성할 수 없다고
            int a = 0;                      // 했었는데, 이 경우는 추상 메서드를 바로 정의해줌으로써
            @Override                       // '익명의' 이름없는 클래스를 만들어 객체를 호출하는 방식이다.
            public void sing() {            // 만들어둔 추상클래스가 한 번만 쓰여서, 상속클래스를 따로
                a++;                        // 만들 필요가 없을 때 활용할 수 있다.
                System.out.println("sing" + a);
            }
        };

        bird.sing();                        // sing1 출력
        bird.sing();                        // sing2 출력

    }
}
