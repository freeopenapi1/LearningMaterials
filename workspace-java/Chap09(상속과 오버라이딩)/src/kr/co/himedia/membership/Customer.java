package kr.co.himedia.membership;

/*
 * * 고객의 속성
 * 		- 고객의 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 적립 비율 
 * 		- 일반 고객의 물품 구매시 1% 보너스 포인트 적립   
 */
public class Customer {
	
	private int customerId;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;		
		
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " +this.customerGrade+
							  "이며, 보너스 포인트는 " +this.bonusPoint+ "입니다.";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}































