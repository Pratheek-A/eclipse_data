package con.collection;
import java.util.*;
public class Mapclass {
public static void main(String[] args) {
	
	Map<Integer ,String> map = new HashMap<>();
	
	map.put(1, "Balaji");
	map.put(2, "Ram");
	map.put(3, "Seeta");
	map.put(4, "Ram");
	
	List<String> listvalues = new ArrayList<>();
	List<Integer> listkyes = new ArrayList<>();
	
	Set<String> set = new HashSet<>();
	
	for(Map.Entry<Integer, String> mm:map.entrySet()) {
		listvalues.add(mm.getValue());
		listkyes.add(mm.getKey());
		set.add(mm.getValue());
	}
	System.out.println(listkyes);
	System.out.println(listvalues);
	
	System.out.println(set);		
}
}
