package Java.ClassAndString;

public class Extension {

    public static void main(String[] args) {

        Child child = new Child();

        child.parentsMethod();          // Child 클래스에는 없지만, 상속받은 Parents 클래스의
                                        // 메서드를 실행하는데에 문제가 없다.

//      Child child1 = new Parents("str");    // 컴파일 오류
        Parents parents = new Child();        // 부모가 자식을 가리킬수는 있으나 반대는 안 됨
                                              // 이 때, 부모타입으로 자식타입의 객체를 참조(묵시적 형변환)
        parents.parentsMethod();              // 부모클래스의 메서드를 사용하는 건 가능
//      parents.childMethod();                // 컴파일 오류
        Child child1 = (Child)parents;        // 부모타입 객체를 자식타입으로 형변환(명시적 형변환 필요)
        child1.childMethod();                 // 그러면 이제 자식클래스의 메서드 사용 가능
                                              // 상속관계에 있을 때만 객체간 형변환 가능
    }

}
