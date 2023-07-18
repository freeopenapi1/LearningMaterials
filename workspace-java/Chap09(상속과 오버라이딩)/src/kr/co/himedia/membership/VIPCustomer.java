package kr.co.himedia.membership;

/*
 * 	우수고객
 * 		- 제품을 살때 10%를 할인해 주기
 * 		- 보너스 포인트는 제품 가격의 5% 적립해 주기 
 * 		- 담당 전문 직원 배정하기 
 */
public class VIPCustomer extends Customer {

	private int agentId;
	double salesRatio;
	
	public VIPCustomer() {
		super();
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentId;
	}
}
