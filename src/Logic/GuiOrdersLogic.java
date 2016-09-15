package Logic;
import static java.lang.System.out;

import java.util.ArrayList;




/**
 * This class will house all of the logic for the 'Orders' gui.
 * @author Administrator
 *
 */
public class GuiOrdersLogic implements SystemControl{

	private ArrayList<CustomerOrder> custOrderList;
	
		
	@Override
	public final void updateOrderStatus(String status, int orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStockLevels(ArrayList orderProducts) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void alertAccounts(int orderId, String content) {
		// TODO Auto-generated method stub
		
	}	
	
	
	/**
	 * This function will run a query against the database to pull down all customer orders
	 * and bind into an arraylist.
	 */
	@Override
	public void buildOrdersArray(String sqlStatement) {
		ArrayList<CustomerOrder> tmpCustOrderList = new ArrayList();
		//Run a query pulling down customer orders.
		
		
		setCustOrderList(tmpCustOrderList);		
	}
	
	
	
	public ArrayList<CustomerOrder> getCustOrderList() {
		return custOrderList;
	}

	public void setCustOrderList(ArrayList<CustomerOrder> custOrderList) {
		this.custOrderList = custOrderList;
	}

	public void despatchOrder(int orderId)
	{
		
	}

	
	
}
