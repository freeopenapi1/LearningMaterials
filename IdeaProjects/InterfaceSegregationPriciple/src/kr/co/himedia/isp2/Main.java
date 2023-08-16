package kr.co.himedia.isp2;

public class Main {
    public static void main(String[] args) {

        Call basicPhone = new FeaturePhone();       //upcasting
        basicPhone.call();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.sendText();

        System.out.println();

        Call smartPhone2 = new SmartPhone();
        if(smartPhone2 instanceof SmartPhone) {
            SmartPhone smartPhone1 = (SmartPhone) smartPhone2;   //downcasting
            smartPhone1.call();
            smartPhone1.takePhoto();
        }
    }
}
