/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

import game_logic.Cabbage;
import game_logic.Carrot;
import game_logic.Chicken;
import game_logic.Corn;
import game_logic.Cow;
import game_logic.Eggplant;
import game_logic.Farm;
import game_logic.Farmer;
import game_logic.Garlic;
import game_logic.Potato;
import game_logic.Pumpkin;
import game_logic.Random;
import game_logic.Sheep;
import game_logic.Turkey;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

// TODO: To create the main game frame
/**
 * The Class MainGame.
 */
public class MainGame extends JFrame {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The farm. */
	private Farm farm = new Farm();
	
	/** The farmer. */
	private Farmer farmer = new Farmer();
	
	/** The cabbage. */
	private Cabbage cabbage = new Cabbage();
	
	/** The potato. */
	private Potato potato = new Potato();
	
	/** The carrot. */
	private Carrot carrot = new Carrot();
	
	/** The corn. */
	private Corn corn = new Corn();
	
	/** The garlic. */
	private Garlic garlic = new Garlic();
	
	/** The eggplant. */
	private Eggplant eggplant = new Eggplant();
	
	/** The pumpkin. */
	private Pumpkin pumpkin = new Pumpkin();
	
	/** The chicken. */
	private Chicken chicken = new Chicken();
	
	/** The turkey. */
	private Turkey turkey = new Turkey();
	
	/** The sheep. */
	private Sheep sheep = new Sheep();
	
	/** The cow. */
	private Cow cow = new Cow();
	
	/** The game day. */
	private static int gameDay = 1;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The is tend. */
	private boolean isTend = false;
	
	/** The total chicken. */
	private int totalChicken = 0;
	
	/** The total turkey. */
	private int totalTurkey = 0;
	
	/** The total sheep. */
	private int totalSheep = 0;
	
	/** The total cow. */
	private int totalCow = 0;
	
	/** The random. */
	private Random random = new Random();

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public MainGame() {
		setTitle("Main game");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 970, 664);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/main1.png"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);

		JLabel lblDay = new JLabel("DAY: 1");
		lblDay.setFont(new Font("Calibri", Font.BOLD, 32));
		lblDay.setBounds(0, 0, 135, 37);
		contentPane.add(lblDay);
		
		JLabel lblText = new JLabel("Random events:");
		lblText.setFont(new Font("Calibri", Font.BOLD, 20));
		lblText.setBounds(0, 38, 154, 37);
		contentPane.add(lblText);
		
