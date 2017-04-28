package by.epam.rentshopweb.bean.entity;

import java.math.BigDecimal;

public class ProductItem extends Product {

	private int productItemID;
	private int manufacturingYear;
	private String itemNote;
	private int status;
	private int wearRate;
	private BigDecimal pricePerDay;
	private BigDecimal rentAmount;
	private String clientName;
	private int rentPeriod;

	public ProductItem() {

	}

	public ProductItem(int productID, int productCategoryID, String name, BigDecimal productBasePrice, int quantity,
			int availableQuantity, int productItemID, int manufacturingYear, String itemNote, int status,
			int wearRate) {

		super(productID, productCategoryID, name, productBasePrice, quantity, availableQuantity);

		this.productItemID = productItemID;
		this.manufacturingYear = manufacturingYear;
		this.itemNote = itemNote;
		this.status = status;
		this.wearRate = wearRate;

	}

	public int getRentPeriod() {
		return rentPeriod;
	}

	public void setRentPeriod(int rentPeriod) {
		this.rentPeriod = rentPeriod;
	}

	public void showProductItem() {

		System.out.println("ProductItemID: " + this.productItemID);
		System.out.println("ProductID: " + this.getProductID());
		System.out.println("Name: " + this.getName());
		System.out.println("AvailableQuantity: " + this.getAvailableQuantity());
		System.out.println("ProductBasePrice: " + this.getProductBasePrice());
		System.out.println("ManufacturingYear: " + this.manufacturingYear);
		System.out.println("ItemNote : " + this.itemNote);
		System.out.println("WearRate: " + this.wearRate);
		System.out.println("Status: " + this.status);

		System.out.println();

	}

	public int getProductItemID() {
		return productItemID;
	}

	public void setProductItemID(int productItemID) {
		this.productItemID = productItemID;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public String getItemNote() {
		return itemNote;
	}

	public void setItemNote(String itemNote) {
		this.itemNote = itemNote;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getWearRate() {
		return wearRate;
	}

	public void setWearRate(int wearRate) {
		this.wearRate = wearRate;
	}

	public BigDecimal getPricePerDay() {
		return pricePerDay.setScale(2, BigDecimal.ROUND_UP);
		// setScale(2, BigDecimal.ROUND_UP);
	}

	public void setPricePerDay(BigDecimal pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BigDecimal getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(BigDecimal rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((itemNote == null) ? 0 : itemNote.hashCode());
		result = prime * result + manufacturingYear;
		result = prime * result + ((pricePerDay == null) ? 0 : pricePerDay.hashCode());
		result = prime * result + productItemID;
		result = prime * result + ((rentAmount == null) ? 0 : rentAmount.hashCode());
		result = prime * result + rentPeriod;
		result = prime * result + status;
		result = prime * result + wearRate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductItem other = (ProductItem) obj;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (itemNote == null) {
			if (other.itemNote != null)
				return false;
		} else if (!itemNote.equals(other.itemNote))
			return false;
		if (manufacturingYear != other.manufacturingYear)
			return false;
		if (pricePerDay == null) {
			if (other.pricePerDay != null)
				return false;
		} else if (!pricePerDay.equals(other.pricePerDay))
			return false;
		if (productItemID != other.productItemID)
			return false;
		if (rentAmount == null) {
			if (other.rentAmount != null)
				return false;
		} else if (!rentAmount.equals(other.rentAmount))
			return false;
		if (rentPeriod != other.rentPeriod)
			return false;
		if (status != other.status)
			return false;
		if (wearRate != other.wearRate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductItem [productItemID=" + productItemID + ", manufacturingYear=" + manufacturingYear
				+ ", itemNote=" + itemNote + ", status=" + status + ", wearRate=" + wearRate + ", pricePerDay="
				+ pricePerDay + ", rentAmount=" + rentAmount + ", clientName=" + clientName + ", rentPeriod="
				+ rentPeriod + "]";
	}

}
