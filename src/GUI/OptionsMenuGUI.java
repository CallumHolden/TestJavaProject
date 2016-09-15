package GUI;
import static java.lang.System.out;
import java.util.*;


public class OptionsMenuGUI {
	
	
	
	public static void main(String agrs[])
	{		
		
		OptionsMenuGUI options = new OptionsMenuGUI();
		
		//Prompt them to choose
		out.println("What would you like to view?");
		out.println("1: Products");
		out.println("2: Orders");
		out.println("3: Purchase Orders");
		
		Scanner userInput = new Scanner(System.in);
		int uI = userInput.nextInt();
		
		switch(uI){
			case 1: options.productsSelected();
					break;
			case 2 : options.orderSelected();
					break;
			case 3: options.purchaseOrderSelected();
					break;
		
		}
		
		
	}
	
	
	void productsSelected()
	{
		//Call the Products gui		
	}
	
	void orderSelected()
	{
		//Call the Orders gui
		GuiOrders ordersGUI = new GuiOrders();		
	}
	
	void purchaseOrderSelected()
	{
		//Call the purchase orders gui
	}
	
	

}
