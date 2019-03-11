import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class readjson {

	
	// Java program to read JSON from a file 

	
	
		public static void main(String[] args) throws Exception 
		{ 
			// parsing file "JSONExample.json" 
			Object obj = new JSONParser().parse(new FileReader("C:\\Users\\uday_madupathi\\eclipse-workspace\\Readjson\\src\\sample.json")); 
			
			// typecasting obj to JSONObject 
			JSONObject jo = (JSONObject) obj; 
			
			// getting firstName and lastName 
			/*int  number =  (int) jo.get("number"); 
			 
			
			System.out.println(number); 
			*/
			
			
			// getting address 
			Map category = ((Map)jo.get("category")); 
			
			// iterating address Map 
			Iterator<Map.Entry> itr1 = category.entrySet().iterator(); 
			while (itr1.hasNext()) { 
				Map.Entry pair = itr1.next(); 
				System.out.println(pair.getKey() + " : " + pair.getValue()); 
			} 
			
			String name = (String) jo.get("name"); 
	        System.out.println(name); 
				} 
			}

