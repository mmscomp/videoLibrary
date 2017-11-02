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
	private String casting;
	
	@Column(name="links")
	private String links;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCasting() {
		return casting;
	}
	public void setCasting(String casting) {
		this.casting = casting;
	}
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public Comedy(){}
	public Comedy(String title){
//		super(genre);
		this.title = title;
	}
	
	
}
