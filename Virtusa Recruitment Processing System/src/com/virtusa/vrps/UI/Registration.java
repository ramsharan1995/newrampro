package com.virtusa.vrps.UI;
public class Registration {
	
	public int empID;
	public String mailID;
	public String name;
	public String designation;
	public static String uqualification;
	public String mobileNum;
	public String username;
	public String password;
	public String confirmPassword;
	
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		public String getMailID() {
			return mailID;
		}
		public void setMailID(String mailID) {
			this.mailID = mailID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getMobileNum() {
			return mobileNum;
		}
		public void setMobileNum(String mobileNum) {
			this.mobileNum = mobileNum;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public String getQualification() {
			return uqualification;
		}
		public void setQualification(String uqualification) {
			Registration.uqualification = uqualification;
		}
		public static String uqualification(String uqualification) {
			// TODO Auto-generated method stub
			return uqualification;
		}

}

