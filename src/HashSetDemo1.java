import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(3);
		h.add(2);
		
		System.out.println(h);
		
		int x=2;
		
		if(h.contains(x))
			System.out.println("Found");
		else
			System.out.println("Not found");

	}

}
