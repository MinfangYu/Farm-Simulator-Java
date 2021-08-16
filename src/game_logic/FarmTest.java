/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FarmTest {
	
	/** The farm. */
	private Farm farm;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		farm = new Farm();
	}
	

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	

	/**
	 * Test method for {@link game_logic.Farm#tendLand()}.
	 */
	@Test
	void testTendLand() {
		int tidy = 50;
		farm.setTidy(tidy);
		farm.tendLand();
		int result = farm.getTidy();
		assertEquals(60, result);
	}

}
