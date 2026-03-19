package jump2java;

public class a0306 {                
    public static void main(String[] args) { 
    	String[] weeks = new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";
        
        /////////////////////// 02
        
        String[] weeks1 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks1[3]);
        
        //////////////// 03
        
        String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i = 0; i < weeks2.length; i++) {
            System.out.println(weeks2[i]);
           
        }
        ////////////////////// 04
        //ArrayIndexOutOfBoundsException
        //System.out.println(weeks[7]);  // 여덟 번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류 발생
    }
}
    