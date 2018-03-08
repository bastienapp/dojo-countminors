import junit.framework.*;
import org.junit.Test;

public class CountMinorsTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testMinor1() throws Exception {
        int[] tabTest = new int[]{1, 28, 12, 50, 13};
		assertEquals(3, CountMinors.countWhile(tabTest));
	}

	@Test
	public void testMinorEmpty() throws Exception {
        int[] tabTest = new int[]{};
		assertEquals(0, CountMinors.countWhile(tabTest));
	}
}
