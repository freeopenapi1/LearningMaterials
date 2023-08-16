package kr.co.himedia.ocp;

public class OldProductValidator implements Validator {
    @Override
    public boolean support(Product product) {
        return product.getOption().equals("Old");
    }

    @Override
    public void validate(Product product) throws IllegalArgumentException {
        if (product.getPrice() < 20000) {
            throw new IllegalArgumentException(product.getName()
                    + " :  가격 유효성 체크를 통과 못했습니다. 중고 제품의 가격은 20000원 이상이어야 합니다.");
        }
        System.out.println(product.getName()
                + " : 중고 제품의 가격 유효성 체크를 통과 하였습니다.");
    }
}
