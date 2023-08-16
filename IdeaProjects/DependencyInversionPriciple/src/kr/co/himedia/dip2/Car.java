package kr.co.himedia.dip2;

public class Car {
    private Tyre tyre;

    public Car(Tyre tyre){
        this.tyre = tyre;
    }

    public void drive() {
        System.out.println("Driving with " + tyre.tyreType());
    }
}
