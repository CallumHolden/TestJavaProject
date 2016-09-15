package Logic;
import java.util.ArrayList;



interface SystemControl {

	void updateOrderStatus(String status, int itemId);
	void updateStockLevels(ArrayList orderProducts);
	void alertAccounts(int orderId, String content);
	void buildOrdersArray(String sqlStatement);
	
}
