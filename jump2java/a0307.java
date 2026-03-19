package jump2java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class a0307 {
    public static void main(String[] args) {
    	
    	////////////// 01 add
    	
        ArrayList<String> pitches = new ArrayList<>(); 
        
        pitches.add(0, "133");// 첫 번째 위치에 133 삽입.
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches); 
        
        /////////////////// 02 get
        
        ArrayList<String> pitches1 = new ArrayList<String>();
        pitches1.add("138");
        pitches1.add("129");
        pitches1.add("142");
        System.out.println(pitches1.get(1));
        
        ////////////////// 03 size 
        
        System.out.println(pitches.size()); // 사이즈를 구함
        
        //////////////// 04  contains
        
        System.out.println(pitches.contains("142")); // 리스트 안에 해당 항목이 있는지 판별해 그 결과를 boolean으로 반환 - 142 가 존재하니 true
        
        //////////////// 05  indexOf
        
        System.out.println(pitches.indexOf("129"));  // 129의 인덱스인 1을 반환
        
        //////////////// 06  remove
        
        System.out.println(pitches1.remove("129"));  // 129를 리스트에서 삭제하고, true를 반환한다.
        System.out.println(pitches1.remove(0));  // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 반환한다.
        
        //////////////// 07 제네릭스
        //ArrayList pitches = new ArrayList(); -> 제네릭스x
        //-> 자동 형변환이 되기에 나중에 할필요가 없음
        //ArrayList"<String>" pitches = new ArrayList<>(); -> 제네릭스o
        
        //////////////// 08 다양한 방법으로 ArrayList 만들기
        

        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches3);  // [138, 129, 142] 출력
        
        /////////////// 09 String.join
        
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142")); // 문자열 배열에도 사용할 수 있다
        String result = String.join(",", pitches4);
        System.out.println(result);  // 138,129,142 출력

        ////////////// 10  리스트 정렬하기
        
        //import java.util.Comparator; 필요
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        //오름차순(순방향) 정렬 - Comparator.naturalOrder()
        //내림차순(역방향) 정렬 - Comparator.reverseOrder()
        
    }
}