package resource;

import java.util.Arrays;
import java.util.List;

public class SmileyFaces {
	private static final List<String> eyesList = Arrays.asList(":", ";");
	private static final List<String> noseList = Arrays.asList("-", "~");
	private static final List<String> mouthList = Arrays.asList(")", "D");
	
	public int countSmileyFaces(String[] smileyFaceArray) {
		int count = 0;
		
		for (String smileyFace : smileyFaceArray) {
			int smileyLength = smileyFace.length();
			if (smileyLength < 2) {
				continue;
			}
			
			String eyes = smileyFace.substring(0, 1);
			String nose = null;
			String mouth = null;
			
			if (smileyLength == 2) {
				mouth = smileyFace.substring(1, 2);				
			} else {
				nose = smileyFace.substring(1, 2);
				mouth = smileyFace.substring(2, 3);				
			}
			
			boolean isValid = true;
			
			if (!eyesList.contains(eyes)) {
				isValid = false;
			}
			
			if (nose != null && !noseList.contains(nose)) {
				isValid = false;
			}
			
			if (!mouthList.contains(mouth)) {
				isValid = false;
			}
			
			if (isValid) {
				count++;
			}
		}
		
		return count;
	}
}
