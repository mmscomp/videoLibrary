
package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="romantic")
public class Romantic {
	
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
	
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public Romantic(){}
	public Romantic(String title){
//		super(genre);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String name) {
		this.title = name;
	}
	public String getCasting() {
		return casting;
	}
	public void setCasting(String casting) {
		this.casting = casting;
	}
	public int getId() {
		return id;
	}

}
