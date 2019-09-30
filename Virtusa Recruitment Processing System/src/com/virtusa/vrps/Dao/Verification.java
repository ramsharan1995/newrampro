package com.virtusa.vrps.Dao;


import java.util.Scanner;
import java.util.*;

import com.virtusa.vrps.Dao.Database;
public class Verification {
	Scanner sc=new Scanner(System.in);
	String username1="";
	String password1="";
public boolean LoginCredentials(String username, String password) {
		
		
		
		for(Map.Entry<String, String> entry: Database.m.entrySet()) {
					
			if(username.equals(entry.getKey())||password.equals(entry.getValue())) {			
				username1=entry.getKey();
				password1=entry.getValue();
				break;
			}			
		}
		  
			if(!(username.equals(username1)) &&(!(password.equals(password1)))) {
				System.out.println("invalid username&password");
				return false;
			
		} else if(!(username.equals(username1)))	{
			System.out.println("invalid username");
			return false;
	
		}else if(username.equals(username1)&& password.equals(password1)){				
				
				return true;
			}else {
				System.out.println("Invalid Password");	
				correctPassword();
				/*checkPassword(password1);*/
				}
			return true;
}
				
				boolean checkPassword(String password) {
					
					for(Map.Entry<String, String> entry: Database.m.entrySet()) {
						if(password.equals(entry.getValue())) {	
							username1=entry.getKey();
							password1=entry.getValue();
							LoginCredentials(username1, password1);
							break;
						}
					}
					
					
					
					return true;
				}
				
					
								
				public void correctPassword() {
					// TODO Auto-generated method stub
					System.out.println("Enter valid Password");
					
					 password1=sc.next();
					   checkPassword(password1);
					   
				}
			
			
				public void correctuserName() {
					   System.out.println("Enter valid username");
					   String username=sc.next();
					   checkUserName(username);
					}

				boolean checkUserName(String username) {
					// TODO Auto-generated method stub
					for(Map.Entry<String, String> entry:Database.m.entrySet()) {
						if(username.equals(entry.getKey())) {
							username1=entry.getKey();
							password1=entry.getValue();
							LoginCredentials(username1, password1);
							break;
							
						}
						
					}
					return true;
					
				}	
		
			

}

