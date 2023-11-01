package resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
	public List<String> getPermutations(String input) {		
		List<String> shufflingList = new ArrayList<>();
					
        recursiveShuffling("", input, shufflingList);  
		
        return shufflingList;
	}

    private void recursiveShuffling(String combined, String remain, List<String> shufflingList) {
        int strLength = remain.length();
        
        if (strLength == 0) {        	
        	if (!shufflingList.contains(combined)) {
        		shufflingList.add(combined);
        	}        	
        	return;
        }
        
        for (int index = 0; index < strLength; index++) {
        	String recursiveCombined = combined + remain.charAt(index);
        	String recursiveRemain = remain.substring(0, index) + remain.substring(index + 1, strLength);
        	        	
            recursiveShuffling(recursiveCombined, recursiveRemain, shufflingList);
        }
    }
}
