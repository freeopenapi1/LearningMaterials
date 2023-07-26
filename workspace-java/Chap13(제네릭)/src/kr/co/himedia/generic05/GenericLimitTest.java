package kr.co.himedia.generic05;

public class GenericLimitTest {

	public static void main(String[] args) {
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		Double[] doubleArr = {10.0, 20.0, 30.0, 40.0, 50.0};
		String[] strArr = {"hi", "media"};
		
		AverageCalc<Integer> integerCalc = new AverageCalc<>(intArr);
		double integerAverage = integerCalc.calculateAverage();
		System.out.println(integerAverage);
		
		AverageCalc<Double> doubleCalc = new AverageCalc<>(doubleArr);
		double doubleAverage = doubleCalc.calculateAverage();
		System.out.println(doubleAverage);
		
		//AverageCalc<String> strCalc = new AverageCalc<>(strArr);
	}
}
