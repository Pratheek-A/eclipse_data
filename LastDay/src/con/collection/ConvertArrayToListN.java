package con.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToListN {
public static void main(String[] args) {
		
			int arr[]= {1,2,3,4,5};
			
			List<Integer> list = new ArrayList<>();
			
			for(int i=0; i<arr.length; i++) {
				list.add(arr[i]);
			}
			System.out.println(list);
}
}
