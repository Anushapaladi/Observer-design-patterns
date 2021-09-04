package anusha.observer.pattern;

public class buyer implements Advertisement {

	private String buyerName;

	public buyer(String buyerName) {
		super();
		this.buyerName = buyerName;
	}

	public String getbuyerName() {
		return buyerName;
	}

	public void setbuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public void notification(String buyerName, String designer, String sale, String message) {
		System.out.println("buyer Name:: " + buyerName);
		System.out.println("designer Name:: " + designer);
		System.out.println("Course:: " + sale);
		System.out.println("Message:: " + message + "\n");
	}
}