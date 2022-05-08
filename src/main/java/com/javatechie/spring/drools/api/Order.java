package com.javatechie.spring.drools.api;

public class Order {

	private String name;
	private String cardType;
	private int discount;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {

		int dis=price-(price/discount);
		return "Hi :" + name + "\n Your Are Using : " + cardType +" Bank Atm"+ "\n Congrulations You Got " + discount + " % Discount"+" \n Your Payable Amount is => " + dis + "\n Thanks For Shopping \n Have A Nice Day ";
	}

}