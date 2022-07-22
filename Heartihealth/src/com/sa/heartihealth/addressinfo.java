package com.sa.heartihealth;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="addressinfo")
public class addressinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String address_id;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	
	@OneToMany
	@JoinColumn(name="memberinfo_member_id")
    List<MemberInfo> memberinfo_member_id=new ArrayList<MemberInfo>();
	public addressinfo() {
		super();
	}
	public addressinfo(String address_id, String city, String state, String country, String pincode) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public List<MemberInfo> getMemberinfo_member_id() {
		return memberinfo_member_id;
	}
	public void setMemberinfo_member_id(List<MemberInfo> memberinfo_member_id) {
		this.memberinfo_member_id = memberinfo_member_id;
	}
	
	

	
	
	

}
