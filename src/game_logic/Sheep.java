/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Sheep extends Animals{
	

	public Sheep() {
		super("Sheep", 150, 30, 0, 30);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Sheep:"+ getQuantity() +"    Health:" + getHealth() + "    Happiness:" + getHappiness();
	}
}
