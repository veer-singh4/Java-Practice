package com.sa.heartihealth;

import javax.persistence.*;

@Entity
@Table(name = "MemberInfo")

public class MemberInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String member_id;
	private String username;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	private String email;
	private long phonenumber;
	
	public MemberInfo() {
		super();
	}
	public MemberInfo(String member_id, String username, String firstname, String lastname, int age, String gender,
			String email, long phonenumber) {
		super();
		this.member_id = member_id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	 
	
	

}
