package bean;

public class IncomingData implements java.io.Serializable{

	private int incomingNumber; //出荷番号
	private String productCode; //商品コード
	private String supplierCode; //仕入先コード
	private String warehouseCode; //倉庫コード
	private String incomingDate; //入荷日
	private String personName; //担当者名
	private int volume; //数量
	private int price; //単価

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
		this.incomingNumber = incomingNumber;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public void setIncomingDate(String incomingDate) {
		this.incomingDate = incomingDate;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
