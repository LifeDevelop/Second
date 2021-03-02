package Java.JavaUtilPackage;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class SetExam {

    public static void main(String[] args) {
        // Set은 인터페이스이므로 new Set<>()이 불가함 => Set안의 HashSet Class를 import하여 사용
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("sang");
        boolean flag2 = set1.add("il");
        boolean flag3 = set1.add("sang");

        System.out.println(set1.size());
        System.out.println(flag1 + "/" + flag2 + "/" + flag3);
// Set은 중복을 허용하지 않고 순서를 기억하므로 sang, il 두 개만 출력
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
//다음과 같이 for-each문으로도 가능
//        for(String str : set1){
//            System.out.println(str);
//        }


    }

}
