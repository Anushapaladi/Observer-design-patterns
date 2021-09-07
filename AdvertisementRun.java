package com.anusha.assignment;

public class AdvertisementRun {
	public static void main(String[] args) {
		Designer designer = new Designer("Anusha", "Sale");

		Buyer buyer1 = new Buyer("Jessy");
		Buyer buyer2 = new Buyer("Mike");
		Buyer buyer3 = new Buyer("Peter");
		Buyer buyer4 = new Buyer("Jocab");
		designer.addsaleBenefactor(buyer1);
		designer.addsaleBenefactor(buyer2);
		designer.addsaleBenefactor(buyer3);
		designer.addsaleBenefactor(buyer4);

		designer.informsaleBenefactors(" You have a new Festive Sale  2021!");
	}
}
