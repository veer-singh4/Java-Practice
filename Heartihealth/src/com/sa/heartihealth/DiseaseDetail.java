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
@Table(name="DiseaseDetails")
public class DiseaseDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String disease_id;
	private Date diagnoseddate =new Date();
	private Date recovereddate =new Date();
	private boolean isrecovered;
	
	@OneToMany
	@JoinColumn(name="cardiodiagnosis_cardio_id")
	List<cardiodiagnosis> cardiodiagnosis_cardio_id=new ArrayList<cardiodiagnosis>();

    
	public DiseaseDetail() {
		super();
	}


	public DiseaseDetail(String disease_id, Date diagnoseddate, Date recovereddate, boolean isrecovered) {
		super();
		this.disease_id = disease_id;
		this.diagnoseddate = diagnoseddate;
		this.recovereddate = recovereddate;
		this.isrecovered = isrecovered;
	}


	public String getDisease_id() {
		return disease_id;
	}


	public void setDisease_id(String disease_id) {
		this.disease_id = disease_id;
	}


	public Date getDiagnoseddate() {
		return diagnoseddate;
	}


	public void setDiagnoseddate(Date diagnoseddate) {
		this.diagnoseddate = diagnoseddate;
	}


	public Date getRecovereddate() {
		return recovereddate;
	}


	public void setRecovereddate(Date recovereddate) {
		this.recovereddate = recovereddate;
	}


	public boolean isIsrecovered() {
		return isrecovered;
	}


	public void setIsrecovered(boolean isrecovered) {
		this.isrecovered = isrecovered;
	}


	public List<cardiodiagnosis> getCardiodiagnosis_cardio_id() {
		return cardiodiagnosis_cardio_id;
	}


	public void setCardiodiagnosis_cardio_id(List<cardiodiagnosis> cardiodiagnosis_cardio_id) {
		this.cardiodiagnosis_cardio_id = cardiodiagnosis_cardio_id;
	}
	

}
