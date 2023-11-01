package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import resource.SmileyFaces;

public class SmileyFacesJUnit {
	@Test
	public void test() {
		SmileyFaces smileyFaces = new SmileyFaces();
		assertEquals(2, smileyFaces.countSmileyFaces(new String[] { ":)", ";(", ";}", ":-D" }));
		assertEquals(3, smileyFaces.countSmileyFaces(new String[] { ";D", ":-(", ":-)", ";~)" }));
		assertEquals(1, smileyFaces.countSmileyFaces(new String[] { ";]", ":[", ";*", ":$", ";-D" }));
		assertEquals(0, smileyFaces.countSmileyFaces(new String[] {}));
	}
}
