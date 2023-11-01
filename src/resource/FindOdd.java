package resource;

import java.util.HashMap;

public class FindOdd {
	public int getNumberFromOddOccurrence(int[] input) {
		HashMap<Integer, Integer> ocurrenceMap = new HashMap<>();
		
		for (int number : input) {					
			Integer occurence = ocurrenceMap.get(number);
			
			if (occurence == null) {
				ocurrenceMap.put(number, 1);
			} else {
				ocurrenceMap.put(number, occurence + 1);
			}
		}
		
		int oddOccurenceNumber = -1;
		for (int number : ocurrenceMap.keySet()) {
			int occurence = ocurrenceMap.get(number);
			if (occurence % 2 != 0) {
				oddOccurenceNumber = number;
			}
		}

		return oddOccurenceNumber;
	}
}
