/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Farmer{
	private static String name;
	private static String age;
	private static int skill;
	private static int avatar;
	private static int action = 2;
	
	public Farmer() {
		
	}
	
	public Farmer(String name, int avatar, String age, int skill) {
		Farmer.name = name;
		Farmer.age = age;
		Farmer.skill = skill;
		Farmer.avatar = avatar;
	}

	public void setName(String name) {
		Farmer.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAvatar(int index) {
		Farmer.avatar = index;
	}
	public int getAvatar() {
		return avatar;
	}
	public void setAge(String age) {
		Farmer.age = age;
	}
	public String getAge() {
		return age;
	}
	public void setSkill(int skill) {
		Farmer.skill = skill;
	}
	public int getSkill() {
		return skill;
	} 
	public void setAction(int action) {
		Farmer.action = action;
	}
	public int getAction() {
		return action;
	} 

}
