package kr.co.himedia.membership;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerL = new Customer();
		customerL.setCustomerName("이순신");
		customerL.setCustomerId(20230718);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());

		System.out.println();
		
		Customer customerS = new Customer(20230801, "신사임당");
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());
		
		System.out.println();
		
		VIPCustomer customerT = new VIPCustomer();
		customerT.setCustomerName("탐크루즈");
		customerT.setCustomerId(20230802);
		customerT.bonusPoint = 50000;
		System.out.println(customerT.showInfo());
		
		System.out.println();
		
		VIPCustomer customerH = new VIPCustomer(20230901, "헤일리 앳웰");
		customerH.bonusPoint = 60000;
		System.out.println(customerH.showInfo());
		
		System.out.println();
		
		Customer customerLe = new VIPCustomer(20231001, "레베카 페르구손");
		customerLe.bonusPoint = 61000;
		System.out.println(customerLe.showInfo());
		
		System.out.println();
		
		Customer customerSi = new VIPCustomer(2023, "사이먼 페그");
		customerSi.bonusPoint = 100000;
		int price = customerSi.calcPrice(10000);
		System.out.println(customerSi.showInfo() + "지불금액은 " +price+ "원 입니다.");
	}

}




















