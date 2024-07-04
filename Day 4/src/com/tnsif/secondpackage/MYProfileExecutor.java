package com.tnsif.secondpackage;

import com.tnsif.accessmodifiersdemo.MYProfile;

public class MYProfileExecutor  {

	public static void main(String[] args) {
		MYProfile p=new MYProfile();
		
		//public members accessible
		p.name="Shantanu";
		p.displayname();
		
		//private  members are not accessible
		/*
		 * p.age=22; p.showAge();
		 */
		
		//default members accessible
		//p.mobileNo=436475;
		//p.getMobileNo();
		
		//protected members accessible
		//p.email="abc@xyzcom";
		//p.sendEmail();
		
		p.display();	}

}
