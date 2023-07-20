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
		//super();
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + " 담당 상담원 번호는 " +agentId+ "입니다.";
	}
}


































