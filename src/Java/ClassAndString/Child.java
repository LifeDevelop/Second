package Java.ClassAndString;

public class Child extends Parents{

    public Child(){
        super("La.D");                  // 부모클래스 생성자에 매개변수가 없는 기본 생성자이면 별개로 호출하지
                                            // 않아도 상관 없다. 하지만 자식클래스 객체 생성시 부모클래스 생성자가
                                            // 자동적으로 호출되고 그 다음에 자식클래스 생성자가 자동 호출되므로,
                                            // 부모클래스 생성자가 매개변수를 가지면, super라는 부모클래스 호칭을
                                            // 이용하여 '자식클래스의 생성자 안에서' 부모클래스 생성자를 호출해줘야
                                            // 한다. super는 이 외에도 부모 클래스의 필드나 메서드 호출에 쓰인다.
                                            // * this 는 자신을 가리키고, super 는 부모를 가리키는 것 비교
        System.out.println("자식 클래스의 기본 생성자입니다.");
    }

    public void childMethod(){
        System.out.println("자식 클래스의 메서드 실행");
    }

}
