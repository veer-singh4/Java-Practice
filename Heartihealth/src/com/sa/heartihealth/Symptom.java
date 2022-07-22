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
@Table(name = "Symptom")
public class Symptom {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String Symptom_id;
	Date date=new Date();
	private int exang;
	private float oldpeak;
	private int cp;
	@OneToMany
	@JoinColumn(name="cardiodiagnosis_cardio_id")
   List<cardiodiagnosis> cardiodiagnosis_cardio_id=new ArrayList<cardiodiagnosis>();

	
	public Symptom() {
		super();
	}


	public Symptom(String symptom_id, Date date, int exang, float oldpeak, int cp) {
		super();
		Symptom_id = symptom_id;
		this.date = date;
		this.exang = exang;
		this.oldpeak = oldpeak;
		this.cp = cp;
	}


	public String getSymptom_id() {
		return Symptom_id;
	}


	public void setSymptom_id(String symptom_id) {
		Symptom_id = symptom_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getExang() {
		return exang;
	}


	public void setExang(int exang) {
		this.exang = exang;
	}


	public float getOldpeak() {
		return oldpeak;
	}


	public void setOldpeak(float oldpeak) {
		this.oldpeak = oldpeak;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public List<cardiodiagnosis> getCardiodiagnosis_cardio_id() {
		return cardiodiagnosis_cardio_id;
	}


	public void setCardiodiagnosis_cardio_id(List<cardiodiagnosis> cardiodiagnosis_cardio_id) {
		this.cardiodiagnosis_cardio_id = cardiodiagnosis_cardio_id;
	}
	

}
