package bean;

public class WarehouseMaster implements java.io.Serializable{
    private String warehouseCode; //倉庫コード
    private String warehouseName; //倉庫名
    private String zipCode; //郵便番号
    private String state; //都道府県
    private String address; //住所

    public String getWarehouseCode() {
        return warehouseCode;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getState() {
        return state;
    }
    public String getAddress() {
        return address;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}