package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="comedy")
public class Comedy{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="casting")
	private String[]casting;
	
	public Comedy(String title){
//		super(genre);
		this.title = title;
	}
	
	
}
