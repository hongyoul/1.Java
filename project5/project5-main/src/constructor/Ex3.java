package constructor;

public class Ex3 {

}

// 게시물을 정의하는 클래스
class Board{
	int no;
	String title;
	String content;
	String writer;

	//초기화 하는 생성자를 만들고 싶으면 Source -> Generate constructor using fieds~
	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public Board(int no) {
		super();
		this.no = no;
	}
	public Board(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}
//	매개변수가 하나도 없으면 디폴트 생성자 = 기본생성자
	public Board() {
		super();
	}
	
}