package org.Selenium.ClassDemo;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTextFile2 {

	public static void main(String[] args) throws IOException {
	     String line = null;
	     StringBuilder sbd = new StringBuilder();
	     FileReader f = new FileReader("C:\\Users\\hp\\Desktop\\Selenium\\text.txt");
	     BufferedReader br = new BufferedReader(f);
	     try{
	    	 line = br.readLine();
	    	 while(line !=null){
	    		 sbd.append(line);
	    		 sbd.append(" ");
	    		 line = br.readLine();
	    	 }
	     }
	     finally{
	    	 br.close();
	     }
	     String[] split = sbd.toString().split("\\s+");
	     ArrayList<String> al = new ArrayList<>();
	     for(String str : split){
	    	 al.add(str);
	     }
	     //System.out.println(al);
	     StringBuffer sb = new StringBuffer();
	     for(int i = 0; i <= al.size()-1; i++){
	    	 sb.append(al.get(i));
	    	 sb.append(" ");
	     }
	     
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://www.gcrit.com/build3/admin/login.php?action=process");	     
	     driver.manage().window().maximize();
	     String[] split1 = sb.toString().split(" ");
	     for(int j = 2; j<= split1.length-1; j++){
	    	 if(j % 2 == 0){
	    		 String name = split1[j];
	    		 //System.out.println(name);
	    		 WebElement userName = driver.findElement(By.name("username"));
	    		 userName.clear();
	    		 userName.sendKeys(name);
	    	 }
	    	 else{
	    		 String pass = split1[j];
	    		 //System.out.println(pass);
	    		WebElement passw = driver.findElement(By.name("password"));
	    		passw.clear();
	    		passw.sendKeys(pass);
	    	 }
	    	 WebElement subs = driver.findElement(By.id("tdb1"));
	    	 subs.submit();
	     }
	}
}
