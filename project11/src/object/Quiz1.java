package object;

//연도,월,일을 멤버로 가지는 Date클래스를 만드세요.
//
//날짜의 내용을 같은지 비교하도록 equals 메소드를 재정의하세요.
//
//다음과 같이 인스턴스를 생성하고, 비교하세요
//MyDate date1 = new MyDate(2024, 4, 16);
//MyDate date2 = new MyDate(2024, 4, 16);
//date1.equals(date2) --> true
//
//MyDate date3 = new MyDate(2024, 4, 16);
//MyDate date4 = new MyDate(2024, 4, 17);
//date3.equals(date4) --> false

public class Quiz1 {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(2024,4,16);
		MyDate date2 = new MyDate(2024,4,16);

		if (date1.equals(date2)) {
			System.out.println("date1와 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1와 date2는 같은 날짜가 아닙니다.");
		}

		MyDate date3 = new MyDate(2024,4,16);
		MyDate date4 = new MyDate(2024,4,17);

		if (date3.equals(date4)) {
			System.out.println("date3와 date4는 같은 날짜입니다.");
		} else {
			System.out.println("date3와 date4는 같은 날짜가 아닙니다.");
		}
	}
}
// MyDate 클래스 
class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	@Override  // 오버라이드(Override)정의는 선업부는 같고 구현부가 다르다는 뜻이다.
	public boolean equals(Object obj) { // Object는 부모타입으로 위에 MyDate에 년,월,일을 꺼낼 수 없다.
		if (obj instanceof MyDate) {    // 
			
			MyDate date = (MyDate)obj; // 원래 타입으로 다운캐스팅한다 [클래스 클래스명=(클래스)부모타입명]
			
//			if (this.year == date.year) {
//				
//			} else if (this.month == date.month) {
//				
//			}  else if (this.day == date.day) {
//				
//			} else {
//				System.out.println();	
//			}
			if (this.year == date.year && this.month == date.month && this.day == date.day) {
			}
		}
		return false;
	}
}
