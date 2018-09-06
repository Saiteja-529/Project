package com.teju.project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Authentication 
{
 
@Id	
private String userName;
  @Column
private String passWord;
  @Column
private int mobileNum;
  @Column
private String email;
  @Column
private int dob;
 
  @Column
private String address;
 
 @Column
 private String role;
 
 @Column
 private boolean enabled;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}

public int getMobileNum() {
	return mobileNum;
}

public void setMobileNum(int mobileNum) {
	this.mobileNum = mobileNum;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getDob() {
	return dob;
}

public void setDob(int dob) {
	this.dob = dob;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

}


 
  