package com.example.empservice;

public class ebean {
public String ename;
public Integer eage;
public String ecity;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

public Integer getEage() {
	return eage;
}
public void setEage(Integer eage) {
	this.eage = eage;
}
public String getEcity() {
	return ecity;
}
public void setEcity(String ecity) {
	this.ecity = ecity;
}
public ebean(String ename, Integer eage, String ecity) {
	super();
	this.ename = ename;
	this.eage = eage;
	this.ecity = ecity;
}

}
