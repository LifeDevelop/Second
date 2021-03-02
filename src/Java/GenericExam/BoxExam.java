package Java.GenericExam;

public class BoxExam {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("hello");
        String str = (String)box.getObj();
        System.out.println(str);

        box.setObj(1);
        int value = (int)box.getObj();
        System.out.println(value);
        // Object를 상속받는 String, int 등을 set 할수는 있지만, get하기 위해서는 형변환이 필요

    }

}
