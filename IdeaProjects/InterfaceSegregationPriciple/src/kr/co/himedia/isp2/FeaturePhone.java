package kr.co.himedia.isp2;

public class FeaturePhone implements Call {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void dial() {
        System.out.println("dialing...");
    }
}
