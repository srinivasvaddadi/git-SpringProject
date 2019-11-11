package com.example.demo.fees;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Fee {
	
	@Id
	private String id;
	private String busFee;
	private String jntuFee;
	private String tutionFee;
	private String examFee;
	private String condonationFee;
	
	public Fee(String id, String busFee, String jntuFee, String tutionFee, String examFee, String condonationFee) {
		super();
		this.id = id;
		this.busFee = busFee;
		this.jntuFee = jntuFee;
		this.tutionFee = tutionFee;
		this.examFee = examFee;
		this.condonationFee = condonationFee;
	}
	
	public Fee() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusFee() {
		return busFee;
	}

	public void setBusFee(String busFee) {
		this.busFee = busFee;
	}

	public String getJntuFee() {
		return jntuFee;
	}

	public void setJntuFee(String jntuFee) {
		this.jntuFee = jntuFee;
	}

	public String getTutionFee() {
		return tutionFee;
	}

	public void setTutionFee(String tutionFee) {
		this.tutionFee = tutionFee;
	}

	public String getExamFee() {
		return examFee;
	}

	public void setExamFee(String examFee) {
		this.examFee = examFee;
	}

	public String getCondonationFee() {
		return condonationFee;
	}

	public void setCondonationFee(String condonationFee) {
		this.condonationFee = condonationFee;
	}

}
