package kr.co.himedia.list;

import java.util.ArrayList;

public class MemberArrrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public void showAllMembers() {
		for (Member member : arrayList)
			System.out.println(member);
		System.out.println();
	}
	
 
}
