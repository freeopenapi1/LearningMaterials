package kr.co.himedia.isp;

/*
사용하지 않는 기능을 구현해야 하는 경우
 */
public class FeaturePhone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void camera() {
        //기능 미제공
        throw new UnsupportedOperationException();
    }

    @Override
    public void sms() {
        //기능 미제공
        throw new UnsupportedOperationException();
    }
}
