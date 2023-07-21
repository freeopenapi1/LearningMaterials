package kr.co.himedia.utilitiesInterface.userinfo.dao.mysql;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;

public class MySqlDAOImpl implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySql DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySql DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MySql DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySql DB userid = " + userInfoDTO.getUserId());
		
	}

}
