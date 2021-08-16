/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

import java.util.ArrayList;
import java.lang.Math;
import java.util.List;

public class Random {
	
	public int result = 0;
	public String eventStr;
	
	public int getRandom() {
		String a = "Nothing happens", b = "Bad luck! Drought!", c = "Bad luck! Broken Fence!", d = "Good luck! County fair";
		List<String> events = new ArrayList<>();
		events.add(a);
		events.add(b);
		events.add(c);
		events.add(d);
		String event = "";
		final double dd = Math.random();
		final int i = (int)(dd*100);
		if(i>0 && i<30){
			event = events.get(0);
			result = events.indexOf(event);
			eventStr = event;
			}else if(i>=30 && i<50){
			event = events.get(1);
			result = events.indexOf(event);
			eventStr = event;
			}else if(i>=50 && i<70){
			event = events.get(2);
			result = events.indexOf(event);
			eventStr = event;
			}else{
			event = events.get(3);
			result = events.indexOf(event);
			eventStr = event;
			}
		return result;

	}

}
