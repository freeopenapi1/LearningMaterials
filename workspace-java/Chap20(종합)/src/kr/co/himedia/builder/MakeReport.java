package kr.co.himedia.builder;

public interface MakeReport {
	
	void MakeHeader();
	void MakeBody();
	void MakeFooter();
	
	String getReport();

}
