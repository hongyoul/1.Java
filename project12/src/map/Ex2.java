package map;

import java.util.HashMap;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {

		// 회원목록을 저장하는 map 생성
		HashMap<Integer, Member> map = new HashMap<>();
		
		Member member1 = new Member(1001, "우지");
		Member member2 = new Member(1002, "호시");
		Member member3 = new Member(1004, "도겸");
		
		map.put(member1.memberId, member1); // 1001, 회원 객체
		map.put(member2.memberId, member3);
		map.put(member3.memberId, member3);
		
		System.out.println();

		// 회원 조회
		System.out.println(map.get(1001));
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		// 1번째 회원 삭제
		map.remove(1001);
		
		// 전체 회원 수 출력
		System.out.println("전체 회원 수 : " + map.size());
		
		// 전체 회원 목록 출력
		System.out.println(map);

		// 회원 목록 순회하기
		Set<Integer> keyset = map.keySet();
		
		// 변수 : 자료구조(배열, 리스트,set O map X)
		for (int key : keyset) { // 다음 key가 있으면
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key));  // 키로 회원 조회
		}
		
		
	}

}

//쇼핑몰 회원
class Member {
	int memberId; // 회원아이디
	String memberName; // 회원이름

	// 생성자 추가
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}
