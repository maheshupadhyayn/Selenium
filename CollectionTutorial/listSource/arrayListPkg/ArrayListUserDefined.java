package arrayListPkg;

import java.util.ArrayList;
import java.util.Iterator;

class AutomationTool{
	int toolID;
	String toolName;
	int toolCost;
	public AutomationTool(int id, String name, int cost){
		toolID = id;
		toolName = name;
		toolCost = cost;
	}
}

public class ArrayListUserDefined {
	/*
	 * This class to demonstrate user defined class object usage in arraylist
	 */
	public static void main(String[] args) {
		//creating user defined class objects
		AutomationTool selenium = new AutomationTool(100, "SELENIUM", 1000);
		AutomationTool soapUI = new AutomationTool(200, "SOAPUI", 5000);
		AutomationTool qtp = new AutomationTool(300, "QTP", 9000);
		//creating arraylist of type class AutomationTool
		ArrayList<AutomationTool> toolList = new ArrayList<AutomationTool>();
		toolList.add(selenium); //adding class instance/object to list
		toolList.add(qtp);
		toolList.add(soapUI);
		
		System.out.println("Printing with Iterator");
		Iterator<AutomationTool> itr = toolList.iterator();
		
		while(itr.hasNext()){
			//typecast iterator next element to class object to access data members
			AutomationTool toolInstance = (AutomationTool)itr.next();
			System.out.println(toolInstance.toolID+ "  "+ toolInstance.toolName+"  "+toolInstance.toolCost);
		}
		
		//another way to traverse object in list
		System.out.println("Printing with for each");
		for(AutomationTool tool:toolList){
			System.out.println(tool.toolID+ "  "+ tool.toolName+"  "+tool.toolCost);
		}
	}
}
