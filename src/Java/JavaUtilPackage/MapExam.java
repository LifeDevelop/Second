package Java.JavaUtilPackage;
import java.util.*;

public class MapExam {

    public static void main(String[] args) {
        //key를 정수로, value를 문자열로 받는 HashMap 인스턴스를 만든다.
        Map<Integer, String> map = new HashMap<>();


        //key와 value를 put으로 저장
        map.put(12150994, "윤상순");
        map.put(12150969, "김종구");
        map.put(12150968, "김장곤");

        //같은 key가 중복될 수 없음 => 윤상일로 바뀜
        map.put(12150994, "윤상일");

        //인스턴스에 저장된 자료의 수를 출력 => 3 출력
        System.out.println(map.size());

        //get을 이용해 key별로 value를 추출
        System.out.println(map.get(12150994));
        System.out.println(map.get(12150969));
        System.out.println(map.get(12150968));

        //map의 key를 전부 받는 Set자료구조를 만듦
        Set<Integer> studentNum = map.keySet();

        //Set자료구조의 모든 key를 각각 꺼내기 위해 Iterator를 구함
        Iterator<Integer> iter = studentNum.iterator();


        //hasNext와 next를 이용하여 map의 자료를 모두 꺼냄
        while(iter.hasNext()){
            int num = iter.next();
            String name = map.get(num);
            System.out.println(num + ":" + name);
        }

    }
}