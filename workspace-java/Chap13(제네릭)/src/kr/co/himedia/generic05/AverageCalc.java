package kr.co.himedia.generic05;

public class AverageCalc<T extends Number> {

	private T[] numbers;
	
	public AverageCalc(T[] numbers) {
		this.numbers = numbers;
	}
	
	public double calculateAverage() {
		double sum = 0.0;
		for (T number : numbers)
			sum += number.doubleValue();
		return sum/numbers.length;
	}
}
