package kr.co.himedia.utilitiesInterface.userinfo.dao;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;

// DAO에서 제공되어야 할 메서드를 선언한 인터페이스 
public interface UserInfoDAO {

	void insertUserInfo(UserInfoDTO userInfoDTO);
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
	
}
