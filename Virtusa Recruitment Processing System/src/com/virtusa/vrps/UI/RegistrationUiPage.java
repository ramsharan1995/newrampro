package com.virtusa.vrps.UI;
import java.util.Scanner;

import com.virtusa.vrps.Service.*;
public class RegistrationUiPage {
	
Scanner sc=new Scanner(System.in);

public void Entry() {
	
		int choice;
		
		
		System.out.println("--------WELCOME TO VRPS--------");
		System.out.println("Do U want to \\n1.Register \\n2.Login  ");
		choice=sc.nextInt();
		switch(choice)
        {
            case 1:System.out.println("register");         
			 RegistrationPage();
            break;
           	
            case 2: System.out.println("login");
            break;
           	
            
	default:
            {
                System.out.println(" enter a valid number 1 or 2");
            }
            System.exit(0);
        }
	}

	public boolean RegistrationPage() {
		
		boolean bol=false;	
		Validation val=new Validation();
	System.out.println("............RegistrationPage............");
	System.out.println("Enter your EmployeeID");	
	
	String id=sc.next();	
    bol=val.checkEmployeeId(id);
	if(bol==true) {
	System.out.println("Enter your Name");
	String name=sc.next();	
	}
	System.out.println("Enter your Designation");
	String designation=sc.next();
	System.out.println("Enter your Mobile number  -->(Must starts with [6-9].And don't enter 'letters&symbols')");
	String mobile=sc.next();
	bol=val.checkMobileNum(mobile);
	if(bol==true) {
	System.out.println("Set  Username  -->(You can use only 'lowercase letters','numbers' & Must End's with '@virtusa.com')");
	String username=sc.next();
	bol=val.checkUserName(username);
	}
	if(bol==true)
	System.out.println("Set Password  -->(Use 8 or more characters with a mix of letters, numbers & symbols)");
	String password=sc.next();
	bol=val.checkPassword(password);
	System.out.println("Confirm Password");
	String ConfirmPassword=sc.next();
	bol=val.checkConfirmPassword(ConfirmPassword);
	System.out.println("registration succesful");
	
	return false;
	 }
	

	/*//System.out.println("Do you wish to login ");
		System.out.println("............RegistrationPage............");
		System.out.println("Enter your EmployeeID");	
		Scanner sc=new Scanner(System.in);
		String id=sc.next();	
	    bol=val.checkEmployeeId(id);
		if(bol==true) {
		System.out.println("Enter your Name");
		String name=sc.next();	
		}
		System.out.println("Enter your Designation");
		String designation=sc.next();
		System.out.println("Enter your Mobile number  -->(Must starts with [6-9].And don't enter 'letters&symbols')");
		String mobile=sc.next();
		bol=val.checkMobileNum(mobile);
		if(bol==true) {
		System.out.println("Set  Username  -->(You can use only 'lowercase letters','numbers' & Must End's with '@virtusa.com')");
		String username=sc.next();
		bol=val.checkUserName(username);
		}
		if(bol==true)
		System.out.println("Set Password  -->(Use 8 or more characters with a mix of letters, numbers & symbols)");
		String password=sc.next();
		System.out.println("Confirm Password");
		String cnfPassword=sc.next();
		System.out.println("regis succesful");
	*/
	}
// }
