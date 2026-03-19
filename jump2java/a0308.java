package jump2java;
import java.util.HashMap;
public class a0308 {                
    public static void main(String[] args) { //HashMap
    	
    	// 01 put
        HashMap<String, String> map = new HashMap<>(); // 2개 문자넣기
        map.put("people", "사람");
        map.put("baseball", "야구");
        
        //02 get
        System.out.println(map.get("people")); // "사람" 출력 -> key에 해당하는 value 출력
        //System.out.println(map.get("java")); -> 없는 ket -> null출력
        //System.out.println(map.getOrDefault("java", "자바"));  // 맵에 해당 key가 없을 때 null 대신 기본값을 얻고 싶다면 getOrDefault 메서드를 사용하면 된다
        
        //03 containsKey -> ket 에 value이 존재하는가? -> 존재 -> true != false
        System.out.println(map.containsKey("people"));  // true 출력
        
        //04 remove -> 삭제
        System.out.println(map.remove("people"));  // "사람" 출력후 삭제
        
        //05 size -> map에 size출력
        System.out.println(map.size()); // == 1
        
        //06 keySet -> 모든 키 출력
        System.out.println(map.keySet());  // [people] 출력
        
        //07 그외
        //LinkedHashMap : 입력된 순서대로 데이터를 저장한다.
        //TreeMap : 입력된 key의 오름차순으로 데이터를 저장한다.
    }
}
    