package instance.quiz;

// 다음과 같이주문 클래스(Order)를 정의하세요.
// 주문번호, 주문날짜, 주문자이름, 배송지를 속성으로 갖습니다.
// 모든 주문정보를 출력하는 showOrderInfo 함수를 갖습니다.
// 그리고 Order 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.

// 주문번호: 1111
// 주문날짜: 2018년3월12일
// 주문자이름: 둘리
// 배송지: 서울시 영등포구 여의도동 20번지

public class Quiz2 {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNumber = 1111;
		order.orderDay = "2018년 3월 12일";
		order.name = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";

			order.showOrderInfo();
	}

}
class Order{
	int orderNumber;
	String orderDay;
	String name;
	String address;
	
	public void showOrderInfo() {
		System.out.println(
				"주문번호:" + orderNumber + ", 주문날짜:" + orderDay + ", 주문자이름: " + orderNumber+ ", 배송지:" + address);
	}
	}