		JButton btnAnimals = new JButton("Animals");
		btnAnimals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AnimalsFrame();
				setVisible(false);
			}
		});
		btnAnimals.setBackground(UIManager.getColor("Button.light"));
		btnAnimals.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 35));
		btnAnimals.setBounds(265, 236, 154, 58);
		contentPane.add(btnAnimals);
		
		JButton btnCrops = new JButton("Crops");
		btnCrops.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new CropsFrame();
				setVisible(false);
			}
		});
		btnCrops.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 35));
		btnCrops.setBounds(442, 480, 154, 53);
		contentPane.add(btnCrops);
		
		JButton btnStore = new JButton("Store");
		btnStore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Store();
				setVisible(false);
			}
		});
		btnStore.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 35));
		btnStore.setBounds(681, 136, 154, 53);
		contentPane.add(btnStore);
		
		JLabel lblNewLabel = new JLabel("$500");
		lblNewLabel.setText("$"+farm.getMoney());
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 38));
		lblNewLabel.setBounds(784, 0, 180, 53);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 24));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Actions:", "1.Water crops (free)", "2.Play with animals", "3.Harvest crops", "4.Tend the land", "5.Use items"}));
		comboBox.setBounds(280, 11, 238, 37);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Actions left today: 2");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(538, 14, 258, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTidy = new JLabel("Tidy: 50");
		lblTidy.setText("Tidy: "+farm.getTidy());
		lblTidy.setFont(new Font("Calibri", Font.BOLD, 32));
		lblTidy.setBounds(135, 0, 135, 37);
		contentPane.add(lblTidy);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE)); 
		
		JLabel lblEvent = new JLabel("");
		lblEvent.setFont(new Font("Calibri", Font.BOLD, 20));
		lblEvent.setBounds(0, 68, 270, 37);
		contentPane.add(lblEvent);
		
		JButton btnNewButton = new JButton("Package");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Package();
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnNewButton.setBounds(819, 53, 135, 41);
		contentPane.add(btnNewButton);
		
		JButton btnMoveToNext = new JButton("To Next Day");
		btnMoveToNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				farmer.setAction(2);
				lblNewLabel_1.setText("Actions left today: 2");
				gameDay ++;
				JOptionPane.showMessageDialog(null, "Now, Day:" + gameDay, "Day", JOptionPane.WARNING_MESSAGE);
				lblDay.setText("DAY: " + gameDay);
				if(gameDay > farm.getDay()){
					JOptionPane.showMessageDialog(null, "Game over! You have lost.", "Day", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
				else {
					int oneDay1 = Store.field1[0];
					Store.field1[1] += oneDay1;
					Store.field1[0] = 0;
					
					int twoDay1 = Store.field2[0];
					int twoDay2 = Store.field2[1];
					Store.field2[2] += twoDay2;
					Store.field2[1] = twoDay1;
					Store.field2[0] = 0;
					
					int threeDay1 = Store.field3[0];
					int threeDay2 = Store.field3[1];
					Store.field3[2] += threeDay2;
					Store.field3[1] = threeDay1;
					Store.field3[0] = 0;
					
					int fourDay1 = Store.field4[0];
					int fourDay2 = Store.field4[1];
					int fourDay3 = Store.field4[2];
					Store.field4[3] += fourDay3;
					Store.field4[2] = fourDay2;
					Store.field4[1] = fourDay1;
					Store.field4[0] = 0;
					
					int fiveDay1 = Store.field5[0];
					int fiveDay2 = Store.field5[1];
					int fiveDay3 = Store.field5[2];
					Store.field5[3] += fiveDay3;
					Store.field5[2] = fiveDay2;
					Store.field5[1] = fiveDay1;
					Store.field5[0] = 0;
					
					int sixDay1 = Store.field6[0];
					int sixDay2 = Store.field6[1];
					int sixDay3 = Store.field6[2];
					int sixDay4 = Store.field6[3];
					Store.field6[4] += sixDay4;
					Store.field6[3] = sixDay3;
					Store.field6[2] = sixDay2;
					Store.field6[1] = sixDay1;
					Store.field6[0] = 0;
					
					int sevenDay1 = Store.field7[0];
					int sevenDay2 = Store.field7[1];
					int sevenDay3 = Store.field7[2];
					int sevenDay4 = Store.field7[3];
					int sevenDay5 = Store.field7[4];
					int sevenDay6 = Store.field7[5];
					Store.field7[6] += sevenDay6;
					Store.field7[5] = sevenDay5;
					Store.field7[4] = sevenDay4;
					Store.field7[3] = sevenDay3;
					Store.field7[2] = sevenDay2;
					Store.field7[1] = sevenDay1;
					Store.field7[0] = 0;
					
					if(isTend == false) {
						farm.setTidy(farm.getTidy() - 5);
						lblTidy.setText("Tidy: "+farm.getTidy());
					}
					
					isTend = false;
					if(farm.getTidy() < 40) {
						for(int i = 0; i < 5; i++) {
							if(Store.chicken[i] != "") {
								Store.chickenList.get(i).happinessDown();
								Store.chicken[i] = Store.chickenList.get(i).toString();
							}
							if(Store.turkey[i] != "") {
								Store.turkeyList.get(i).happinessDown();
								Store.turkey[i] = Store.turkeyList.get(i).toString();
							}
							if(Store.sheep[i] != "") {
								Store.sheepList.get(i).happinessDown();
								Store.sheep[i] = Store.sheepList.get(i).toString();
							}
							if(Store.cow[i] != "") {
								Store.cowList.get(i).happinessDown();
								Store.cow[i] = Store.cowList.get(i).toString();
							}
						}
					}
					if(farm.getTidy() > 70) {
						for(int i = 0; i < 5; i++) {
							if(Store.chicken[i] != "") {
								Store.chickenList.get(i).happinessUp();
								Store.chicken[i] = Store.chickenList.get(i).toString();
							}
							if(Store.turkey[i] != "") {
								Store.turkeyList.get(i).happinessUp();
								Store.turkey[i] = Store.turkeyList.get(i).toString();
							}
							if(Store.sheep[i] != "") {
								Store.sheepList.get(i).happinessUp();
								Store.sheep[i] = Store.sheepList.get(i).toString();
							}
							if(Store.cow[i] != "") {
								Store.cowList.get(i).happinessUp();
								Store.cow[i] = Store.cowList.get(i).toString();
							}
						}
					}
					for(int i = 0; i < 5; i++) {
						if(Store.chicken[i] != "") {
							totalChicken += Store.chickenList.get(i).getQuantity();
						}
						if(Store.turkey[i] != "") {
							totalTurkey += Store.turkeyList.get(i).getQuantity();
						}
						if(Store.sheep[i] != "") {
							totalSheep += Store.sheepList.get(i).getQuantity();
						}
						if(Store.cow[i] != "") {
							totalCow += Store.cowList.get(i).getQuantity();
						}
					}
					double mon = totalChicken * chicken.animalBonus() + totalTurkey * turkey.animalBonus() + totalSheep * sheep.animalBonus() + totalCow * cow.animalBonus();
					farm.setMoney(farm.getMoney() + mon);
					lblNewLabel.setText("$"+farm.getMoney());
					JOptionPane.showMessageDialog(null, "You have get $" + mon + " bonus yesterday.", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
					
					if(random.getRandom() == 1) {
						lblEvent.setText("Bad luck! Drought!");
						JOptionPane.showMessageDialog(null, "Bad luck! Drought!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
						Store.field1[1] = 0;
						Store.field1[0] = 0;
						Store.field2[2] = 0;
						Store.field2[1] = 0;
						Store.field2[0] = 0;
						Store.field4[3] = 0;
						Store.field4[2] = 0;
						Store.field4[1] = 0;
						Store.field4[0] = 0;
					}
					else if(random.getRandom() == 2) {
						lblEvent.setText("Bad luck! Broken Fence!");
						JOptionPane.showMessageDialog(null, "Bad luck! Broken Fence!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
						for(int i = 0; i < 5; i++) {
							if(Store.chicken[i] != "") {
								Store.chicken[i] = "";
								
							}
							if(Store.turkey[i] != "") {
								Store.turkeyList.get(i).happinessDown();
								Store.turkey[i] = Store.turkeyList.get(i).toString();
							}
							if(Store.sheep[i] != "") {
								Store.sheepList.get(i).happinessDown();
								Store.sheep[i] = Store.sheepList.get(i).toString();
							}
							if(Store.cow[i] != "") {
								Store.cowList.get(i).happinessDown();
								Store.cow[i] = Store.cowList.get(i).toString();
							}
						}
						totalChicken = 0;
					}
					else if(random.getRandom() == 3) {
						lblEvent.setText("Good luck! County fair!");
						double conty = (totalChicken + totalTurkey + totalSheep + totalCow) * 300;
						farm.setMoney(farm.getMoney() + conty);
						lblNewLabel.setText("$"+farm.getMoney());
						JOptionPane.showMessageDialog(null, "Good luck! County fair! You got $" + conty, "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						lblEvent.setText("Nothing happens");
					}
					totalChicken = 0;
					totalTurkey = 0;
					totalSheep = 0;
					totalCow = 0;
				}
			}
		});
		btnMoveToNext.setBackground(new Color(255, 255, 0));
		btnMoveToNext.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnMoveToNext.setBounds(762, 571, 202, 58);
		contentPane.add(btnMoveToNext);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(comboBox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Please choose an action.", "Error", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					if(farmer.getAction() > 0) {
						if(comboBox.getSelectedIndex() == 5) {
							new Package();
							farmer.setAction(farmer.getAction() - 1);
						}
						
						if(comboBox.getSelectedIndex() == 4) {
							isTend = true;
							farm.tendLand();
							lblTidy.setText("Tidy: "+farm.getTidy());
							JOptionPane.showMessageDialog(null, "You have tend the land and tidy ups." , "Congratulations", JOptionPane.INFORMATION_MESSAGE);
							farmer.setAction(farmer.getAction() - 1);
						}
						if(comboBox.getSelectedIndex() == 1) {
							new LandChoose();
							farmer.setAction(farmer.getAction() - 1);
						}
						
						if(comboBox.getSelectedIndex() == 2) {
							new AnimalChoose();
							farmer.setAction(farmer.getAction() - 1);
						}
						
						if(comboBox.getSelectedIndex() == 3) {
							double m = cabbage.harvestCrops(Store.field1[1]) + potato.harvestCrops(Store.field2[2]) + carrot.harvestCrops(Store.field3[2]) + 
									corn.harvestCrops(Store.field4[3]) + garlic.harvestCrops(Store.field5[3]) + eggplant.harvestCrops(Store.field6[4]) + pumpkin.harvestCrops(Store.field7[6]);
							farm.setMoney(farm.getMoney() + m);
							Store.field1[1] = 0;
							Store.field2[2] = 0;
							Store.field3[2] = 0;
							Store.field4[3] = 0;
							Store.field5[3] = 0;
							Store.field6[4] = 0;
							Store.field7[6] = 0;
							lblNewLabel.setText("$"+farm.getMoney());
							JOptionPane.showMessageDialog(null, "You have earned $" + m , "Congratulations", JOptionPane.INFORMATION_MESSAGE);
							farmer.setAction(farmer.getAction() - 1);
						}
						System.out.println(farmer.getAction());
						if(farmer.getAction() > 0) {
							lblNewLabel_1.setText("Actions left today: " + farmer.getAction());
						}
						else {
							lblNewLabel_1.setText("No action available today.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "No action available today.", "Error", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		btnConfirm.setFont(new Font("Calibri", Font.PLAIN, 21));
		btnConfirm.setBounds(341, 57, 129, 37);
		contentPane.add(btnConfirm);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Profile();
			}
		});
		btnProfile.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnProfile.setBackground(new Color(176, 224, 230));
		btnProfile.setBounds(10, 117, 123, 41);
		contentPane.add(btnProfile);
		

		setVisible(true);
	}
}
