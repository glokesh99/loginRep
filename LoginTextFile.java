package org.Selenium.ClassDemo;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoginTextFile {

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
	     //System.out.println(sb);
	     String[] split1 = sb.toString().split(" ");
	     for(int j = 2; j<= split1.length-1; j++){
	    	 if(j % 2 == 0){
	    		 String name = split1[j];
	    		 System.out.println(name);
	    	 }
	    	 else{
	    		 String pass = split1[j];
	    		 System.out.println(pass);
	    	 }
	     }
	}
}
