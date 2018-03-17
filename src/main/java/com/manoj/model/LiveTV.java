
package com.manoj.model;

import javax.persistence.*;

@Entity
@Table(name="livetv")
public class LiveTV {
	
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
	@Column(name="user")
	private String user;
	@Column(name="passwd")
	private String passwd;

	
	public String getLinks() {
		return links;
	}
	
	public void setLinks(String links) {
		this.links = links;
	}
	public LiveTV(){}
	public LiveTV(String title){
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
