package com.itheima.domain;

import java.io.Serializable;

public class User implements Serializable{
private Integer pid;
private String pname;
private double price;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "User [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}


}
