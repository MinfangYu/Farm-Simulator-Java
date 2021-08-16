/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import game_logic.Chicken;
import game_logic.Cow;
import game_logic.Farm;
import game_logic.Sheep;
import game_logic.Turkey;

import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;


// TODO: To create the store frame
/**
 * The Class Store.
 */
public class Store extends JFrame {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The farm. */
	private Farm farm = new Farm();
	
	/** The chicken class. */
	private Chicken chickenClass = new Chicken();
	
	/** The turkey class. */
	private Turkey turkeyClass = new Turkey();
	
	/** The sheep class. */
	private Sheep sheepClass = new Sheep();
	
	/** The cow class. */
	private Cow cowClass = new Cow();
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The table 1. */
	private JTable table_1;
	
	/** The scroll pane 1. */
	private JScrollPane scrollPane_1;
	
	/** The table. */
	private JTable table;
	
	/** The text field. */
	private JTextField textField;
	
	/** The quantity. */
	private int quantity;
	
	/** The cost. */
	private int cost;
	
	/** The ship. */
	private int ship = 10000+ (farm.getDay()-5)*3000;
	
	/** The price. */
	static int[] price = {5, 5, 40, 10, 50, 70, 200, 30, 80, 150, 500, 20, 100, 1800, 50, 300, 5000};
	
	/** The quan. */
	static int[] quan = {0, 0, 0, 0, 0, 0, 0};
	
	/** The field 1. */
	static int[] field1 = {0, 0};
	
	/** The field 2. */
	static int[] field2 = {0, 0, 0};
	
	/** The field 3. */
	static int[] field3 = {0, 0, 0};
	
	/** The field 4. */
	static int[] field4 = {0, 0, 0, 0};
	
	/** The field 5. */
	static int[] field5 = {0, 0, 0, 0};
	
	/** The field 6. */
	static int[] field6 = {0, 0, 0, 0, 0};
	
	/** The field 7. */
	static int[] field7 = {0, 0, 0, 0, 0, 0, 0};
	
	/** The chicken. */
	static String[] chicken = {"","","","",""};
	
	/** The turkey. */
	static String[] turkey = {"","","","",""};
	
	/** The sheep. */
	static String[] sheep = {"","","","",""};
	
	/** The cow. */
	static String[] cow = {"","","","",""};
	
	/** The chicken list. */
	static List<Chicken> chickenList = new ArrayList<Chicken>();
	
	/** The turkey list. */
	static List<Turkey> turkeyList = new ArrayList<Turkey>();
	
	/** The sheep list. */
	static List<Sheep> sheepList = new ArrayList<Sheep>();
	
	/** The cow list. */
	static List<Cow> cowList = new ArrayList<Cow>();

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public Store() {
		setTitle("Store");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 970, 664);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/store.jpg"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		contentPane.setLayout(null);
		
		
		
		table_1 = new JTable();
		table_1.setCellSelectionEnabled(true);
		
