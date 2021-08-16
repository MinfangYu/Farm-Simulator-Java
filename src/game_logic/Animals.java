/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

/**
 * The Class Animals.
 */
public class Animals {
	
	/** The type. */
	private String type;
	
	/** The purchase price. */
	private int purchasePrice;
	
	/** The earned. */
	private int earned;
	
	/** The health. */
	private int health;
	
	/** The happiness. */
	private double happiness;
	
	/** The quantity. */
	private int quantity;
	
	/** The bonus. */
	private double bonus;
	
	/** The farmer. */
	private Farmer farmer = new Farmer();
	
	/** The farm. */
	private Farm farm = new Farm();
	
	/**
	 * Instantiates a new animals.
	 *
	 * @param type the type
	 * @param purchasePrice the purchase price
	 * @param health the health
	 * @param happiness the happiness
	 * @param earned the earned
	 */
	public Animals(String type, int purchasePrice, int health, int happiness,  int earned) {
		this.type = type;
		this.purchasePrice = purchasePrice;
		this.earned = earned;
		this.health = health;
		this.happiness = happiness;
	}
	
	/**
	 * Instantiates a new animals.
	 */
	public Animals() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Sets the bonus.
	 *
	 * @param bonus the new bonus
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	/**
	 * Gets the bonus.
	 *
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}
	
	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	} 
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	} 
	
	/**
	 * Sets the purchase price.
	 *
	 * @param purchasePrice the new purchase price
	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	/**
	 * Gets the purchase price.
	 *
	 * @return the purchase price
	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}
	
	/**
	 * Sets the health.
	 *
	 * @param health the new health
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * Gets the health.
	 *
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * Sets the happiness.
	 *
	 * @param happiness the new happiness
	 */
	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}
	
	/**
	 * Gets the happiness.
	 *
	 * @return the happiness
	 */
	public double getHappiness() {
		return happiness;
	}
	
	/**
	 * Sets the earned.
	 *
	 * @param earned the new earned
	 */
	public void setEarned(int earned) {
		this.earned = earned;
	}
	
	/**
	 * Gets the earned.
	 *
	 * @return the earned
	 */
	public int getEarned() {
		return earned;
	}
	
	/**
	 * Normal food.
	 */
	public void normalFood() {
		health += 5;
		if(health  > 100) {
			health = 100;
		}
	}
	
	/**
	 * Premium food.
	 */
	public void premiumFood() {
		health += 15;
		if(health  > 100) {
			health = 100;
		}
	}
	
	/**
	 * Magic food.
	 */
	public void magicFood() {
		health = 100;
	}
	
	/**
	 * Play animals.
	 */
	public void playAnimals() {
		if(farmer.getSkill() == 1) {
			happiness += 10;
		}
		if(farm.getType() == 1){
			happiness += 10;
		}
		if(farmer.getSkill() != 1 && farm.getType() != 1) {
			happiness += 5;
		}
		if(happiness > 100) {
			happiness = 100;
		}		
	}
	
	/**
	 * Happiness up.
	 */
	public void happinessUp() {
		happiness += 2;
		if(happiness > 100) {
			happiness = 100;
		}
	}
	
	/**
	 * Happiness down.
	 */
	public void happinessDown() {
		happiness -= 2;
		if(happiness < 0) {
			happiness = 0;
		}
	}
	
	/**
	 * Animal bonus.
	 *
	 * @return the double bonus
	 */
	public double animalBonus() {
		double para =  1 + happiness / 100;
		if(health < 30) {
			bonus = earned * 0.5 * para;
		}
		else if(health >= 30 && health < 50) {
			bonus = earned * 1 * para;
		}
		else if(health >= 50 && health < 80) {
			bonus = earned * 2 * para;
		}
		else if(health > 80) {
			bonus = earned * 3 * para;
		}
		return bonus;
	}

}
