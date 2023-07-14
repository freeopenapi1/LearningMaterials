package kr.co.himedia.encapsulation;

public class DisplayAddress {

	StringBuffer buffer = new StringBuffer();
	private String line = "=============================================\n";
	private String title = " 이름\t	주소 \t\t  전화번호		\n";	
	
	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();
	}

	private void makeFooter() {
		buffer.append(line);
	}

	private void makeBody() {
		buffer.append("이순신\t\t");
		buffer.append("서울 강동구 \t");
		buffer.append("010-3455-1256 \n");
		
		buffer.append("신사임당\t\t");
		buffer.append("서울 강남구 \t");
		buffer.append("010-3222-1257 \n");		
	}

	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
}
