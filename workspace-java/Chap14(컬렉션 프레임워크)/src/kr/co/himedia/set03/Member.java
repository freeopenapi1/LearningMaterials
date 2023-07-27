package kr.co.himedia.set03;

public class Member implements Comparable<Member> {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		//super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " +memberId+ "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member member) {
		
//		if (this.memberId > member.memberId)
//			return 1;
//		else if (this.memberId < member.memberId)
//			return -1;
//		else 
//			return 0;
		
		return (this.memberId - member.memberId);		//오름차순, (-1) 곱하면 내림차순 정렬
		
	}

}












