package kr.co.himedia.set02;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {		// 멤버 아이디를 매개변수로, 삭제여부를 리턴
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
				
		}
				
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for (Member member : hashSet)
			System.out.println(member);
		System.out.println();
	}	
}









