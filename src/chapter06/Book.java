package chapter06;

public class Book {
	
	//������� = �ʵ�
	public String bookname;
	public String author;
	
	//������ : �����ε��� �ϰ� ���� �⺻ �����ڰ� �������� �˷���� �� ! �����ε� �� �ݵ�� ����� ��� �Ѵ�!
	public Book() {
		
	}
	
	//�޸� Ȯ�� + ������� �濡 �ʱ�ȭ
	public Book(String bookname, String author) {
		this.bookname = bookname; //����������� �ϳ����� ������ �� !
		this.author = author;
	}
	
	//�޼ҵ�
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
	
	//����� ���� �޼ҵ�
		public void showBookinfo() {
			System.out.println("å�̸�: " + bookname+" | ����: " + author );
		}

}