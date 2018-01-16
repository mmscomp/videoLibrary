package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="education")
public class Education {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="field")
	private String field;

	public Education(){}
	public Education(String field) {
		this.field = field;
	}

	public int getId() {
		return id;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	

}
