package com.virtusa.vrps.Client;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.virtusa.vrps.UI.*;
import com.virtusa.vrps.Dao.Verification;
import com.virtusa.vrps.UI.Admin;
public class UserController {

	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int choice = 0;
		int option=0;
	    boolean check=true;
		String role="";
		//boolean check= true;
		//int logoutFlag = 0;
		Admin a=new Admin();
		 RegistrationUiPage r=new RegistrationUiPage();
		 r.Entry();			
		//do{
	 check = true;
		System.out.println("............LOGIN............");
		System.out.println("1.User      2.Admin  ");
		//while(check==true){
			try{
		 option = s.nextInt();
		 check = false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter a valid input");
				s.nextLine();
			}
		//}
		s.nextLine();
		System.out.println("Enter username");			
		String username = s.nextLine();
		System.out.println("Enter password");
    	String password = s.nextLine();
    	
    	
    	
    	//Leave leave = null;
    	switch(option)
    	{
    	case 1:
    	{
    		if(option==1)
    		   role="User";
    		choice = 0;
    		boolean loginBool = false;
			try {
				loginBool =new Verification().LoginCredentials( username,password);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//e.printStackTrace();
			}
    		if(loginBool)
    		{
    			System.out.println(role+" Login Successfully");
    			//int back=0;
    			//logoutFlag=0;
    			//new HrImpl().verifyResume();
    		}

	} 
    	case 2:{
    		
    		if(option==2)
    			role="Admin";
    		choice = 0;
    		boolean loginBool = false;
			try {
				loginBool =new Verification().LoginCredentials(username,password);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//e.printStackTrace();
			}
    		if(loginBool)
    		{
     			
    			System.out.println(role+" Logged in Successfully");
    			System.out.println("DO you wish to continue\t\t"+username);
    			System.out.println("1.Yes 2.N");
    			choice=s.nextInt();
    			if(choice==1)
    			{
    				
        			a.Entry1();
    				
    			}else {
    				
    				a.logout();
    			}
    		
    			//int back=0;
    			//logoutFlag=0;
    			
    		}
    		
    	}
    	
    	
    	}
	}

	
}


