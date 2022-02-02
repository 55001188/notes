import java.util.ArrayList;

public class SortRunner {

	public static void main(String[] args) {
		//arrays
		int[] values = new int[1000];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = (int)(Math.random()*23049234);
		}
		
		insertionSort(values);
		selectionSort(values);
		
		
		//arrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int k = 0; k < 1000; k ++) {
			list.add((int)(Math.random()*23049234));
		}
		
		insertionSort(list);
		selectionSort(list);
 
	}
	
	//array
	public static void insertionSort(int[] elements) {
		int counter = 0;
		for (int j = 1; j < elements.length; j++) {
			int temp = elements[j];
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
				counter++;
			}
			elements[possibleIndex] = temp;
		}
		System.out.println("array insertion: " + counter);
	}
	
	//array lists
	public static void insertionSort(ArrayList<Integer> elements) {
		int counter = 0;
		int indexCount = 0;
		for(int i = 1; i < elements.size(); i++) {
			int temp = elements.get(i);
			int possibleIndex = i;
			while(possibleIndex > 0 && elements.get(possibleIndex) < elements.get(possibleIndex-1)) {
				indexCount ++;
				possibleIndex --;
				counter++;
			}
			
			elements.remove(possibleIndex);
			elements.add(possibleIndex - indexCount, temp);
		}
		System.out.println("ArrayList insertion: " + counter);
	}
	
	//array
	public static void selectionSort(int[] elements) {
		int counter = 0;
		for (int j = 0; j < elements.length - 1; j++) {
			int minIndex = j;
			for (int k = j + 1; k < elements.length; k++) {
				if (elements[k] < elements[minIndex]) {
					minIndex = k;
				}
				counter++;
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp;
		}
		System.out.println("array selection: " + counter);
	}
	
	//array list
	public static void selectionSort(ArrayList<Integer> elements) {
		int counter = 0;
		for(int i = 0; i < elements.size()-1; i ++) {
			int minIndex = i;
			for(int j = i + 1; j < elements.size(); j ++) {
				if(elements.get(j) < minIndex) {
					minIndex = j;
				}
				
				counter++;
			}
			int temp = elements.get(i);
			elements.set(i, elements.get(minIndex));
			elements.set(minIndex, temp);
		}
		
		System.out.println("ArrayList selesction: " + counter);
	}
}
