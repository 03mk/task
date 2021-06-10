package bean;

public class InventoryData implements java.io.Serializable{
    private String warehouseCode; //倉庫コード
    private String productCode; //商品コード
    private int actualStock; //実在個数
    private int activeStock; //有効在庫数

    public String getWarehouseCode() {
        return warehouseCode;
    }
    public String getProductCode() {
        return productCode;
    }
    public int getActualStock() {
        return actualStock;
    }
    public int getActiveStock() {
        return activeStock;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public void setActualStock(int actualStock) {
        this.actualStock = actualStock;
    }
    public void setActiveStock(int activeStock) {
        this.activeStock = activeStock;
    } 
}