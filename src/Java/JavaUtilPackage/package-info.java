package Java.JavaUtilPackage;

/**
 * java.util 패키지는 유용한 클래스들을 많이 가지고 있는 패키지. java.lang 다음으로 두번째로 많이 쓰임
 * 날짜와 관련된 클래스인 Data, Calender 클래스
 * 자료구조(컬렉션 프레임워크)와 관련된 인터페이스와 클래스(List, Set, Collection, Map)
 * api에서, deprecated는 '더이상 지원하지 않으니 사용하지 않는 것이 좋다'라는 의미.
 * Data클래스는 지역화(지역별 시간)를 제공하지 않는다.
 * 자바 1.1에 등장한 Calender클래스가 이를 보완
 * 지역화와 관련된 Lacale클래스들이 1.1 이후에 등장
 */

/**
 * 컬렉션 프레임워크
 * Collection interface : 가장 기본이 되는 인터페이스
 *                        중복 허용, 순서 미구분
 *                        대표적인 메서드 - add(), size()
 *                        하위 interface - iterator()
 *                        iterator() - 꺼낼것이 있는지 살펴보는 hasNext() : boolean type
 *                                     하나씩 자료를 꺼낼 때 사용하는 next() : Object 메서드가 있음
 * Set interface : 중복을 허용하지 않고 순서를 기억함
 *                 Collection interface를 상속받음
 *                 add(Object) : boolean type - 같은 자료가 있으면 false, 없으면 true
 * List interface : 중복을 허용하고 순서를 기억함
 *                  Collection interface를 상속받음
 *                  get(int) : Object - n번째 자료를 반환
 * Map interface : Set interface에 의존하며, Key와 Value를 가짐
 *                 put(Object, Object) : void - key와 value를 저장
 *                 get(Object) : Object - key를 매개변수로 받아 value를 반환
 *                 모든 key는 중복되면 안 됨
 *                 keySet() : Set - 자신이 가지고 있는 모든 key들에 대한 정보를 읽어들일 수 있는 Set 반환
 */