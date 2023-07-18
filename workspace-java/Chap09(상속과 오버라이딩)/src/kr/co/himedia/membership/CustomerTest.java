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
	}

}
