package MapProject2;

public class Products {
	
	private int id;
	private String prodNm;
	private double prodPrice;
	public Products(int id, String prodNm, double price) {
		super();
		this.id = id;
		this.prodNm = prodNm;
		this.prodPrice = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", prodNm=" + prodNm + ", prodPrice=" + prodPrice + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdNm() {
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		this.prodNm = prodNm;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	

}
