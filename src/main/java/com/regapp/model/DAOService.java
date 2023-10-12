package com.regapp.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectionDB();
	public boolean verifyCredentials(String email, String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public ResultSet getAllReg();
	public void deleteByEmail(String email);
	public void updateReg(String email, String mobile);
	
	

}
