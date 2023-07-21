package kr.co.himedia.utilitiesInterface.userinfo.dao.postgres;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;

// UserInfoDAO 인터페이스를 구현한 PostgreSQL 버전 DAO
public class PostgreSQLDAOImpl implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into PostgreSQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into PostgreSQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into PostgreSQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into PostgreSQL DB userid = " + userInfoDTO.getUserId());
		
	}

}
