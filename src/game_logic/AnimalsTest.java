/*
 * 
 */
package game_logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

// TODO: Test the Animal class
/**
 * The Class AnimalsTest.
 */
class AnimalsTest {
	
	/** The animal. */
	private Animals animal;
	
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
		animal = new Animals();
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
	 * Test set bonus.
	 */
	@Test
	void testSetBonus() {
		double bonus = 9.88;
		animal.setBonus(bonus);
		assertEquals(animal.getBonus(), bonus);
	}

	/**
	 * Test get bonus.
	 */
	@Test
	void testGetBonus() {
		double compare = 9.98;
		animal.setBonus(compare);
		double result = animal.getBonus();
		assertEquals(compare, result);
	}

	/**
	 * Test set quantity.
	 */
	@Test
	void testSetQuantity() {
		int quantity = 10;
		animal.setQuantity(quantity);
		assertEquals(animal.getQuantity(), quantity);
	}

	/**
	 * Test get quantity.
	 */
	@Test
	void testGetQuantity() {
		int compare = 100;
		animal.setQuantity(compare);
		int result = animal.getQuantity();
		assertEquals(compare, result);
	}

	/**
	 * Test set type.
	 */
	@Test
	void testSetType() {
		String type = "new type";
		animal.setType(type);
		assertEquals(animal.getType(), type);
	}

	/**
	 * Test get type.
	 */
	@Test
	void testGetType() {
		String compare = "another type";
		animal.setType(compare);
		String result = animal.getType();
		assertEquals(compare, result);
	}

	/**
	 * Test set purchase price.
	 */
	@Test
	void testSetPurchasePrice() {
		int purchasePrice = 9;
		animal.setPurchasePrice(purchasePrice);
		assertEquals(animal.getPurchasePrice(), purchasePrice);
	}

	/**
	 * Test get purchase price.
	 */
	@Test
	void testGetPurchasePrice() {
		int compare = 99;
		animal.setPurchasePrice(compare);
		int result = animal.getPurchasePrice();
		assertEquals(compare, result);
	}

	/**
	 * Test set health.
	 */
	@Test
	void testSetHealth() {
		int health = 8;
		animal.setHealth(health);
		assertEquals(animal.getHealth(), health);
	}

	/**
	 * Test get health.
	 */
	@Test
	void testGetHealth() {
		int compare = 88;
		animal.setHealth(compare);
		int result = animal.getHealth();
		assertEquals(compare, result);
	}

	/**
	 * Test set happiness.
	 */
	@Test
	void testSetHappiness() {
		double happiness = 7.5;
		animal.setHappiness(happiness);
		assertEquals(animal.getHappiness(), happiness);
	}

	/**
	 * Test get happiness.
	 */
	@Test
	void testGetHappiness() {
		double compare = 77.7;
		animal.setHappiness(compare);
		double result = animal.getHappiness();
		assertEquals(compare, result);
	}

	/**
	 * Test set earned.
	 */
	@Test
	void testSetEarned() {
		int earned = 6;
		animal.setEarned(earned);
		assertEquals(animal.getEarned(), earned);
	}

	/**
	 * Test get earned.
	 */
	@Test
	void testGetEarned() {
		int compare = 66;
		animal.setEarned(compare);
		int result = animal.getEarned();
		assertEquals(compare, result);
	}

	/**
	 * Test normal food.
	 */
	@Test
	void testNormalFood() {
		animal.setHealth(0);
		animal.normalFood();
		int health = animal.getHealth();
		assertEquals(5, health);
		
		animal.setHealth(99);
		animal.normalFood();
		int health1 = animal.getHealth();
		assertEquals(100, health1);
	}

	/**
	 * Test premium food.
	 */
	@Test
	void testPremiumFood() {
		animal.setHealth(90);
		animal.premiumFood();
		int health = animal.getHealth();
		assertEquals(100, health);
		
		animal.setHealth(10);
		animal.premiumFood();
		int health1 = animal.getHealth();
		assertEquals(25, health1);
	}

	/**
	 * Test magic food.
	 */
	@Test
	void testMagicFood() {
		animal.setHealth(9);
		animal.magicFood();
		int health = animal.getHealth();
		assertEquals(100, health);
	}

	/**
	 * Test play animals.
	 */
	@Test
	void testPlayAnimals() {
		farmer = new Farmer();
		farm = new Farm();
		animal.setHappiness(10);
		animal.playAnimals();
		double happiness = animal.getHappiness();
		if(farmer.getSkill() == 1) {
			assertEquals(20, happiness);
		}
		if(farm.getType() == 1){
			assertEquals(20, happiness);
		}
		if(farmer.getSkill() != 1 && farm.getType() != 1) {
			assertEquals(15, happiness);
		}
		
		animal.setHappiness(99);
		animal.playAnimals();
		double happiness1 = animal.getHappiness();
		if(farmer.getSkill() == 1) {
			assertEquals(100, happiness1);
		}
		if(farm.getType() == 1){
			assertEquals(100, happiness1);
		}
		if(farmer.getSkill() != 1 && farm.getType() != 1) {
			assertEquals(100, happiness1);
		}
	}

	/**
	 * Test happiness up.
	 */
	@Test
	void testHappinessUp() {
		animal.setHappiness(30);
		animal.happinessUp();
		double happiness = animal.getHappiness();
		assertEquals(32, happiness);
		
		animal.setHappiness(99);
		animal.happinessUp();
		double happiness1 = animal.getHappiness();
		assertEquals(100, happiness1);
	}

	/**
	 * Test happiness down.
	 */
	@Test
	void testHappinessDown() {
		animal.setHappiness(1);
		animal.happinessDown();
		double happiness = animal.getHappiness();
		assertEquals(0, happiness);
		
		animal.setHappiness(5);
		animal.happinessDown();
		double happiness1 = animal.getHappiness();
		assertEquals(3, happiness1);
	}

	/**
	 * Test animal bonus.
	 */
	@Test
	void testAnimalBonus() {
		animal.setHealth(70);
		animal.setHappiness(10);
		animal.setEarned(10);
		animal.animalBonus();
		double bonus = animal.getBonus();
		assertEquals(22 , bonus);
		
		animal.setHealth(90);
		animal.setHappiness(10);
		animal.setEarned(10);
		animal.animalBonus();
		double bonus1 = animal.getBonus();
		assertEquals(33 , bonus1);
		
		animal.setHealth(40);
		animal.setHappiness(10);
		animal.setEarned(10);
		animal.animalBonus();
		double bonus2 = animal.getBonus();
		assertEquals(11 , bonus2);
		
		animal.setHealth(10);
		animal.setHappiness(10);
		animal.setEarned(10);
		animal.animalBonus();
		double bonus3 = animal.getBonus();
		assertEquals(5.5 , bonus3);

	}

}