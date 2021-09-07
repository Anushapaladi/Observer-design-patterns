package com.anusha.assignment;

import java.util.ArrayList;
import java.util.List;

public class Designer implements Clearencesale {
	private String designerName;
	private String sale;
	List<Buyer> buyers = new ArrayList<>();

	public Designer(String designerName, String sale) {
		super();
		this.designerName = designerName;
		this.sale = sale;
	}

	public String getdesignerName() {
		return designerName;
	}

	public void setdesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getsale() {
		return sale;
	}

	public void setsale(String sale) {
		this.sale = sale;
	}

	public synchronized void addsaleBenefactor(Buyer buyer) {
		buyers.add(buyer);
	}

	public synchronized void removesaleBenefactor(Buyer buyer) {
		buyers.remove(buyer);
	}

	public void informsaleBenefactors(String message) {
		System.out.println("Meaasge Posted:: " + message + "\n");
		buyers.forEach(buyer -> buyer.notification(buyer.getBuyerName(), this.designerName, this.sale, message));
	}

}
