package Logic;
import java.util.ArrayList;


public class GuiPurchaseOrderLogic  implements SystemControl{
	
	
	private ArrayList<CustomerOrder> custOrderList;
	
	@Override
	public void updateOrderStatus(String status, int orderId) {
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

	@Override
	public void buildOrdersArray(String sqlStatement) {
		ArrayList<CustomerOrder> tmpCustOrderList = new ArrayList();
		
		
		
		setCustOrderList(tmpCustOrderList);		
	}

	public ArrayList<CustomerOrder> getCustOrderList() {
		return custOrderList;
	}

	public void setCustOrderList(ArrayList<CustomerOrder> custOrderList) {
		this.custOrderList = custOrderList;
	}
	
	

}
