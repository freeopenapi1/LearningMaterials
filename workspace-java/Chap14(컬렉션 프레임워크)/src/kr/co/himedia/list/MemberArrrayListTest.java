package kr.co.himedia.list;

public class MemberArrrayListTest {

	public static void main(String[] args) {
		
		MemberArrrayList memberArrrayList = new MemberArrrayList();
		
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		
		memberArrrayList.addMember(memberL);
		memberArrrayList.addMember(memberW);
		memberArrrayList.addMember(memberR);
		memberArrrayList.addMember(memberS);
		
		memberArrrayList.showAllMembers();

	}

}
