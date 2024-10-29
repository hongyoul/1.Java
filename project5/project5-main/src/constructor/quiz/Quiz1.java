package constructor.quiz;

// 문제
	//책(Book)을 정의하는 클래스를 만드세요.
	//속성: 제목, 가격, 출판사, 페이지수
	//생성자: 디폴트 생성자, 모든 멤버변수를 입력받는 생성자
	//
	//모든 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
	//(스프링부트, 30000, 한빛출판사, 200)
	//(자바프로그래밍, 10000, 금빛출판사, 300)

public class Quiz1 {

	public static void main(String[] args) {
		// 객체 생성 후 초기화
		Book book1 = new Book(); 
		book1.bookTitle = "스프링부트"; 
		book1.bookPrice = 30000;
		book1.bookCompany = "한빛출판사";
		book1.bookPage = 200;

		// 객체 생성과 동시에 초기화
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300); // 인스턴스 생성과 동시에 모든 멤버변수 초기화
	}
}
	class Book{
		String bookTitle; 
		int bookPrice; 
		String bookCompany; 
		int bookPage; 
		
		public Book() {
			super();
		}

		public Book(String bookTitle, int bookPrice, String bookCompany, int bookPage) {
			super();
			this.bookTitle = bookTitle;
			this.bookPrice = bookPrice;
			this.bookCompany = bookCompany;
			this.bookPage = bookPage;
		}
		
	}




