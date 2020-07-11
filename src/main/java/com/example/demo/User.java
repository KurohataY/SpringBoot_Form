package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
//エンティティクラス（データを永続）
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  
  private int id;
  private String name;
  private String mail;
  private String message;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
	  
  public void setName(String name) {
    this.name = name;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }
  
  public String getMessage() {
    return message;
  }

	public void setMessage(String message) {
	  this.message = message;
	}
}
