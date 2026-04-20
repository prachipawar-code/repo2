import java.util.HashSet;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("Delhi","Capital of India");
		h.put("Jaipur", "Pink city of India");
		h.put("Mumbai", "Filmcity of India");
		
		
		System.out.println(h);
		
		String cty="Mumbai";
		if(h.containsKey(cty))
		{
			String info=(String)h.get(cty);
			System.out.println(info);
		}
		else
			System.out.println("Not found ");

	}

}
