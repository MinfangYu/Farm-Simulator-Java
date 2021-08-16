/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Chicken extends Animals{

	public Chicken() {
		super("Chicken", 30, 40, 0, 5);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Chicken:"+ getQuantity() +"    Health:" + getHealth() + "    Happiness:" + getHappiness();
	}
}
