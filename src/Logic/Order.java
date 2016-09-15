package Logic;

abstract class Order {
	
	private int orderId;
	enum status{
		Picked, Received, Delivered
	}
	
	status currStatus;
	
	//Constructor.
	Order(int v_orderId, status v_s){
		this.orderId = v_orderId;
		this.currStatus = v_s;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public status getCurrStatus() {
		return currStatus;
	}

	public void setCurrStatus(status currStatus) {
		this.currStatus = currStatus;
	}
	
	
	
	
	

}
