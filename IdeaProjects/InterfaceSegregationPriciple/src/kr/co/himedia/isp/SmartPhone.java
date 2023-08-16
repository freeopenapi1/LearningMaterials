package kr.co.himedia.isp;

public class SmartPhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void camera() {
        System.out.println("Take a picture");
    }

    @Override
    public void sms() {
        System.out.println("Sending...");
    }
}
