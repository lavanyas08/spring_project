package com.example.laptopDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
@Id
private int sNo;
private String Brand;
private String Processor;
private String Core;
private String RAM;
private String DisplaySize;
private String Gen;
private String BatteryLife;
private String Warrenty;
private String Price;
private String Discounts;
private String Reviews;

public int getSno() {
	return sNo;
}
public void setSno(int sNo) {
	this.sNo = sNo;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public String getProcessor() {
	return Processor;
}
public void setProcessor(String processor) {
	Processor = processor;
}
public String getCore() {
	return Core;
}
public void setCore(String core) {
	Core = core;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String ram) {
	RAM = ram;
}
public String getDisplay() {
	return DisplaySize;
}
public void setDisplay(String displaySize) {
	DisplaySize = displaySize;
}
public String getGen() {
	return Gen;
}
public void setGen(String gen) {
	Gen = gen;
}
public String getBatteryLife() {
	return BatteryLife;
}
public void setBatteryLife(String batteryLife) {
	BatteryLife = batteryLife;
}
public String getWarrenty() {
	return Warrenty;
}
public void setWarrenty(String warrenty) {
	Warrenty = warrenty;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getDiscounts() {
	return Discounts;
}
public void setDiscounts(String discounts) {
	Discounts = discounts;
}
public String getReviews() {
	return Reviews;
}
public void setReviews(String reviews) {
	Reviews = reviews;
}


}
