package com.pb.domain;

import java.util.Date;

public class User {
	int userId;
	String lgName;
	String lgPass;
	int sex;
	String nickName;
	String headName;
	Date registerTime;
	
	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLgName() {
		return lgName;
	}

	public void setLgName(String lgName) {
		this.lgName = lgName;
	}

	public String getLgPass() {
		return lgPass;
	}

	public void setLgPass(String lgPass) {
		this.lgPass = lgPass;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	
	
	public User(int userId, String lgName, String lgPass, int sex, String nickName, String headName,
			Date registerTime) {
		super();
		this.userId = userId;
		this.lgName = lgName;
		this.lgPass = lgPass;
		this.sex = sex;
		this.nickName = nickName;
		this.headName = headName;
		this.registerTime = registerTime;
	}
	
	public User( String lgName, String lgPass, int sex, String nickName, String headName
			) {
		super();
		
		this.lgName = lgName;
		this.lgPass = lgPass;
		this.sex = sex;
		this.nickName = nickName;
		this.headName = headName;
		
		
	}
	

}
