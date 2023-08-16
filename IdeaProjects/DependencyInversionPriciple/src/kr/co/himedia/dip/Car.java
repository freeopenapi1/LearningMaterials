package kr.co.himedia.dip;

public class Car {
    private SummerTyre summerTyre;

    public Car(SummerTyre summerTyre) {
        this.summerTyre = summerTyre;
    }

    public SummerTyre getSummerTyre() {
        return summerTyre;
    }

    public void drive() {
        System.out.println("Driving with " + summerTyre.tyreType());
    }
}
