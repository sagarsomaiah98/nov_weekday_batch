package com.sauce.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Read {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\CONFIG\\config.properties");
		
		Properties prop= new Properties();
		
		prop.load(fs);
		
		System.out.println(prop.getProperty("BROWSER"));
		
		
		//System.out.println(System.getProperty("user.dir"));
		
		
		

	}

}
