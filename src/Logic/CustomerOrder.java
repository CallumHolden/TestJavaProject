package Logic;
import java.util.ArrayList;


public class CustomerOrder extends Order {

	
	private ArrayList<Products> orderProducts = new ArrayList<Products>();
	

	CustomerOrder(int v_orderId, status v_s) {
		super(v_orderId, v_s);	
		this.orderProducts = null;//Set this to null as the data will only be read in once an order is clicked to get more details.
	}


	public ArrayList<Products> getOrderProducts() {
		return orderProducts;
	}


	public void setOrderProducts(ArrayList<Products> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
	
	public boolean checkProductsPicked()
	{
		
		
		return true;
	}
	
	public void pickProduct(int productId)
	{
		
	}
	
	

}
