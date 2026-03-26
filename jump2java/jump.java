package jump2java;

public class jump {
    public static void main(String[] args) {
        int c = 2; // 커피 개수
        int m = 10000; // 가진 돈

        while (true) {
            if (m >= 3000) { 
                System.out.println("커피드림");
                m -= 3000;
                c--; 
                System.out.println("남은 커피: " + c + "개, 남은 돈: " + m + "원");
            } else {
                System.out.println("돈이 부족합니다.");
                break;
            }

            if (c == 0) { 
                System.out.println("커피가 읎다.");
                break;
            }
        }
    }
}
