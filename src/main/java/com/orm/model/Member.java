package com.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "member", schema = "webhard")
public class Member implements Serializable{
	
	@Id
	private String id;
	
	private String pw;
	
	public Member() {
		
	}
	//1. ȸ������, �α���, ȸ��Ż�� 
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	//ID�� ������ �ȵ�, PW�� ������ �� ����
	public String getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
}
