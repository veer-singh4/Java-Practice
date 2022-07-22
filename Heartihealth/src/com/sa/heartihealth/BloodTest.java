package com.sa.heartihealth;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name="BloodTest")
public class BloodTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String blood_id;
    private  Date date=new Date();
    private  int bloodpressure;
    private int fbs;
    private int thal;
    private int serumcholesterol;
    
    @OneToMany
	@JoinColumn(name="cardiodiagnosis_cardio_id")
   List<cardiodiagnosis> cardiodiagnosis_cardio_id=new ArrayList<cardiodiagnosis>();
   
    
    
	public BloodTest() {
		super();
	}


	public BloodTest(String blood_id, Date date, int bloodpressure, int fbs, int thal, int serumcholesterol) {
		super();
		this.blood_id = blood_id;
		this.date = date;
		this.bloodpressure = bloodpressure;
		this.fbs = fbs;
		this.thal = thal;
		this.serumcholesterol = serumcholesterol;
	}


	public String getBlood_id() {
		return blood_id;
	}


	public void setBlood_id(String blood_id) {
		this.blood_id = blood_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getBloodpressure() {
		return bloodpressure;
	}


	public void setBloodpressure(int bloodpressure) {
		this.bloodpressure = bloodpressure;
	}


	public int getFbs() {
		return fbs;
	}


	public void setFbs(int fbs) {
		this.fbs = fbs;
	}


	public int getThal() {
		return thal;
	}


	public void setThal(int thal) {
		this.thal = thal;
	}


	public int getSerumcholesterol() {
		return serumcholesterol;
	}


	public void setSerumcholesterol(int serumcholesterol) {
		this.serumcholesterol = serumcholesterol;
	}


	public List<cardiodiagnosis> getCardiodiagnosis_cardio_id() {
		return cardiodiagnosis_cardio_id;
	}


	public void setCardiodiagnosis_cardio_id(List<cardiodiagnosis> cardiodiagnosis_cardio_id) {
		this.cardiodiagnosis_cardio_id = cardiodiagnosis_cardio_id;
	}


}
