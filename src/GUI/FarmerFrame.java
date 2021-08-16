/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game_logic.Farm;
import game_logic.Farmer;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: To create the farmer choose frame
/**
 * The Class FarmerFrame.
 */
public class FarmerFrame extends JFrame {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The farmer name. */
	private String farmer_name = "";
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The text name. */
	private JTextField txtName;
	
	/** The text age. */
	private JTextField txtAge;
	
	/** The index. */
	private int index=1;
	
	/** The farmer. */
	private Farmer farmer = new Farmer();
	
	/** The farm. */
	private Farm farm = new Farm();
	
	/**
	 * Checks if is alpha.
	 *
	 * @param name the name
	 * @return true, if is alpha
	 */
	public boolean isAlpha(String name) {
		return name.matches("[a-zA-Z]+");
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public FarmerFrame() {
		setTitle("Choose your farmer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 664);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/background2.png"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Choose your farmer:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		lblNewLabel.setBounds(293, 13, 360, 117);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Calibri", Font.BOLD, 29));
		lblName.setBounds(186, 161, 108, 60);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(0, 0, 0));
		lblAge.setFont(new Font("Calibri", Font.BOLD, 29));
		lblAge.setBounds(186, 226, 108, 60);
		contentPane.add(lblAge);
		
		JLabel lblSkill = new JLabel("Skill:");
		lblSkill.setForeground(new Color(0, 0, 0));
		lblSkill.setFont(new Font("Calibri", Font.BOLD, 29));
		lblSkill.setBounds(186, 296, 108, 60);
		contentPane.add(lblSkill);
		
		JLabel lblAvatar = new JLabel("Avatar:");
		lblAvatar.setForeground(new Color(0, 0, 0));
		lblAvatar.setFont(new Font("Calibri", Font.BOLD, 29));
		lblAvatar.setBounds(186, 392, 108, 60);
		contentPane.add(lblAvatar);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(0, 0, 0));
		txtName.setFont(new Font("Calibri", Font.PLAIN, 29));
		txtName.setBounds(285, 167, 285, 44);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Calibri", Font.PLAIN, 29));
		txtAge.setBounds(285, 234, 164, 44);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(new Color(0, 0, 153));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Hardworking farmer", "Animal speaking", "Born in purple"}));
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 29));
		comboBox.setBounds(285, 304, 295, 44);
		
		JButton btnNext = new JButton("next");
		btnNext.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNext.setBounds(559, 465, 76, 44);
		contentPane.add(btnNext);
		
		JLabel lblPhoto1 = new JLabel("");
		lblPhoto1.setIcon(new ImageIcon(FarmerFrame.class.getResource("/image/1.png")));
		lblPhoto1.setBounds(285, 396, 242, 179);
		
		btnNext.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	index++;
	            if(index > 6) {
	            	index = 1;
	            	lblPhoto1.setIcon(new ImageIcon(FarmerFrame.class.getResource("/image/"+index+".png")));
	            }
	            else {
	            	lblPhoto1.setIcon(new ImageIcon(FarmerFrame.class.getResource("/image/"+index+".png")));
	            }
            }
            
        });
		
		contentPane.add(lblPhoto1);
		
		JLabel lblRequire = new JLabel("<html>The length of the name must be between 3 and 15 characters and  must not include numbers or special characters.</html>");
		lblRequire.setForeground(new Color(204, 0, 0));
		lblRequire.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 24));
		lblRequire.setBounds(604, 128, 333, 120);
		contentPane.add(lblRequire);
		
		JButton btnConfirm = new JButton("Confirm");
		
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				farmer.setAge(txtAge.getText());
				farmer.setName(txtName.getText());
				farmer.setAvatar(index);
				farmer.setSkill(comboBox.getSelectedIndex());
				farmer_name = txtName.getText();
				if(farmer_name.length() > 15 || farmer_name.length() < 3 || isAlpha(farmer_name) != true) {
					farmer_name = txtName.getText();
					JOptionPane.showMessageDialog(null, "That is not a name!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else if(txtAge.getText().trim().equals("")||txtAge.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Age cannot be empty!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else {
					
					if(farmer.getSkill() == 2) {
						farm.setMoney(575);
					}
					new ChooseTypes();
					setVisible(false);
				}
			}
		});
		btnConfirm.setFont(new Font("Calibri", Font.BOLD, 28));
		btnConfirm.setBounds(765, 492, 150, 60);
		contentPane.add(btnConfirm);
		
		JLabel lblHardwoking = new JLabel("<html>You are a hardworking man. Your crops will harvest 15% more than other farmers. Every time you harvest, you will earn 15% more money.</html>");
		lblHardwoking.setForeground(Color.BLUE);
		lblHardwoking.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblHardwoking.setBounds(610, 279, 334, 117);
		
		contentPane.add(lblHardwoking);
		
		JLabel lblAnimalSpeaker = new JLabel("<html>You can speak with your animals while playing with them. Whenever you play with your animal, their happiness rises doubled.</html>");
		lblAnimalSpeaker.setForeground(Color.BLUE);
		lblAnimalSpeaker.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblAnimalSpeaker.setBounds(610, 279, 334, 117);
		lblAnimalSpeaker.setVisible(false);
		contentPane.add(lblAnimalSpeaker);
		
		JLabel lblBorn = new JLabel("<html>You are from a royal family and you have inherited 15% more money from them at the beginning.</html>");
		lblBorn.setForeground(Color.BLUE);
		lblBorn.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		lblBorn.setBounds(610, 279, 334, 117);
		lblBorn.setVisible(false);
		contentPane.add(lblBorn);
		
		comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(comboBox.getSelectedIndex() == 0) {
        			lblHardwoking.setVisible(true);
        			lblBorn.setVisible(false);
        			lblAnimalSpeaker.setVisible(false);
        		}
        		else if(comboBox.getSelectedIndex() == 1) {
        			lblAnimalSpeaker.setVisible(true);
        			lblHardwoking.setVisible(false);
        			lblBorn.setVisible(false);
        		}
        		else if(comboBox.getSelectedIndex() == 2) {
        			lblBorn.setVisible(true);
        			lblAnimalSpeaker.setVisible(false);
        			lblHardwoking.setVisible(false);
        		}
            }
        });
		
		contentPane.add(comboBox);
		
		
		setVisible(true);
	}
}

