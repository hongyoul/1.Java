package reference.quiz;

//도서관의 회원(Member)을 정의하는 클래스를 만드세요.
//속성: 회원번호, 이름, 대여한 책1, 책2, 책3
//책(Book)을 정의하는 클래스를 만드세요.
//속성: 제목, 가격, 출판사, 페이지수
//
//회원을 생성하고, 회원이 대여한 책 3권을 추가하세요.

public class Quiz1 {

	public static void main(String[] args) {
		Book bookName1 = new Book("제니의 생활", 21000, "교보문구", 450);
		Book bookName2 = new Book("리사의 탐구", 32000, "카카오페이지", 550);
		Book bookName3 = new Book("지수의 요리", 45000, "리디", 680);

		Member member = new Member(13584, "로제", bookName1, bookName2 , bookName3);

	}

}
class Book{
	String bookName;
	int price;
	String company;
	int bookPage;
	
	public Book(String bookName, int price, String company, int bookPage) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.company = company;
		this.bookPage = bookPage;
	}
	
}

class Member{
	int memberNumber;
	String memberName;
	Book bookName1;
	Book bookName2;
	Book bookName3;
	
	public Member(int memberNumber, String memberName, Book bookName1, Book bookName2, Book bookName3) {
		super();
		this.memberNumber = memberNumber;
		this.memberName = memberName;
		this.bookName1 = bookName1;
		this.bookName2 = bookName2;
		this.bookName3 = bookName3;
	}
}
