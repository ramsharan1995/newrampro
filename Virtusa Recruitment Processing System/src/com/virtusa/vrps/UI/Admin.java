package com.virtusa.vrps.UI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.virtusa.vrps.UI.Registration;
public class Admin {
	
Registration r=new Registration();
	static List<Admin> a = new ArrayList<Admin>();
	Scanner sc=new Scanner(System.in);
	private int jobid;
	private String jobrole="";
	private String qualification="";
	private int count;
	
	public Admin(int jobid,String jobrole,String qualification) {
		this.jobid=jobid;
		this.jobrole=jobrole;
		this.qualification=qualification;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void Entry1() {
		
		int choice;
		
		
		System.out.println("--------WELCOME TO Admin-------");
		System.out.println("Do U want to \\n1.ViewApplicants \\n2.SelectApplicant\\n3.ProvidesReviews\\n4.ApprovesApplicant\\n5.RejectsApplicant\t6.Addsjobs \t7.displayjobs ");
		choice=sc.nextInt();
		switch(choice)
        {
            case 1:System.out.println("ViewApplicants");         
            ViewApplicants();
            logout();
            break;
            case 2: System.out.println("SelectApplicant");
            SelectApplicant();
            logout();
            break;
            case 3: System.out.println("ProvidesReviews");
            ProvidesFeedback();
            logout();
            break;
            case 4: System.out.println("ApprovesApplicant");
            ApprovesApplicant();
            logout();
            break;
            case 5: System.out.println("RejectsApplicant");
            RejectsApplicant();
            logout();
            logout();
            break;
            case 6: System.out.println("\tadds job\t");
            AddJobs();
            logout();
            break;
            case 7: System.out.println("\t\tDisplays job\t\t");
              DisplayJobs();
              logout();
             break;
            default:
            {
                System.out.println(" enter a valid number 1-7");
            }
            System.exit(0);
        }
	}
	public void logout() {
		// TODO Auto-generated method stub
	 System.out.println("Do U want to LOGOUT\n1.Yes\n2.No");
     @SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
		int choice = sc.nextInt();
     switch(choice)
         {
             case 1:System.out.println("logout success");
             break;
             case 2: System.out.println("logout unsuccess");
             break;
             default:
             {
                 System.out.println("enter valid information");
             }
         }
    
 }
public void AddJobs() {
		System.out.println("ENTER JOBID,JOBNAME,Job QuALIFICATIONS");
		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
	  int jobid=c.nextInt();
	    String jobrole=c.nextLine();
	    String qualification=c.nextLine();
	    Admin ad=new Admin(jobid, jobrole, qualification);
	    a.add(ad);
	}
public static void DisplayJobs() {
	
	for(Admin ad : a) {
		
		System.out.println( ad.getJobid() +" "+ad.getJobrole()+" "+ad.getQualification());
	}	
}


public void ViewApplicants() {
		for(Admin ad : a) {
			
			System.out.println(ad.getCount()+ " "); 
		}
	}
	
	public void SelectApplicant() {
		System.out.println("no selected Applicants Yet");
	 if(qualification.matches(Registration.uqualification(qualification))){
		 
		 System.out.println("applicant shortlisted with"+r.getQualification());
	 }
	}
	public void ProvidesFeedback() {
		System.out.println("no Reviews Yet");
	}
	public void ApprovesApplicant() {
    	System.out.println("Application is approved");

	}
    public void RejectsApplicant() {
    	System.out.println("Application is rejected");
    }
	
	
}
