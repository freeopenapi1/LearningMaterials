package kr.co.himedia.generic06;

public class GenericMethod {
	
	public static <T,V> double makeRectangle(Point<T,V> point1, Point<T,V> point2) {
		double left = ((Number)point1.getX()).doubleValue();
		double right = ((Number)point2.getX()).doubleValue();
		
		double top = ((Number)point1.getY()).doubleValue();
		double bottom = ((Number)point2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형 넓이는 " +rect+ "입니다.");
	}

}





































