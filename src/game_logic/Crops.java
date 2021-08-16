/** 
* @author : wli91, myu40
* @version 1.0 
*/
package game_logic;

public class Crops {
	private String type;
	private int purchasePrice;
	private int sellPrice;
	private int harvestDay;
	private Farmer farmer = new Farmer();
	private Farm farm = new Farm();
	private int quantity;
	
	
	public Crops(String type, int purchasePrice, int sellPrice, int harvestDay) {
		this.type = type;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.harvestDay = harvestDay;
	}

	public Crops() {
		// TODO Auto-generated constructor stub
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	} 
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	} 
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setHarvestDay(int harvestDay) {
		this.harvestDay = harvestDay;
	}
	public int getHarvestDay() {
		return harvestDay;
	}
	public void waterCrops() {
		if(harvestDay < 1) {
			harvestDay = 0;
		}else {
			harvestDay -= 1;
		}
	}
	public void normalFertilizer() {
		if(harvestDay < 2) {
			harvestDay= 0;
		}else {
			harvestDay -= 2;
		}
	}
	public void premiumFertilizer() {
		if(harvestDay < 3) {
			harvestDay = 0;
		}else {
			harvestDay -= 3;
		}
	}
	public void superFertilizer() {
		harvestDay = 0;
	}
	
	public double harvestCrops(int quantity) {
		double harvestMoney = 0;
		if(farmer.getSkill() == 0 && farm.getType() != 2) {
			harvestMoney = (double) (quantity * sellPrice * 1.15);
		}
		else if(farmer.getSkill() == 0 && farm.getType() == 2) {
			harvestMoney = (double) (quantity * sellPrice * 2 * 1.15);
		}
		else if(farmer.getSkill() != 0 && farm.getType() == 2) {
			harvestMoney = (double) (quantity * sellPrice * 2);
		}
		else if(farmer.getSkill() != 0 && farm.getType() != 2){
			harvestMoney = quantity * sellPrice;
		}
		return harvestMoney;
	}
}
