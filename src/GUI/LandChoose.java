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
import game_logic.Corn;
import game_logic.Eggplant;
import game_logic.Garlic;
import game_logic.Potato;
import game_logic.Pumpkin;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: To create the choose land frame
/**
 * The Class LandChoose.
 */
public class LandChoose extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
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
	
	/** The content pane. */
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public LandChoose() {
		setTitle("Choose a land");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 310);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please choose a crop to water:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblNewLabel.setBounds(39, 45, 328, 56);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 26));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Cabbage\t", "Potato\t", "Carrot\t", "Corn\t", "Garlic\t", "Eggplant", "Pumpkin"}));
		comboBox.setBounds(135, 111, 130, 39);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(comboBox.getSelectedIndex() == 0) {
					cabbage.waterCrops();
					int oneDay1 = Store.field1[0];
					Store.field1[1] += oneDay1;
					Store.field1[0] = 0;
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 1) {
					potato.waterCrops();
					int twoDay1 = Store.field2[0];
					int twoDay2 = Store.field2[1];
					Store.field2[2] += twoDay2;
					Store.field2[1] = twoDay1;
					Store.field2[0] = 0;
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 2) {
					carrot.waterCrops();
					int threeDay1 = Store.field3[0];
					int threeDay2 = Store.field3[1];
					Store.field3[2] += threeDay2;
					Store.field3[1] = threeDay1;
					Store.field3[0] = 0;
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 3) {
					corn.waterCrops();
					int fourDay1 = Store.field4[0];
					int fourDay2 = Store.field4[1];
					int fourDay3 = Store.field4[2];
					Store.field4[3] += fourDay3;
					Store.field4[2] = fourDay2;
					Store.field4[1] = fourDay1;
					Store.field4[0] = 0;
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 4) {
					garlic.waterCrops();
					int fiveDay1 = Store.field5[0];
					int fiveDay2 = Store.field5[1];
					int fiveDay3 = Store.field5[2];
					Store.field5[3] += fiveDay3;
					Store.field5[2] = fiveDay2;
					Store.field5[1] = fiveDay1;
					Store.field5[0] = 0;
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 5) {
					eggplant.waterCrops();
					int sixDay1 = Store.field6[0];
					int sixDay2 = Store.field6[1];
					int sixDay3 = Store.field6[2];
					int sixDay4 = Store.field6[3];
					Store.field6[4] += sixDay4;
					Store.field6[3] = sixDay3;
					Store.field6[2] = sixDay2;
					Store.field6[1] = sixDay1;
					Store.field6[0] = 0;
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 6) {
					pumpkin.waterCrops();
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
					setVisible(false);
				}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 23));
		btnNewButton.setBounds(295, 188, 119, 39);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}
}
