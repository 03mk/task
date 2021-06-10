//入荷bean

package bean;


public class Incoming implements java.io.Serializable {

	private int incomingNumber;
	private String productCode;
	private String supplierCode;
	private String warehouseCode;
	private String incomingDate;
	private String personName;
	private int volume;
	private int price;


	public int getIncomingNumber() {
		return incomingNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public String getIncomingDate() {
		return incomingDate;
	}

	public String getPersonName() {
		return personName;
	}

	public int getVolume() {
		return volume;
	}
	public int getPrice() {
		return price;
	}


	public void setIncomingNumber(int incomingNumber) {
		this.incomingNumber=incomingNumber;
	}

	public void setProductCode(String productCode) {
		this.productCode=productCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode =supplierCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode =warehouseCode;
	}

	public void setIncomingDate(String incomingDate) {
		this.incomingDate =incomingDate;
	}

	public void setPersonName(String personName) {
		this.personName =personName;
	}

	public void setVolume(int volume) {
		this.volume=volume;
	}
	public void setPrice(int price) {
		this.price=price;
	}


}
