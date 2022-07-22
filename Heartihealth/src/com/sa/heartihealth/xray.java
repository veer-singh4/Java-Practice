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
@Table(name="addressinfo")
public class xray {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String xrat_id;
	Date date =new Date();
	private int ca;
	@OneToMany
	@JoinColumn(name="cardiodiagnosis_cardio_id")
	List<cardiodiagnosis> cardiodiagnosis_cardio_id=new ArrayList<cardiodiagnosis>();

	
	
	public xray() {
		super();
	}


	public xray(String xrat_id, Date date, int ca) {
		super();
		this.xrat_id = xrat_id;
		this.date = date;
		this.ca = ca;
	}


	public String getXrat_id() {
		return xrat_id;
	}


	public void setXrat_id(String xrat_id) {
		this.xrat_id = xrat_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getCa() {
		return ca;
	}


	public void setCa(int ca) {
		this.ca = ca;
	}


	public List<cardiodiagnosis> getCardiodiagnosis_cardio_id() {
		return cardiodiagnosis_cardio_id;
	}


	public void setCardiodiagnosis_cardio_id(List<cardiodiagnosis> cardiodiagnosis_cardio_id) {
		this.cardiodiagnosis_cardio_id = cardiodiagnosis_cardio_id;
	}
	
}
