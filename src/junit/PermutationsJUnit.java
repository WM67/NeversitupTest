package junit;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import resource.Permutations;

public class PermutationsJUnit {
	@Test
	public void test() {
		Permutations permutations = new Permutations();
		assertTestCase(permutations, "a", new String[] { "a" });
		assertTestCase(permutations, "ab", new String[] { "ab", "ba" });
		assertTestCase(permutations, "abc", new String[] { "abc", "acb", "bac", "bca", "cab", "cba" });
		assertTestCase(permutations, "aabb", new String[] { "aabb", "abab", "abba", "baab", "baba", "bbaa" });
	}

	private void assertTestCase(Permutations permutations, String input, String[] expectArray) {
		List<String> permutationList = permutations.getPermutations(input);
		assertArrayEquals(expectArray, permutationList.toArray());
	}
}