		table_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Buy $", new Integer(5), new Integer(5), new Integer(40), new Integer(10), new Integer(50), new Integer(70), new Integer(200)},
				{"Sell $", new Integer(10), new Integer(30), new Integer(160), new Integer(60), new Integer(300), new Integer(560), new Integer(2500)},
				{"Days harvest", new Integer(1), new Integer(2), new Integer(2), new Integer(3), new Integer(3), new Integer(4), new Integer(6)},
			},
			new String[] {
				"Name", "Cabbage", "Potato", "Carrot", "Corn", "Garlic", "Eggplant", "pumpkin"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.setRowHeight(30);
		table_1.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 18));
		table_1.getTableHeader().setReorderingAllowed(false);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(10, 34, 932, 120);
		contentPane.add(scrollPane);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Buy $", new Integer(30), new Integer(80), new Integer(150), new Integer(500)},
				{"Health(Poits)", new Integer(40), new Integer(35), new Integer(30), new Integer(20)},
				{"Happiness %", new Integer(0), new Integer(0), new Integer(0), new Integer(0)},
				{"Bonus/day", new Integer(5), new Integer(15), new Integer(30), new Integer(50)},
			},
			new String[] {
				"Name", "Chicken", "Turkey", "Sheep", "Cow"
			}
		));
		table.setRowHeight(30);
		table.setFont(new Font("Calibri", Font.PLAIN, 20));
		table.setCellSelectionEnabled(true);
		table.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 18));
		table.getTableHeader().setReorderingAllowed(false);
		scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setBounds(10, 161, 932, 150);
		contentPane.add(scrollPane_1);
		
		JButton btnItems = new JButton("Items");
		btnItems.setFont(new Font("Calibri", Font.PLAIN, 22));
		btnItems.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new ItemsFrame();
			}
		});
		btnItems.setBounds(25, 337, 131, 68);
		contentPane.add(btnItems);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 22));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Cabbage", "Potato", "Carrot\t", "Corn\t", "Garlic\t", "Eggplant\t", "Pumpkin", "Chicken\t", "Turkey\t", "Sheep\t", "Cow", "Normal Stark Fertilizer $20", "Premium Stark Fertilizer $100", "Super Stark Fertilizer $1,800", "Normal Alien Animal Food $50", "Premium Alien Animal Food $300", "Magic Alien Animal Food $5,000"}));
		comboBox.setBounds(10, 506, 389, 54);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 24));
		textField.setBounds(534, 513, 97, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setFont(new Font("Calibri", Font.BOLD, 22));
		lblQuantity.setBounds(437, 516, 97, 35);
		contentPane.add(lblQuantity);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please input quantity.", "Error", JOptionPane.INFORMATION_MESSAGE);
				}else {
					quantity = Integer.parseInt(textField.getText());
					if(comboBox.getSelectedIndex() < 17) {
						cost = quantity * price[comboBox.getSelectedIndex()];
					}
					else {
						cost = quantity * ship;
					}
					if(farm.getMoney() < cost) {
						JOptionPane.showMessageDialog(null, "You don't have enough money.", "Error", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						farm.setMoney(farm.getMoney() - cost);
						if(comboBox.getSelectedIndex() < 7 ) {
							if(comboBox.getSelectedIndex() == 0 ) {
								field1[0] += quantity;
							}
							else if(comboBox.getSelectedIndex() == 1 ) {
								field2[0] += quantity;
							}
							else if(comboBox.getSelectedIndex() == 2 ) {
								field3[0] += quantity;
							}
							else if(comboBox.getSelectedIndex() == 3 ) {
								field4[0] += quantity;
							}
							else if(comboBox.getSelectedIndex() == 4 ) {
								field5[0] += quantity;
							}
							else if(comboBox.getSelectedIndex() == 5 ) {
								field6[0] += quantity;
							}
							else if(comboBox.getSelectedIndex() == 6 ) {
								if(farm.getTidy() < 70) {
									farm.setMoney(farm.getMoney() + cost);
									JOptionPane.showMessageDialog(null, "You cannot use the field7 until tidy >= 70", "Error", JOptionPane.WARNING_MESSAGE);
								}else {
									field7[0] += quantity;
								}
							}
						}
						else if(comboBox.getSelectedIndex() >= 7 && comboBox.getSelectedIndex() < 11) {
							
							if(comboBox.getSelectedIndex() == 7 ) {
								chickenClass.setQuantity(quantity);
								for(int i = 0; i < 5; i++) {
									if(chicken[i] == "") {
										chickenList.add(chickenClass);
										chicken[i] = chickenClass.toString();
										break;
									}
								}
							}
							else if(comboBox.getSelectedIndex() == 8 ) {
								turkeyClass.setQuantity(quantity);
								for(int i = 0; i < 5; i++) {
									if(turkey[i] == "") {
										turkeyList.add(turkeyClass);
										turkey[i] = turkeyClass.toString();
										break;
									}
								}
							}
							else if(comboBox.getSelectedIndex() == 9 ) {
								sheepClass.setQuantity(quantity);
								for(int i = 0; i < 5; i++) {
									if(sheep[i] == "") {
										sheepList.add(sheepClass);
										sheep[i] = sheepClass.toString();
										break;
									}
								}
							}
							else if(comboBox.getSelectedIndex() == 10 ) {
								cowClass.setQuantity(quantity);
								for(int i = 0; i < 5; i++) {
									if(cow[i] == "") {
										cowList.add(cowClass);
										cow[i] = cowClass.toString();
										break;
									}
								}
						    }
						}
						else {
							quan[comboBox.getSelectedIndex() - 11] += quantity;
						}
						JOptionPane.showMessageDialog(null, "Sucessfully purchursed!", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
				}
				}
			}
		});
		btnBuy.setFont(new Font("Calibri", Font.PLAIN, 27));
		btnBuy.setBounds(729, 512, 118, 40);
		contentPane.add(btnBuy);
		
		JLabel lblNewLabel_1 = new JLabel("Click to show the Items ");
		lblNewLabel_1.setForeground(new Color(153, 0, 0));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(14, 413, 212, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSpaceship = new JLabel("Spaceship");
		lblSpaceship.setForeground(new Color(0, 0, 0));
		lblSpaceship.setText("Spaceship    Price: $"+ (10000 + 3000 * (farm.getDay() - 5)));
		lblSpaceship.setFont(new Font("Calibri", Font.PLAIN, 28));
		lblSpaceship.setBounds(470, 354, 329, 54);
		contentPane.add(lblSpaceship);
		
		JButton btnNewButton = new JButton("Buy and Win");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(farm.getMoney() >= ship) {
					JOptionPane.showMessageDialog(null, "Conguratulations! You win!", "Conguratulations", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "You don't have enough money!", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnNewButton.setBounds(783, 359, 159, 35);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MainGame();
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 27));
		btnBack.setBounds(729, 574, 118, 40);
		contentPane.add(btnBack);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		setVisible(true);
	}
}
