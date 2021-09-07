package com.anusha.assignment;

public class Buyer implements Advertisement {

	private String BuyerName;

	public Buyer(String BuyerName) {
		super();
		this.BuyerName = BuyerName;
	}

	public String getBuyerName() {
		return BuyerName;
	}

	public void setBuyerName(String BuyerName) {
		this.BuyerName = BuyerName;
	}

	public void notification(String BuyerName, String designer, String sale, String message) {
		System.out.println("Buyer Name:: " + BuyerName);
		System.out.println("Designer Name:: " + designer);
		System.out.println("Course:: " + sale);
		System.out.println("Message:: " + message + "\n");
	}

}
