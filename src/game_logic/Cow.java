/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Cow extends Animals{

	public Cow() {
		super("Cow", 500, 20, 0, 50);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Cow:"+ getQuantity() +"    Health:" + getHealth() + "    Happiness:" + getHappiness();
	}
}
