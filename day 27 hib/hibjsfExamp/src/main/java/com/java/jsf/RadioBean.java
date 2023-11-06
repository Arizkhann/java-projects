package com.java.jsf;

import javax.faces.event.ValueChangeEvent;

public class RadioBean {

	private String radioValue;
	private String radioText;
	private String gen;
	public String getRadioValue() {
		return radioValue;
	}
	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	public String getRadioText() {
		return radioText;
	}
	public void setRadioText(String radioText) {
		this.radioText = radioText;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "RadioBean [radioValue=" + radioValue + ", radioText=" + radioText + ", gen=" + gen + "]";
	}
	public RadioBean(String radioValue, String radioText, String gen) {
		super();
		this.radioValue = radioValue;
		this.radioText = radioText;
		this.gen = gen;
	}
	public RadioBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Gender[] getGender() {
		return Gender.values();
	}
	public void radioChanged(ValueChangeEvent e) {
		this.gen=e.getNewValue().toString();
	}
	
	
}
