import javax.xml.crypto.Data;

public class Main {
	
	/*public static String Integer (Data [] LinearSearch, Data target) {
		int [] LinearSearch = { 10,15,24,30,102};*/
	
	public static int binarySearch (int  values[] ,  int target) {
		int min = 0;
		int max = values.length -1;
		int mid = 0;
		
		while (min<= max) {
			mid = (min + max)/2;
			if(target < values[mid]) {
				max = mid -1;
			}else if (target < values [mid]) {
				min = mid +1;
				
			}else {
				return mid;
			}
	}
		return -1;
	}
	
	public static int linearSearch (int values [], int target) {
		int pos = -1;
		for (int i = 0; i < values.length; i++) {
			if (values[i]> target) {
				return -1;
			}
			
		}
		return pos;
	}
	
	public static void main(String[] args) {
		
		int [] values = {1,2,3,4,5,6,7,8,9,10,15,45,78,95,110,120};
		int linearSearch = 10;
		System.out.println(linearSearch(values,linearSearch));
		
		int binarySearch = 6;
		System.out.println(binarySearch(values,binarySearch));
		
		/*ArrayList<Integer> iList = new ArrayList<Integer>();

		System.out.println("Testing toString");
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing addFirst(i | 0 <= i < 10) + toString");
		for(int i=0; i<10; i++) {
			iList.addFirst(i);
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing add(0, 10) + toString");
		iList.add(0, 10);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing add(size(), -1) + toString");
		iList.add(iList.size(), -1);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing add(3, 20) + toString");
		iList.add(3, 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing add(5, 15) + toString");
		iList.add(5, 15);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing add(7, 13) + toString");
		iList.add(7, 13);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing add(9, 11) + toString");
		iList.add(9, 11);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing getFirst");
		System.out.println("First element: " + iList.getFirst());
		System.out.println();
		
		System.out.println("Testing getLast + toString");
		System.out.println("Last element: " + iList.getLast());
		System.out.println();
		
		System.out.println("Testing get(5) + toString");
		System.out.println("Element at index 5: " + iList.get(5));
		System.out.println();
		
		System.out.println("Testing set(8, 33) + toString");
		System.out.println("Element at index 8 before inserting 33: " + iList.set(8, 33));
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing clear + toString");
		iList.clear();
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing addLast(i | 0 <= i < 10) + toString");
		for(int i=0; i<10; i++) {
			iList.addLast(i);
			System.out.println(iList);
		}
		System.out.println();*/
		
		
			
		}
		
		
		
	}
}
