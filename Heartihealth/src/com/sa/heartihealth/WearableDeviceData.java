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
@Table(name="WearableDevicedata")
public class WearableDeviceData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String wearable_device_id;
	private int thalach;
	private int slipe;
    private  Date date=new Date();
    
    @OneToMany
	@JoinColumn(name="cardiodiagnosis_cardio_id")
    List<cardiodiagnosis> cardiodiagnosis_cardio_id=new ArrayList<cardiodiagnosis>();

	public WearableDeviceData() {
		super();
	}
	public WearableDeviceData(String wearable_device_id, int thalach, int slipe, Date date) {
		super();
		this.wearable_device_id = wearable_device_id;
		this.thalach = thalach;
		this.slipe = slipe;
		this.date = date;
	}
	public String getWearable_device_id() {
		return wearable_device_id;
	}
	public void setWearable_device_id(String wearable_device_id) {
		this.wearable_device_id = wearable_device_id;
	}
	public int getThalach() {
		return thalach;
	}
	public void setThalach(int thalach) {
		this.thalach = thalach;
	}
	public int getSlipe() {
		return slipe;
	}
	public void setSlipe(int slipe) {
		this.slipe = slipe;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<cardiodiagnosis> getCardiodiagnosis_cardio_id() {
		return cardiodiagnosis_cardio_id;
	}
	public void setCardiodiagnosis_cardio_id(List<cardiodiagnosis> cardiodiagnosis_cardio_id) {
		this.cardiodiagnosis_cardio_id = cardiodiagnosis_cardio_id;
	}  

}
