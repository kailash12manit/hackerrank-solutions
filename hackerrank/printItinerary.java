package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class printItinerary {
	
	public static void main(String[] args)
    {
        Map<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");
 
        for(Map.Entry m: dataSet.entrySet()){
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        
        System.out.println();
        
        printResult(dataSet);
    }

	private static void printResult(Map<String, String> dataSet) {
		// TODO Auto-generated method stub
		 Map<String, String> reversemap = new HashMap<String, String>();
		
		 for(Map.Entry<String,String> entry: dataSet.entrySet()){
			reversemap.put(entry.getValue(),entry.getKey());
		 }
		 
		 String start = null;
		 for(Map.Entry<String,String> entry: dataSet.entrySet()){
				if(! reversemap.containsKey(entry.getKey())){
					start=entry.getKey();
					break;
				}
		 }
		 
		 if (start == null)
	     {
	           System.out.println("Invalid Input");
	           return;
	     }
		 String to= dataSet.get(start);
		 while (to != null)
	     {
	            System.out.println(start +  "->" + to + ", ");
	            start = to;
	            to = dataSet.get(to);
	      }
	}
}
