package com.example.Entity;

public class Product {
public Product(String name, int price, String about) {
		this.name = name;
		this.price = price;
		About = about;
	}
public Product() {
	// TODO Auto-generated constructor stub
}
private String name;
private int price;
private String About;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAbout() {
	return About;
}
public void setAbout(String about) {
	About = about;
}
}
