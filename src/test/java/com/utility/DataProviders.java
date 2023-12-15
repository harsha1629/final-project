package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataProviders {
	public String url,firstName,mobileNumber,lastname,city,
	zipcode,Email,Password,ConfirmPassword,currentPassword,NewPassword,ConfirmNewPassword;
	
	public DataProviders() {
		datas();
	}
	
	public void datas() {
		File inputFile = new File("C:\\Users\\hviswanathan\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\createAccountdata.properties");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(inputFile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		firstName = prop.getProperty("firstName");
		lastname=prop.getProperty("lastname");
		city=prop.getProperty("city");
		zipcode=prop.getProperty("zipcode");
		mobileNumber = prop.getProperty("mobileNumber");
		Email = prop.getProperty("Email");
		Password = prop.getProperty("Password");
		ConfirmPassword = prop.getProperty("ConfirmPassword");
		currentPassword=prop.getProperty("currentPassword");
		NewPassword=prop.getProperty("NewPassword");
		ConfirmNewPassword=prop.getProperty("ConfirmNewPassword");
				
	}

}
