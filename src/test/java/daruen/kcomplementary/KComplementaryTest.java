package daruen.kcomplementary;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for KComplementary.
 */
public class KComplementaryTest {

	@Test
	public void shouldBeEquals() {
		Assert.assertEquals(new Pair(1, 2), new Pair(2, 1));

	}

	@Test
	public void setShouldHaveJustOnePair() {
		Set<Pair> pairs = new HashSet<Pair>();
		pairs.add(new Pair(1, 2));
		pairs.add(new Pair(2, 1));

		Assert.assertEquals(1, pairs.size());
	}

	@Test
	public void shouldGetOnePair() {
		Integer k = 3;
		Integer[] array = { 1, 2 };

		Set<Pair> pairs = new HashSet<Pair>();
		pairs.add(new Pair(1, 2));

		Set<Pair> kcomplementaryPairs = KComplementary.kComplementaryPairs(k, array);

		Assert.assertEquals(pairs, kcomplementaryPairs);
	}
	
	@Test
	public void shouldGetTwoPairs() {
		Integer k = 3;
		Integer[] array = { 1, 2,5,-2 };

		Set<Pair> pairs = new HashSet<Pair>();
		pairs.add(new Pair(1, 2));
		pairs.add(new Pair(-2, 5));

		Set<Pair> kcomplementaryPairs = KComplementary.kComplementaryPairs(k, array);

		Assert.assertEquals(pairs, kcomplementaryPairs);
	}

	@Test(expected = RuntimeException.class)
	public void shouldNotAcceptArrayOf1Number() {

		Integer k = 3;
		Integer[] array = { 1 };

		Set<Pair> pairs = new HashSet<Pair>();
		pairs.add(new Pair(1, 2));

		Set<Pair> kcomplementaryPairs = KComplementary.kComplementaryPairs(k, array);

	}

}
