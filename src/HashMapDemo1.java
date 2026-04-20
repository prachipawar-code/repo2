import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<>();
		h.put("Tiger", 7);
		h.put("Simba", 5);
		h.put("Dora", 6);
		System.out.println(h);

		String nm="Dora";
		if(h.containsKey(nm))
		{
			int a = h.get(nm);
			System.out.println("Age is "+a);
		}
		else
			System.out.println("Not found");
	}

}
