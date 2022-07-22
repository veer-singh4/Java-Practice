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
@Table(name="EcgePort")
public class EcgrePort {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String ecg_id;
	private Date date=new Date();
	private int restecg;
	
	@OneToMany
	@JoinColumn(name="cardiodiagnosis_cardio_id")
	List<cardiodiagnosis> cardiodiagnosis_cardio_id=new ArrayList<cardiodiagnosis>();

	
	
	public EcgrePort() {
		super();
	}


	public EcgrePort(String ecg_id, Date date, int restecg) {
		super();
		this.ecg_id = ecg_id;
		this.date = date;
		this.restecg = restecg;
		
	}


	public String getEcg_id() {
		return ecg_id;
	}


	public void setEcg_id(String ecg_id) {
		this.ecg_id = ecg_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getRestecg() {
		return restecg;
	}


	public void setRestecg(int restecg) {
		this.restecg = restecg;
	}


	public List<cardiodiagnosis> getCardiodiagnosis_cardio_id() {
		return cardiodiagnosis_cardio_id;
	}


	public void setCardiodiagnosis_cardio_id(List<cardiodiagnosis> cardiodiagnosis_cardio_id) {
		this.cardiodiagnosis_cardio_id = cardiodiagnosis_cardio_id;
	}	
	

}
