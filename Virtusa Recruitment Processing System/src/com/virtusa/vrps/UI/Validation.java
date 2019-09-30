package com.virtusa.vrps.UI;
	import java.util.Scanner;

	public class Validation {
		RegistrationUiPage rup=new RegistrationUiPage();
		Scanner sc=new Scanner(System.in);
		
			public boolean checkEmployeeId(String EmployeeId) {
				if (!EmployeeId.matches("[0-9]+")) {
				    System.out.println("Invalid EmployeeId");	
				    correctEmployeeId();
				}else {				
					checkEmployeeIdLength(EmployeeId);				
				}
				return true;
			}
			
			public void correctEmployeeId() {
			   System.out.println("Enter valid EmployeeId");
			   String id=sc.next();
			   checkEmployeeId(id);
			}		
			
			public boolean checkEmployeeIdLength(String EmployeeId) {
				if(EmployeeId.length()!=7) {
					System.out.println("EmployeeID should be 7 digits");
					correctEmployeeId();			
				}else {
					return true;
				}
				return false;
			}
			
			public boolean checkMobileNum(String mobile) {
				if (!mobile.matches(("(0/91)?[6-9][0-9]{9}"))) {
				    System.out.println("Mobile number not take letters&symbols And must starts with [6-9] ");	
				    correctMobileNum();
				}else {				
					return true;
				}
				return true;
			}
			
			public void correctMobileNum() {
				   System.out.println("Enter valid mobile number");
				   String mobile=sc.next();
				   checkMobileNum(mobile);
				}		
				
			public boolean checkUserName(String Username) {
				if(!Username.matches("[a-z0-9@.]++")) {
					System.out.println("Username takes only 'lowercase letters'&'numbers'");
					correctuserName();
				}else if(!Username.contains("@virtusa.com")) {
					System.out.println("Username must end's with @virtusa.com");
					correctuserName();
				}else {
				        return true;
			    }
				return true;
			}
			
			public void correctuserName() {
				   System.out.println("Enter valid username");
				   String username=sc.next();
				   checkUserName(username);
				}	
			String s="";
			public boolean checkPassword(String password) {
				if (!password.matches("/^[a-zA-Z0-9]+$/")) {
				    System.out.println("Invalid Password");	
				    correctPassword();
				}else {				
					checkEmployeeIdLength(password);				
				}
				s=password;
				return true;
			}
			
			public void correctPassword() {
			   System.out.println("Enter valid Password");
			   String password=sc.next();
			   checkPassword(password);
			}		
			
			public boolean checkPasswordLength(String password) {
				if(password.length()!=8) {
					System.out.println("password should be 8 digits");
					correctPassword();			
				}else {
					return true;
				}
				return false;
			}
			
			public boolean checkConfirmPassword(String cnfpassword) {
				if (!cnfpassword.contentEquals(s)) {
				    System.out.println("Password is not matching");	
				    correctPassword();
				}else {
					return true;
				}
				return true;
			}
			
			public void correctConfirmPassword() {
				   System.out.println("Enter valid Conform Password");
				   String cnfpassword=sc.next();
				   checkPassword(cnfpassword);
				}		
				
	}


