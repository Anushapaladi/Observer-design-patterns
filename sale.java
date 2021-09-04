package anusha.observer.pattern;

public interface sale {
	public void addsalebenefactor(buyer buyer);

	public void removesalebenefactor(buyer buyer);

	public void notifysalebenefactor(String message);
}