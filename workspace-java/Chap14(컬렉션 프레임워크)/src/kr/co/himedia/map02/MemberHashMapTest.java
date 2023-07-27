package kr.co.himedia.map02;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		
		MemberHashMap mHashMap = new MemberHashMap();
		
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		Member memberS2 = new Member(2026, "류성룡2");
		
		mHashMap.addMember(memberL);
		mHashMap.addMember(memberW);
		mHashMap.addMember(memberR);
		mHashMap.addMember(memberS);
		mHashMap.addMember(memberS2);
		
		mHashMap.showAllMembers();
		
		mHashMap.removeMember(2025);
		mHashMap.showAllMembers();
	}

}








