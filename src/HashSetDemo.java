import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(1);
		h.add("two");
		h.add(3);
		h.add(1);
		h.add("three");
		h.add("two");
		
		System.out.println(h);

	}

}
