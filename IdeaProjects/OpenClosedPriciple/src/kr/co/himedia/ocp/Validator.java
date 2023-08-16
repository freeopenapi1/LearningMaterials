package kr.co.himedia.ocp;

public interface Validator {

    boolean support(Product product);   // 새상품인지 중고품인지 파악하는 메서드
    void validate(Product product) throws IllegalArgumentException;

}
