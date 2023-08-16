package kr.co.himedia.isp2;

public class SmartPhone implements Call, Camera, Sms {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void dial() {
        System.out.println("dialing...");
    }

    @Override
    public void takePhoto() {
        System.out.println("take Photo...");
    }

    @Override
    public void takeVideo() {
        System.out.println("take Video...");
    }

    @Override
    public void sendText() {
        System.out.println("send Text...");
    }
}
