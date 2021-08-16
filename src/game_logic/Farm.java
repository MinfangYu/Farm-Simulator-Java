/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

import java.util.ArrayList;
import java.util.List;


public class Farm {
	private static String name;
	private static int type;
	private Farmer farmer;
	private static double money = 500;
	private static int day;
	private int tidy = 50;
	private List <Animals> animals = new ArrayList<Animals> ();
	private List <Crops> crops = new ArrayList<Crops>();
	private List <Items> items = new ArrayList<Items> ();
	
	public Farm() {
		
	}
	public Farm(String name, int type, Farmer farmer, double money, int day) {
		Farm.name = name;
		Farm.type = type;
		this.farmer = farmer;
		Farm.money = money;
		Farm.day = day;
	}
	
	public void setName(String name) {
		Farm.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(int type) {
		Farm.type = type;
	}
	public int getType() {
		return type;
	} 
	public void setMoney(double money) {
		Farm.money = money;
	}
	public double getMoney() {
		return money;
	} 
	public void setFarmer(Farmer farmer) {
		this.farmer =farmer;
	}
	public Farmer getFarmer() {
		return farmer;
	}
	public void setDay(int day) {
		Farm.day = day;
	}
	public int getDay() {
		return day;
	}
	public void setTidy(int tidy) {
		this.tidy = tidy;
	}
	public int getTidy() {
		return tidy;
	}
	public void setAnimals(ArrayList <Animals> animals) {
		this.animals = animals;
	}
	public List <Animals> getAnimals(){
		return animals;
	}
	public void setCrops(ArrayList <Crops> crops) {
		this.crops = crops;
	}
	public List <Crops> getCrops(){
		return crops;
	}
	public void setItems(ArrayList <Items> items) {
		this.items = items;
	}
	public List <Items> getItems(){
		return items;
	}
	public void tendLand() {
		tidy += 10;
	}
}

