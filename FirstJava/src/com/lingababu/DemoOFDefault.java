package com.lingababu;

public class DemoOFDefault {

//	 default method
	
	 void welcome() {
		
		System.out.println("default method from Demo of Default classs");
	}
//	  public
	 
	 public void welcomePublic() { 
//		 sbi 
//		  with draw amount
		 System.out.println("this is public method of demoOf Default class");
	 }
//	 icici bank take this method because this is public proxy might be happen
	 
//	  private 
	 
	 private void welcomeToPrivate() { 
//		 utility method -this is method ca use entire class not any out of source
//		 withdraw logic
//		 linga  babu- wants -2000
		 //		 murali-wants -1000
//		 krishna wants -500
//		 every customer take money if they want/// 2000 or 100 or 10 or 2
		 System.out.println("this is private method of Demo of default class ");
//		 welcomeToProtected();
	 }
	 
//	 protected method is access on same class and same package and another package of subclass
	 
	 protected void welcomeToProtected() {
		 
		 System.out.println("this is protected method of demoOFDefault classs");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
