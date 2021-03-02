package Java.ClassAndString;

public class ClassConstructor {

    int num;
    String name;

    // 생성자 오버로딩으로 여러 매개변수 타입을 갖는 생성자들 선언
    ClassConstructor(int num, String name){
        this.num = num;
        this.name = name;
    }

    ClassConstructor(int num){
        this.num = num;
    }

    ClassConstructor(String name) {
        this.name = name;
    }

    ClassConstructor(){

    }

    public void method1(){
        System.out.println("method1이 실행됩니다.");
    }

    public int method2(int a){
        System.out.println(a + "를 받는 method2가 실행됩니다. 123 리턴");
        return 123;
    }

    public void method3(int a){
        System.out.println(a + "를 받는 method3이 실행됩니다.");
    }

}
