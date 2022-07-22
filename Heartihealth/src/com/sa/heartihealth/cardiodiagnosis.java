package com.sa.heartihealth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cardiodiagnosis")
public class cardiodiagnosis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String cardio_id;
	private int cardioarrestdetected;
    private  Date date=new Date();
    
    @OneToMany
	@JoinColumn(name="memberinfo_member_id")
    List<MemberInfo> memberinfo_member_id=new ArrayList<MemberInfo>();

    
    
	public cardiodiagnosis() {
		super();
	}


	public cardiodiagnosis(String cardio_id, int cardioarrestdetected, Date date) {
		super();
		this.cardio_id = cardio_id;
		this.cardioarrestdetected = cardioarrestdetected;
		this.date = date;
		
	}


	public String getCardio_id() {
		return cardio_id;
	}


	public void setCardio_id(String cardio_id) {
		this.cardio_id = cardio_id;
	}


	public int getCardioarrestdetected() {
		return cardioarrestdetected;
	}


	public void setCardioarrestdetected(int cardioarrestdetected) {
		this.cardioarrestdetected = cardioarrestdetected;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<MemberInfo> getMemberinfo_member_id() {
		return memberinfo_member_id;
	}


	public void setMemberinfo_member_id(List<MemberInfo> memberinfo_member_id) {
		this.memberinfo_member_id = memberinfo_member_id;
	}


	
    
	
    


}
