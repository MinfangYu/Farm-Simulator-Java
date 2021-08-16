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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game_logic.Farmer;

// TODO: To create the profile frame
/**
 * The Class Profile.
 */
public class Profile extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The farmer. */
	private Farmer farmer = new Farmer();
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public Profile() {
		setTitle("Profile");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 609);
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
		
		
		JLabel lblNewLabel = new JLabel("Your farmer profile:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		lblNewLabel.setBounds(270, 10, 360, 117);
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
		
		JLabel txtName = new JLabel();
		txtName.setText(farmer.getName());
		System.out.println(farmer.getName());
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Calibri", Font.PLAIN, 29));
		txtName.setBounds(285, 167, 285, 44);
		contentPane.add(txtName);
		
		
		JLabel txtAge = new JLabel();
		txtAge.setText(farmer.getAge());
		txtAge.setForeground(Color.WHITE);
		txtAge.setFont(new Font("Calibri", Font.PLAIN, 29));
		txtAge.setBounds(285, 234, 164, 44);
		contentPane.add(txtAge);
		
		JLabel lblSkillText = new JLabel();
		if(farmer.getSkill() == 0) {
			lblSkillText.setText("Hardworking farmer");
		}
		else if(farmer.getSkill() == 1) {
			lblSkillText.setText("Animal speaking");
		}
		else if(farmer.getSkill() == 2) {
			lblSkillText.setText("Born in purple");
		}
		
		lblSkillText.setForeground(Color.WHITE);
		lblSkillText.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblSkillText.setBounds(285, 304, 295, 44);
		
		JLabel lblPhoto1 = new JLabel("");
		lblPhoto1.setIcon(new ImageIcon(FarmerFrame.class.getResource("/image/"+farmer.getAvatar()+".png")));
		lblPhoto1.setBounds(285, 366, 242, 179);
		
		contentPane.add(lblPhoto1);
		
		contentPane.add(lblSkillText);
		
		
		setVisible(true);
	}

}
