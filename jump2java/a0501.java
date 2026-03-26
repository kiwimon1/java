package jump2java;

public class a0501 {
	public static void main(String[] arr) {
		int a = 0;
		while (10 >= a) {
			a++;
			if (a % 2 != 0) {
					continue;
			}
			System.out.println(a);
		}
	}
}
