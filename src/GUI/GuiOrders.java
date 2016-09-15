package GUI;
import java.util.ArrayList;

import Logic.CustomerOrder;
import Logic.GuiOrdersLogic;


public class GuiOrders extends GuiOrdersLogic{
	

	static ArrayList<CustomerOrder> custOrdersList = new ArrayList();
	static GuiOrders gO = new GuiOrders();
	
	public static void main(String args[])
	{
		
		//Build gui screen
		
		//Read in all customer orders from the database into a customer orders array.
		gO.buildOrdersArray("d");
		
		
		//Bind customer order to grid.
		
		
		
		
		//Read in all purchase orders from the database into a purchase orders array.
		
		//Bind purchase order to grid.
		
		
		
		gO.updateOrderStatus("d", 3);
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
}
