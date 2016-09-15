import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Logic.CustomerOrder;
import Logic.GuiOrdersLogic;


public class GuiOrdersLogicTest {

	@Test
	public void testBuildOrdersArray() {
		fail("Not yet implemented");
		
		ArrayList<CustomerOrder> tmpArrList = new ArrayList();
		assertEquals(0, tmpArrList.size());		
		GuiOrdersLogic gO = new GuiOrdersLogic();
		gO.buildOrdersArray("");
		tmpArrList.addAll(gO.getCustOrderList());
		
		//assertTrue("The arraylist length should not be 0", gO.buildOrdersArray("s"))
		
		
	}

	
	
	
	
}
