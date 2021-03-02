package Java.Conditions;

public class If {

    public static void main(String[] args) {

        //간단한 if-실행문
        if(20>10)
            System.out.println("{}생략 시 if문 다음의 한 줄만 실행");

        //if-실행문집합
        if(20<10){
            System.out.println("조건 거짓일 시 실행 안 됨");
            System.out.println("이것도 실행 안 됨");
        }

        //if-else 구문
        if(20<10){
            System.out.println("거짓일 시 실행 안 됨");
        }
        else{
            System.out.println("거짓일 시 실행됨");
        }

        //if-else if-else 구문
        if(20<10){
            System.out.println("실행 안 됨");
        }
        else if(20>10){
            System.out.println("참이므로 실행됨");
        }
        else{
            System.out.println("앞 조건이 모두 거짓일 시 실행됨");
        }


    }

}
