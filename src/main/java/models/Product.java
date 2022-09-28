package models;

public class Product {
	
	private int pno;
	private String pName;
	private double priceInEuro;
	private String imageFile;
	private String description;
	
	public Product(int pNo, String pName, double priceInEuro, String imageFile, String description) {
		super();
		this.pno = pNo;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
		this.description = description;
	}
	

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPriceInEuro() {
		return priceInEuro;
	}

	public void setPriceInEuro(double priceInEuro) {
		this.priceInEuro = priceInEuro;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pName=" + pName + ", priceInEuro=" + priceInEuro + ", imageFile=" + imageFile
				+ ", pDescription=" + description + "]";
	}
	
	
	
	
	

}
