package j2j;

class Book{
	String title;
	
	Book(String t) {
		title = t;
	}
	void info() {
		System.out.println("제목: " + title);
	}
	void read() {
		System.out.println("책 읽는다.");
	}	
}

class EBook extends Book{
	String format;
	
	EBook(String t, String f){
		super(t);
		format = f;
	}
	void read() {
		System.out.println("전자책 읽는다.");
	}
	void info() {
		super.info();
		System.out.println("형식: " + format);
}
}

public class BookProgram {
	public static void main(String[] args) {
		Book book1 = new Book("자바 기초");
		EBook book2 =new EBook("자바 입문", "PDF");
		
		book1.info();
		System.out.println("--------------");
		book2.info();
		System.out.println("--------------");
		
		book1.read();
		System.out.println("--------------");
		book2.read();
		System.out.println("--------------");
		}
	}

