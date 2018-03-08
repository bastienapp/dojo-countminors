import junit.framework.*;
import org.junit.Test;

public class CountMinorsTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		int[] ages = new int[]{12};
		assertEquals(1, CountMinors.minors(ages));
	}

	@Test
	public void test2() throws Exception {
		int[] ages = new int[]{23};
		assertEquals(0, CountMinors.minors(ages));
	}

	@Test
	public void test3() throws Exception {
		int[] ages = new int[]{5, 43, 8, 13, 18, 98, 16};
		assertEquals(4, CountMinors.minors(ages));
	}
}
