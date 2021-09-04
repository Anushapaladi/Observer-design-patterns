package anusha.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Designer implements Offer {
	private String DesignerName;
	private String sale;
	List<buyer> buyer = new ArrayList<>();

	public Designer(String DesignerName, String sale) {
		super();
		this.DesignerName = DesignerName;
		this.sale = sale;
	}

	public String getDesignerName() {
		return DesignerName;
	}

	public void setDesignerName(String DesignerName) {
		this.DesignerName = DesignerName;
	}

	public String getsale() {
		return sale;
	}

	public void setsale(String sale) {
		this.sale = sale;
	}

	public synchronized void addsaleSubcriber(buyer buyer) {
		buyer.add(buyer);
	}

	public synchronized void removesaleSubcriber(buyer buyer) {
		Buyer.remove(buyer);
	}

	public void notifysaleSubscribers(String message) {
		System.out.println("Designer Posted Message:: " + message + "\n");
		buyer.forEach(buyer -> buyer.notification(buyer.getbuyerName(), this.DesignerName, this.sale, message));
	}

	public void addsaleBenefactor(buyer buyer1) {
		// TODO Auto-generated method stub

	}

}