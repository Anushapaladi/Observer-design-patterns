package anusha.observer.pattern;

public class advertisementpass {

	public static void main(String[] args) {
		Designer Designer = new Designer("Designer", "New sale");

		buyer buyer1 = new buyer("1");
		buyer buyer2 = new buyer("2");
		buyer buyer3 = new buyer("3");
		buyer buyer4 = new buyer("4");
		Designer.addsaleBenefactor(buyer1);
		Designer.addsaleBenefactor(buyer2);
		Designer.addsaleBenefactor(buyer3);
		Designer.addsaleBenefactor(buyer4);

		Designer.notifysaleBenefactors("You have a new Ganesh Chaturthi sale 2021!");
	}

}
