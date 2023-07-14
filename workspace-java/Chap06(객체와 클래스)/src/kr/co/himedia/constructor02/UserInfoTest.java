package kr.co.himedia.constructor02;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "himedia";
		userInfo.userPassWord = "1128";
		userInfo.userName = "이순신";
		System.out.println(userInfo.showUserInfo());
		
		UserInfo userInfo2 = new UserInfo("himedia-chunho", "1129", "신사임당");
		System.out.println(userInfo2.showUserInfo());
	}
}
