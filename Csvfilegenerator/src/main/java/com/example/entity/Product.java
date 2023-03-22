package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity

@NoArgsConstructor
@AllArgsConstructor
public class Product {
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_Id, String product_Name, int product_Price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
	}
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public int getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(int product_Price) {
		this.product_Price = product_Price;
	}
	@Id
private int product_Id;
private String product_Name;
private int product_Price;
}
