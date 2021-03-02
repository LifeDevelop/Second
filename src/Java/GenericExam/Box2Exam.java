package Java.GenericExam;

public class Box2Exam {

    public static void main(String[] args) {
        Box2<Object> box = new Box2<>();
        box.setObj(new Object());
        Object obj = box.getObj();

        Box2<String> box2 = new Box2<>();
        box2.setObj("hello");
        String str = box2.getObj();
        System.out.println(str);

        Box2<Integer> box3 = new Box2<>();
        box3.setObj(2);
        int value = box3.getObj();
        System.out.println(value);
        // Java5 이후에 이와 같은 Generic 문법을 이용하여 인스턴스를 만들 때 타입을 지정하여 사용하는 방법 추가
    }

}
