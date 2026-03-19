package jump2java;
import java.util.Arrays;
import java.util.HashSet;
public class a0309 {                
    public static void main(String[] args) { //집합
    	
    	// 01 집합
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
        // -> 출력이유 중복을 허용하지 않는다. / 순서가 없다(unordered).
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        // 02 교집합
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력
        
        //03 합집합
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
        
        //04 차집합
        HashSet<Integer> subtract = new HashSet<>(s1);  // s1으로 subtract 생성
        subtract.removeAll(s2); // 차집합 수행
        System.out.println(subtract);  // [1, 2, 3] 출력
        
        //05 add, addAll, remove
        HashSet<String> set1 = new HashSet<>();
        set1.add("Jump");
        set1.add("To");
        set1.add("Java");
        System.out.println(set1);  // [Java, To, Jump] 출력
        
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);  // [Java, To, Jump] 출력
        
        set1.remove("To");
        System.out.println(set1);  // [Java, Jump] 출력
    }
}
    