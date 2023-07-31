package kr.co.himedia.lambda05;

@FunctionalInterface
public interface Converter<F, T> {

	T convert(F from);
	
}
