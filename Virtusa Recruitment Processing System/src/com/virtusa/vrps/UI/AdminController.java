package com.virtusa.vrps.UI;

public class AdminController {

	 static public void main(String args[])
	 {
		 Admin us=new Admin();
		 us.ViewApplicants();
		 us.ApprovesApplicant();
		 us.SelectApplicant();
		 us.RejectsApplicant();
		 us.ProvidesFeedback();
		 us.AddJobs();
		 Admin.DisplayJobs();
	 }
	  
}