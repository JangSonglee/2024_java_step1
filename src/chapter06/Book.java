package chapter06;

public class Book {
	
	//멤버변수 = 필드
	public String bookname;
	public String author;
	
	//생성자 : 오버로딩을 하고 나면 기본 생성자가 무엇인지 알려줘야 함 ! 오버로딩 시 반드시 기술해 줘야 한다!
	public Book() {
		
	}
	
	//메모리 확복 + 멤버변수 방에 초기화
	public Book(String bookname, String author) {
		this.bookname = bookname; //멤버변수에서 북네임을 가지고 와 !
		this.author = author;
	}
	
	//메소드
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//사용자 정의 메소드
		public void showBookinfo() {
			System.out.println("책이름: " + bookname+" | 저자: " + author );
		}

}
