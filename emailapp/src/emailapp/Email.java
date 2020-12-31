package emailapp;

import java.util.*;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultpasswordlength =10;
	private String department;
	private int mailBoxCapacity =500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "xyzcompany.com";
	
	
	//constructor to get firstName and lastName
	public Email(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created : "+ this.firstName + " " + this.lastName);
		
		//to call department method - return department
		this.department=setDepartment();
		//System.out.println("Department:" +this.department);
		
		//to call password method - returns random password;
		this.password =randomPassword(defaultpasswordlength);
		//System.out.println("Your password is : "+this.password);
		
		email = firstName + "." + lastName + "@" + department + "." + companySuffix;
		//System.out.println("Your email is : "+ email);
	}
	
	//method to get department
	private String setDepartment()
	{
		System.out.println("Enter your Department : \n1 for Sales \n2 for Development \n3 for Accounting "
				+ "\nEnter your choice : ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		
		if(depChoice==1) {return  "Sales";} 
		else if(depChoice==2) {return "Devlopment";}
		else if(depChoice==3) {return "Accounting";}
		else return "";				
		
		
	}
	
	//generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#&";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int random = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		
		return new String(password);
	}
	
	//set the mailbox capacity
		//here we are doing encapsulation by hiding essential details and showing
		//what is neccessary.
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity = capacity;
	}
	
	//set the alternate mail
	public void setAlternateEmail(String altemail)
	{
		this.alternateEmail = altemail;
	}
	
	//Set the password
	public void changePassword(String password)
	{
		this.password = password;
	}
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public void showInfo()
	{
		String n = "Your Credentials are : " +
				   "\nYour name : " + firstName  + " " + lastName +
				   "\nEmail : " + email  +
				   "\nYour password : " + password  +
				   "\nMail Box Capacity : "+mailBoxCapacity+
				   "\nYour Alternate email :"+ alternateEmail;
		System.out.println(n);
	}
	
	
}
