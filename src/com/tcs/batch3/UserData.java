package com.tcs.main;
import com.tcs.batch3.base.BaseUser;
import java.util.*;

public class UserData extends BaseUser{

	String name;
	Integer age;
	String address;
	String empID;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void createID()
	{
		String empID = UUID.randomUUID().toString();
		System.out.println("User ID" + empID + " generated...");
	}
	public String getEmpID() 
	{
		return empID;
	}	
}
