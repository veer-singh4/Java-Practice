package com.sa.entity;

public class User {
private long userId;
private String userName;
private int age;

public User() {
	super();
}
public User(long userId, String unserName, int age) {
	super();
	this.userId = userId;
	this.userName = unserName;
	this.age = age;
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
