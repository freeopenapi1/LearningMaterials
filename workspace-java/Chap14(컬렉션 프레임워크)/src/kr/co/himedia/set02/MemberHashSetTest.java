package kr.co.himedia.set02;


public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mHashSet = new MemberHashSet();
		
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		
		mHashSet.addMember(memberL);
		mHashSet.addMember(memberW);
		mHashSet.addMember(memberR);
		mHashSet.addMember(memberS);
		mHashSet.showAllMembers();
		
		System.out.println();
		
		Member memberLe = new Member(2024, "이도");
		mHashSet.addMember(memberLe);
		mHashSet.showAllMembers();
		
		
		
	}
}














