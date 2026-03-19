package jump2java;

public class a0305 {                
    public static void main(String[] args) { 
        StringBuffer sb = new StringBuffer(); // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result); // "hello jump to java" 출력
        
        /////////////////////////////
        StringBuffer sb1 = new StringBuffer();
        sb1.append("jump to java");
        sb1.insert(0, "hello ");
        System.out.println(sb1.toString());
        
        
        ///////////////////////////
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello jump to java");
        sb2.delete(6, 11);  // 6번째부터 10번째까지의 문자 삭제 ("jump "을 삭제)
        System.out.println(sb2.toString());
        
        //////////////////////
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello jump to java");
        System.out.println(sb3.substring(0, 4));
        
        String[] weeks = new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";
        ///////////////////////
        String[] weeks1 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks1[3]);
        ////////////////
        
    }
}
