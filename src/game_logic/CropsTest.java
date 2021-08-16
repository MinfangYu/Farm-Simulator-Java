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

class CropsTest {
	
	/** The crop. */
	private Crops crop;
	
	/** The farmer. */
	private Farmer farmer;
	
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
		crop = new Crops();
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
	 * Test method for {@link game_logic.Crops#waterCrops()}.
	 */
	@Test
	void testWaterCrops() {
		int compare = 0;
		crop.setHarvestDay(compare);
		crop.waterCrops();
		assertEquals(compare, crop.getHarvestDay());
		
		int compare1 = 3;
		crop.setHarvestDay(compare1);
		crop.waterCrops();
		assertEquals(compare1 - 1, crop.getHarvestDay());
	}

	/**
	 * Test method for {@link game_logic.Crops#normalFertilizer()}.
	 */
	@Test
	void testNormalFertilizer() {
		int compare = 1;
		crop.setHarvestDay(compare);
		crop.normalFertilizer();
		assertEquals(0, crop.getHarvestDay());
		
		int compare1 = 4;
		crop.setHarvestDay(compare1);
		crop.normalFertilizer();
		assertEquals(compare1 - 2, crop.getHarvestDay());
	}

	/**
	 * Test method for {@link game_logic.Crops#premiumFertilizer()}.
	 */
	@Test
	void testPremiumFertilizer() {
		int compare = 1;
		crop.setHarvestDay(compare);
		crop.premiumFertilizer();
		assertEquals(0, crop.getHarvestDay());
		
		int compare1 = 4;
		crop.setHarvestDay(compare1);
		crop.premiumFertilizer();
		assertEquals(compare1 - 3, crop.getHarvestDay());
	}

	/**
	 * Test method for {@link game_logic.Crops#superFertilizer()}.
	 */
	@Test
	void testSuperFertilizer() {
		int compare = 5;
		crop.setHarvestDay(compare);
		crop.superFertilizer();
		assertEquals(0, crop.getHarvestDay());
	}

	/**
	 * Test method for {@link game_logic.Crops#harvestCrops(int)}.
	 */
	@Test
	void testHarvestCrops() {
		farmer = new Farmer();
		farm = new Farm();
		int sellPrice = 10;
		crop.setSellPrice(sellPrice);
		int quantity = 5;
		crop.setQuantity(quantity);

		if(farmer.getSkill() == 0 && farm.getType() != 2) {
			double money1 = crop.getSellPrice() * crop.getQuantity() * 1.15;
			assertEquals(money1, crop.harvestCrops(quantity));
		}
		else if(farmer.getSkill() == 0 && farm.getType() == 2) {
			double money2 = crop.getSellPrice() * crop.getQuantity() * 2 * 1.15;
			assertEquals(money2, crop.harvestCrops(quantity));
		}
		else if(farmer.getSkill() != 0 && farm.getType() == 2) {
			double money3 = crop.getSellPrice() * crop.getQuantity() * 2;
			assertEquals(money3, crop.harvestCrops(quantity));
		}
		else if(farmer.getSkill() != 0 && farm.getType() != 2){
			double money4 = crop.getSellPrice() * crop.getQuantity();
			assertEquals(money4, crop.harvestCrops(quantity));
		}
	}

}
