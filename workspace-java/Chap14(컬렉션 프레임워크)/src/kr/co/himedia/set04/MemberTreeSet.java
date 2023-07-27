package kr.co.himedia.set04;

import java.util.Iterator;
import java.util.TreeSet;


public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {		// 멤버 아이디를 매개변수로, 삭제여부를 리턴
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
				
		}
				
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for (Member member : treeSet)
			System.out.println(member);
		System.out.println();
	}		
	
	
}
