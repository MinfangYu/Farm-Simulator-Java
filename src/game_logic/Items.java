/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Items {
	private String name;
	private int price;
	private int healthUp;
	private int daysUp;
	
	public Items(String name, int price, int healthUp, int daysUp ) {
		this.name = name;
		this.price = price;
		this.healthUp = healthUp;
		this.daysUp = daysUp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setHealthUp(int healthUp) {
		this.healthUp = healthUp;
	}
	public int getHealthUp() {
		return healthUp;
	}
	public void setDaysUp(int daysUp) {
		this.daysUp = daysUp;
	}
	public int getDaysUp() {
		return daysUp;
	}
}
