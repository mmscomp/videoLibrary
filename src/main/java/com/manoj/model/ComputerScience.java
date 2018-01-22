package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="computerScience")
public class ComputerScience {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="link")
	private String link;

	@Column(name="username")
	private String username;
	
	@Column(name="passwd")
	private String passwd;
	
    public ComputerScience(){}
	public ComputerScience(String title) {
		this.title = title;
	  
	}


	public int getId() {
		return id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
