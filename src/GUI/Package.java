/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game_logic.Cabbage;
import game_logic.Carrot;
import game_logic.Chicken;
import game_logic.Corn;
import game_logic.Cow;
import game_logic.Eggplant;
import game_logic.Farm;
import game_logic.Garlic;
import game_logic.Potato;
import game_logic.Pumpkin;
import game_logic.Sheep;
import game_logic.Turkey;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

// TODO: To create the package frame
/**
 * The Class Package.
 */
public class Package extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The content pane. */
	private JPanel contentPane;
	
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
	
	/** The farm. */
	private Farm farm = new Farm();
	
	/** The chicken. */
	private Chicken chicken = new Chicken();
	
	/** The turkey. */
	private Turkey turkey = new Turkey();
	
	/** The sheep. */
	private Sheep sheep = new Sheep();
	
	/** The cow. */
	private Cow cow = new Cow();
	/**
	 * Create the frame.
	 */
	public Package() {
		setTitle("Package");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 643, 554);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<String> list = new JList<String>();
		list.setFont(new Font("Calibri", Font.PLAIN, 27));
		list.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"1. Normal Stark Fertilizer", "2. Premium Stark Fertilizer", "3. Super Stark Fertilizer\t", "4. Normal Alien Animal Food", "5. Premium Alien Animal Food ", "6. Magic Alien Animal Food"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(66, 90, 379, 229);
		contentPane.add(list);
		
		JLabel lblChooseOneTo = new JLabel("Choose one to use. It is an action.");
		lblChooseOneTo.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblChooseOneTo.setBounds(28, 25, 453, 41);
		contentPane.add(lblChooseOneTo);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Cabbage\t", "Potato\t", "Carrot\t", "Corn\t", "Garlic", "Eggplant\t", "Pumpkin", "Chicken\t", "Turkey\t", "Sheep\t", "Cow"}));
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 22));
		comboBox.setBounds(66, 405, 123, 41);
		contentPane.add(comboBox);
		
		JLabel label12 = new JLabel("0");
		label12.setText(Store.quan[0] + "");
		label12.setFont(new Font("Calibri", Font.PLAIN, 26));
		label12.setBounds(459, 96, 72, 24);
		contentPane.add(label12);
		
		JLabel label13 = new JLabel("0");
		label13.setText(Store.quan[1] + "");
		label13.setFont(new Font("Calibri", Font.PLAIN, 26));
		label13.setBounds(459, 129, 72, 24);
		contentPane.add(label13);
		
		JLabel label14 = new JLabel("0");
		label14.setText(Store.quan[2] + "");
		label14.setFont(new Font("Calibri", Font.PLAIN, 26));
		label14.setBounds(459, 163, 72, 24);
		contentPane.add(label14);
		
		JLabel label15 = new JLabel("0");
		label15.setText(Store.quan[3] + "");
		label15.setFont(new Font("Calibri", Font.PLAIN, 26));
		label15.setBounds(459, 194, 72, 24);
		contentPane.add(label15);
		
		JLabel label16 = new JLabel("0");
		label16.setText(Store.quan[4] + "");
		label16.setFont(new Font("Calibri", Font.PLAIN, 26));
		label16.setBounds(459, 235, 72, 24);
		contentPane.add(label16);
		
		JLabel label17 = new JLabel("0");
		label17.setText(Store.quan[5] + "");
		label17.setFont(new Font("Calibri", Font.PLAIN, 26));
		label17.setBounds(459, 276, 72, 24);
		contentPane.add(label17);
		
		JButton btnUse = new JButton("Use");
		btnUse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label12.getText().trim().equals("0") && label13.getText().trim().equals("0") && label14.getText().trim().equals("0") && label15.getText().trim().equals("0") 
						&& label16.getText().trim().equals("0") && label17.getText().trim().equals("0")) {
					JOptionPane.showMessageDialog(null, "No items in your package!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(list.getSelectedIndex()==0 && (comboBox.getSelectedIndex()==7 || comboBox.getSelectedIndex()==8 || comboBox.getSelectedIndex()==9 || comboBox.getSelectedIndex()==10)) {
					JOptionPane.showMessageDialog(null, "Fertilizer cannot be used for animals!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(list.getSelectedIndex()==1 && (comboBox.getSelectedIndex()==7 || comboBox.getSelectedIndex()==8 || comboBox.getSelectedIndex()==9 || comboBox.getSelectedIndex()==10)) {
					JOptionPane.showMessageDialog(null, "Fertilizer cannot be used for animals!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(list.getSelectedIndex()==2 && (comboBox.getSelectedIndex()==7 || comboBox.getSelectedIndex()==8 || comboBox.getSelectedIndex()==9 || comboBox.getSelectedIndex()==10)) {
					JOptionPane.showMessageDialog(null, "Fertilizer cannot be used for animals!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(list.getSelectedIndex()==3 && (comboBox.getSelectedIndex()==0 || comboBox.getSelectedIndex()==1 || comboBox.getSelectedIndex()==2 || comboBox.getSelectedIndex()==3 ||
						comboBox.getSelectedIndex()==4 || comboBox.getSelectedIndex()==5 || comboBox.getSelectedIndex()==6)) {
					JOptionPane.showMessageDialog(null, "Animal Food cannot be used for crops!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(list.getSelectedIndex()==4 && (comboBox.getSelectedIndex()==0 || comboBox.getSelectedIndex()==1 || comboBox.getSelectedIndex()==2 || comboBox.getSelectedIndex()==3 ||
						comboBox.getSelectedIndex()==4 || comboBox.getSelectedIndex()==5 || comboBox.getSelectedIndex()==6)) {
					JOptionPane.showMessageDialog(null, "Animal Food cannot be used for crops!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(list.getSelectedIndex()==5 && (comboBox.getSelectedIndex()==0 || comboBox.getSelectedIndex()==1 || comboBox.getSelectedIndex()==2 || comboBox.getSelectedIndex()==3 ||
						comboBox.getSelectedIndex()==4 || comboBox.getSelectedIndex()==5 || comboBox.getSelectedIndex()==6)) {
					JOptionPane.showMessageDialog(null, "Animal Food cannot be used for crops!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else {
					if(list.getSelectedIndex()==0) {
						
						if(comboBox.getSelectedIndex() == 0) {
							cabbage.normalFertilizer();
							int oneDay1 = Store.field1[0];
							Store.field1[1] += oneDay1;
							Store.field1[0] = 0;
							label12.setText(Store.quan[0] - 1 + "");
						}
						else if(comboBox.getSelectedIndex() == 1) {
							potato.normalFertilizer();
							int twoDay1 = Store.field2[0];
							int twoDay2 = Store.field2[1];
							Store.field2[2] += (twoDay2 + twoDay1);
							Store.field2[1] = 0;
							Store.field2[0] = 0;
							label12.setText(Store.quan[0] - 1 + "");
						}
						else if(comboBox.getSelectedIndex() == 2) {
							carrot.normalFertilizer();
							int threeDay1 = Store.field3[0];
							int threeDay2 = Store.field3[1];
							Store.field3[2] += (threeDay2 + threeDay1);
							Store.field3[1] = 0;
							Store.field3[0] = 0;
							label12.setText(Store.quan[0] - 1 + "");
						}
						else if(comboBox.getSelectedIndex() == 3) {
							corn.normalFertilizer();
							int fourDay1 = Store.field4[0];
							int fourDay2 = Store.field4[1];
							int fourDay3 = Store.field4[2];
							Store.field4[3] += (fourDay3 + fourDay2);
							Store.field4[2] = fourDay1;
							Store.field4[1] = 0;
							Store.field4[0] = 0;
							label12.setText(Store.quan[0] - 1 + "");
						}
						else if(comboBox.getSelectedIndex() == 4) {
							garlic.normalFertilizer();
							int fiveDay1 = Store.field5[0];
							int fiveDay2 = Store.field5[1];
							int fiveDay3 = Store.field5[2];
							Store.field5[3] += (fiveDay3 + fiveDay2);
							Store.field5[2] = fiveDay1;
							Store.field5[1] = 0;
							Store.field5[0] = 0;
							label12.setText(Store.quan[0] - 1 + "");
						}
						else if(comboBox.getSelectedIndex() == 5) {
							eggplant.normalFertilizer();
							int sixDay1 = Store.field6[0];
							int sixDay2 = Store.field6[1];
							int sixDay3 = Store.field6[2];
							int sixDay4 = Store.field6[3];
							Store.field6[4] += (sixDay4 + sixDay3);
							Store.field6[3] = sixDay2;
							Store.field6[2] = sixDay1;
							Store.field6[1] = 0;
							Store.field6[0] = 0;
							label12.setText(Store.quan[0] - 1 + "");
						}
						else if(comboBox.getSelectedIndex() == 6) {
							if(farm.getTidy() < 70) {
								JOptionPane.showMessageDialog(null, "You cannot use the field7 until tidy >= 70", "Error", JOptionPane.WARNING_MESSAGE);
							}else {
								pumpkin.normalFertilizer();
								int sevenDay1 = Store.field7[0];
								int sevenDay2 = Store.field7[1];
								int sevenDay3 = Store.field7[2];
								int sevenDay4 = Store.field7[3];
								int sevenDay5 = Store.field7[4];
								int sevenDay6 = Store.field7[5];
								Store.field7[6] += (sevenDay6 + sevenDay5);
								Store.field7[5] = sevenDay4;
								Store.field7[4] = sevenDay3;
								Store.field7[3] = sevenDay2;
								Store.field7[2] = sevenDay1;
								Store.field7[1] = 0;
								Store.field7[0] = 0;
								label12.setText(Store.quan[0] - 1 + "");
							}
						}
					}
					if(list.getSelectedIndex()==1) {
						
						if(comboBox.getSelectedIndex() == 0) {
							cabbage.premiumFertilizer();
							int oneDay1 = Store.field1[0];
							Store.field1[1] += oneDay1;
							Store.field1[0] = 0;
							label13.setText(Store.quan[1] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 1) {
							potato.premiumFertilizer();
							int twoDay1 = Store.field2[0];
							int twoDay2 = Store.field2[1];
							Store.field2[2] += (twoDay2 + twoDay1);
							Store.field2[1] = 0;
							Store.field2[0] = 0;
							label13.setText(Store.quan[1] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 2) {
							carrot.premiumFertilizer();
							int threeDay1 = Store.field3[0];
							int threeDay2 = Store.field3[1];
							Store.field3[2] += (threeDay2 + threeDay1);
							Store.field3[1] = 0;
							Store.field3[0] = 0;
							label13.setText(Store.quan[1] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 3) {
							corn.premiumFertilizer();
							int fourDay1 = Store.field4[0];
							int fourDay2 = Store.field4[1];
							int fourDay3 = Store.field4[2];
							Store.field4[3] += (fourDay3 + fourDay2 + fourDay1);
							Store.field4[2] = 0;
							Store.field4[1] = 0;
							Store.field4[0] = 0;
							label13.setText(Store.quan[1] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 4) {
							garlic.premiumFertilizer();
							int fiveDay1 = Store.field5[0];
							int fiveDay2 = Store.field5[1];
							int fiveDay3 = Store.field5[2];
							Store.field5[3] += (fiveDay3 + fiveDay2 + fiveDay1);
							Store.field5[2] = 0;
							Store.field5[1] = 0;
							Store.field5[0] = 0;
							label13.setText(Store.quan[1] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 5) {
							eggplant.premiumFertilizer();
							int sixDay1 = Store.field6[0];
							int sixDay2 = Store.field6[1];
							int sixDay3 = Store.field6[2];
							int sixDay4 = Store.field6[3];
							Store.field6[4] += (sixDay4 + sixDay3 + sixDay2);
							Store.field6[3] = sixDay1;
							Store.field6[2] = 0;
							Store.field6[1] = 0;
							Store.field6[0] = 0;
							label13.setText(Store.quan[1] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 6) {
							if(farm.getTidy() < 70) {
								JOptionPane.showMessageDialog(null, "You cannot use the field7 until tidy >= 70", "Error", JOptionPane.WARNING_MESSAGE);
							}else {
								pumpkin.premiumFertilizer();
								int sevenDay1 = Store.field7[0];
								int sevenDay2 = Store.field7[1];
								int sevenDay3 = Store.field7[2];
								int sevenDay4 = Store.field7[3];
								int sevenDay5 = Store.field7[4];
								int sevenDay6 = Store.field7[5];
								Store.field7[6] += (sevenDay6 + sevenDay5 + sevenDay4);
								Store.field7[5] = sevenDay3;
								Store.field7[4] = sevenDay2;
								Store.field7[3] = sevenDay1;
								Store.field7[2] = 0;
								Store.field7[1] = 0;
								Store.field7[0] = 0;
								label13.setText(Store.quan[1] - 1 + "");
								JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}
					if(list.getSelectedIndex()==2) {
						
						if(comboBox.getSelectedIndex() == 0) {
							cabbage.superFertilizer();
							int oneDay1 = Store.field1[0];
							Store.field1[1] += oneDay1;
							Store.field1[0] = 0;
							label14.setText(Store.quan[2] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 1) {
							potato.superFertilizer();
							int twoDay1 = Store.field2[0];
							int twoDay2 = Store.field2[1];
							Store.field2[2] += (twoDay2 + twoDay1);
							Store.field2[1] = 0;
							Store.field2[0] = 0;
							label14.setText(Store.quan[2] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 2) {
							carrot.superFertilizer();
							int threeDay1 = Store.field3[0];
							int threeDay2 = Store.field3[1];
							Store.field3[2] += (threeDay2 + threeDay1);
							Store.field3[1] = 0;
							Store.field3[0] = 0;
							label14.setText(Store.quan[2] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 3) {
							corn.superFertilizer();
							int fourDay1 = Store.field4[0];
							int fourDay2 = Store.field4[1];
							int fourDay3 = Store.field4[2];
							Store.field4[3] += (fourDay3 + fourDay2 + fourDay1);
							Store.field4[2] = 0;
							Store.field4[1] = 0;
							Store.field4[0] = 0;
							label14.setText(Store.quan[2] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 4) {
							garlic.superFertilizer();
							int fiveDay1 = Store.field5[0];
							int fiveDay2 = Store.field5[1];
							int fiveDay3 = Store.field5[2];
							Store.field5[3] += (fiveDay3 + fiveDay2 + fiveDay1);
							Store.field5[2] = 0;
							Store.field5[1] = 0;
							Store.field5[0] = 0;
							label14.setText(Store.quan[2] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 5) {
							eggplant.superFertilizer();
							int sixDay1 = Store.field6[0];
							int sixDay2 = Store.field6[1];
							int sixDay3 = Store.field6[2];
							int sixDay4 = Store.field6[3];
							Store.field6[4] += (sixDay4 + sixDay3 + sixDay2 + sixDay1);
							Store.field6[3] = 0;
							Store.field6[2] = 0;
							Store.field6[1] = 0;
							Store.field6[0] = 0;
							label14.setText(Store.quan[2] - 1 + "");
							JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(comboBox.getSelectedIndex() == 6) {
							if(farm.getTidy() < 70) {
								JOptionPane.showMessageDialog(null, "You cannot use the field7 until tidy >= 70", "Error", JOptionPane.WARNING_MESSAGE);
							}else {
								pumpkin.superFertilizer();
								int sevenDay1 = Store.field7[0];
								int sevenDay2 = Store.field7[1];
								int sevenDay3 = Store.field7[2];
								int sevenDay4 = Store.field7[3];
								int sevenDay5 = Store.field7[4];
								int sevenDay6 = Store.field7[5];
								Store.field7[6] += (sevenDay6 + sevenDay5 + sevenDay4 + sevenDay3 + sevenDay2 + sevenDay1);
								Store.field7[5] = 0;
								Store.field7[4] = 0;
								Store.field7[3] = 0;
								Store.field7[2] = 0;
								Store.field7[1] = 0;
								Store.field7[0] = 0;
								label14.setText(Store.quan[2] - 1 + "");
								JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}
					if(list.getSelectedIndex()==3) {
						if(comboBox.getSelectedIndex() == 7 ) {
							chicken.normalFood();
							for(int i = 0; i < 5; i++) {
								if(Store.chicken[i] != "") {
									Store.chickenList.get(i).normalFood();
									Store.chicken[i] = Store.chickenList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 8 ) {
							turkey.normalFood();
							for(int i = 0; i < 5; i++) {
								if(Store.turkey[i] != "") {
									Store.turkeyList.get(i).normalFood();
									Store.turkey[i] = Store.turkeyList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 9 ) {
							sheep.normalFood();
							for(int i = 0; i < 5; i++) {
								if(Store.sheep[i] != "") {
									Store.sheepList.get(i).normalFood();
									Store.sheep[i] = Store.sheepList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 10 ) {
							cow.normalFood();
							for(int i = 0; i < 5; i++) {
								if(Store.cow[i] != "") {
									Store.cowList.get(i).normalFood();
									Store.cow[i] = Store.cowList.get(i).toString();
								}
							}
					    }
						label15.setText(Store.quan[3] - 1 + "");
						JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
					}
					if(list.getSelectedIndex()==4) {
						if(comboBox.getSelectedIndex() == 7 ) {
							chicken.premiumFood();
							for(int i = 0; i < 5; i++) {
								if(Store.chicken[i] != "") {
									Store.chickenList.get(i).premiumFood();
									Store.chicken[i] = Store.chickenList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 8 ) {
							turkey.premiumFood();
							for(int i = 0; i < 5; i++) {
								if(Store.turkey[i] != "") {
									Store.turkeyList.get(i).premiumFood();
									Store.turkey[i] = Store.turkeyList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 9 ) {
							sheep.premiumFood();
							for(int i = 0; i < 5; i++) {
								if(Store.sheep[i] != "") {
									Store.sheepList.get(i).premiumFood();
									Store.sheep[i] = Store.sheepList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 10 ) {
							cow.premiumFood();
							for(int i = 0; i < 5; i++) {
								if(Store.cow[i] != "") {
									Store.cowList.get(i).premiumFood();
									Store.cow[i] = Store.cowList.get(i).toString();
								}
							}
					    }
						label16.setText(Store.quan[4] - 1 + "");
						JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
					}
					if(list.getSelectedIndex()==5) {
						if(comboBox.getSelectedIndex() == 7 ) {
							chicken.magicFood();
							for(int i = 0; i < 5; i++) {
								if(Store.chicken[i] != "") {
									Store.chickenList.get(i).magicFood();
									Store.chicken[i] = Store.chickenList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 8 ) {
							turkey.magicFood();
							for(int i = 0; i < 5; i++) {
								if(Store.turkey[i] != "") {
									Store.turkeyList.get(i).magicFood();
									Store.turkey[i] = Store.turkeyList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 9 ) {
							sheep.magicFood();
							for(int i = 0; i < 5; i++) {
								if(Store.sheep[i] != "") {
									Store.sheepList.get(i).magicFood();
									Store.sheep[i] = Store.sheepList.get(i).toString();
								}
							}
						}
						else if(comboBox.getSelectedIndex() == 10 ) {
							cow.magicFood();
							for(int i = 0; i < 5; i++) {
								if(Store.cow[i] != "") {
									Store.cowList.get(i).magicFood();
									Store.cow[i] = Store.cowList.get(i).toString();
								}
							}
					    }
						label17.setText(Store.quan[5] - 1 + "");
						JOptionPane.showMessageDialog(null, "Successfully used an item", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
				}
			}
		});
		btnUse.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnUse.setBounds(379, 425, 123, 41);
		contentPane.add(btnUse);
		
		
		JLabel lblNumber = new JLabel("Quantity");
		lblNumber.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNumber.setBounds(436, 53, 84, 30);
		contentPane.add(lblNumber);
		
		
		JLabel lblChooseTheLand = new JLabel("Choose a land or animal type to use the selected item.");
		lblChooseTheLand.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblChooseTheLand.setBounds(28, 354, 503, 41);
		contentPane.add(lblChooseTheLand);
		
		setVisible(true);
	}
}
