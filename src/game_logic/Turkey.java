/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Turkey extends Animals{

	public Turkey() {
		super("Turkey", 80, 35, 0, 15);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Turkey:"+ getQuantity() +"    Health:" + getHealth() + "    Happiness:" + getHappiness();
	}

}
