package Logic;

public class Products {
	
	
	private int productId;
	private String productName;
	private int stockType;
	private int itemsQty;
	private String status;
	private int aisle;
	private int bay;
	private int shelf;
	
	Products(int v_productId, String v_productName, int v_stockType, int v_itemsQty, String v_status, int v_aisle, int v_bay, int v_shelf)
	{
		this.productId = v_productId;
		this.productName = v_productName;
		this.stockType = v_stockType;
		this.itemsQty = v_itemsQty;
		this.status = v_status;
		this.aisle = v_aisle;
		this.bay = v_bay;
		this.shelf = v_shelf;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getStockType() {
		return stockType;
	}
	public void setStockType(int stockType) {
		this.stockType = stockType;
	}
	public int getItemsQty() {
		return itemsQty;
	}
	public void setItemsQty(int itemsQty) {
		this.itemsQty = itemsQty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public int getAisle() {
		return aisle;
	}


	public void setAisle(int aisle) {
		this.aisle = aisle;
	}


	public int getBay() {
		return bay;
	}


	public void setBay(int bay) {
		this.bay = bay;
	}


	public int getShelf() {
		return shelf;
	}


	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	
	
	
	
	
	

}
