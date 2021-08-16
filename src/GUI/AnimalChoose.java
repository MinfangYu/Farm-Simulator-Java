/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game_logic.Chicken;
import game_logic.Cow;
import game_logic.Sheep;
import game_logic.Turkey;

// TODO: To create the animal choose frame
/**
 * The Class AnimalChoose.
 */
public class AnimalChoose extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;
	
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
	public AnimalChoose() {
		setTitle("Choose a animal type");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 527, 311);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please choose an animal type to play with:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblNewLabel.setBounds(20, 43, 469, 56);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 26));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Chicken\t", "Turkey\t", "Sheep\t", "Cow\t"}));
		comboBox.setBounds(145, 109, 130, 39);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(comboBox.getSelectedIndex() == 0 ) {
					chicken.playAnimals();
					for(int i = 0; i < 5; i++) {
						if(Store.chicken[i] != "") {
							Store.chickenList.get(i).playAnimals();
							Store.chicken[i] = Store.chickenList.get(i).toString();
						}
					}
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 1 ) {
					turkey.playAnimals();
					for(int i = 0; i < 5; i++) {
						if(Store.turkey[i] != "") {
							Store.turkeyList.get(i).playAnimals();
							Store.turkey[i] = Store.turkeyList.get(i).toString();
						}
					}
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 2 ) {
					sheep.playAnimals();
					for(int i = 0; i < 5; i++) {
						if(Store.sheep[i] != "") {
							Store.sheepList.get(i).playAnimals();
							Store.sheep[i] = Store.sheepList.get(i).toString();
						}
					}
					setVisible(false);
				}
				else if(comboBox.getSelectedIndex() == 3 ) {
					cow.playAnimals();
					for(int i = 0; i < 5; i++) {
						if(Store.cow[i] != "") {
							Store.cowList.get(i).playAnimals();
							Store.cow[i] = Store.cowList.get(i).toString();
						}
					}
					setVisible(false);
			    }
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 23));
		btnNewButton.setBounds(325, 182, 119, 39);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}

}
