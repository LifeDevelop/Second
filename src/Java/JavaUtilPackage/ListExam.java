package Java.JavaUtilPackage;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // list에 3개의 문자열을 저장합니다.
        list.add("kim");
        list.add("lee");
        list.add("kim");
// List는 중복을 허용하고 순서도 있으므로, kim lee kim 세 개 출력
        System.out.println(list.size()); //list에 저장된 자료의 수를 출력 (중복을 허용하므로 3 출력)
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
// 다음과 같이 for-each문으로도 가능
//        for(String str : list){
//            System.out.println(str);
//        }
    }
}