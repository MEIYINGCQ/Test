package com.cq.pojo;

public class User {
	private int uid;
	private String name;
	private String pass;
	private int age;
	private String sex;
	private String addr;
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", pass=" + pass + ", age=" + age + ", sex=" + sex + ", addr="
				+ addr + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
