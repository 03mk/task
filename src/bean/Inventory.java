//在庫Bean

package bean;

public class Inventory implements java.io.Serializable {

	private int inventoryNumber;
	private String warehouseCode;
	private String productCode;
//	private String rotNumber;
//	private String productQuality;
	private int actualStock;
//	private int activeStock;

	public int getInventoryNumber() {
		return inventoryNumber;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public String getProductCode() {
		return productCode;
	}

//	public String getRotNumber() {
//		return rotNumber;
//	}
//	public String getProductQuality() {
//		return productQuality;
//	}

	public int getActualStock() {
		return actualStock;
	}

//	public int getActiveStock() {
//		return activeStock;
//	}

	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber=inventoryNumber;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode=warehouseCode;
	}
	public void setProductCode(String productCode) {
		this.productCode=productCode;
	}

//	public void setRotNumber(String rotNumber) {
//		this.rotNumber=rotNumber;
//	}

//	public void setProductQuality(String productQuality) {
//		this.productQuality = productQuality;
//	}

	public void setActualStock(int actualStock) {
		this.actualStock=actualStock;
	}

//	public void setActiveStock(int activeStock) {
//		this.activeStock=activeStock;
//	}
}
