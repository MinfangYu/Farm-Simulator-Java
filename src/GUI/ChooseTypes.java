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

import game_logic.Farm;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: To create the farm type choose frame
/**
 * The Class ChooseTypes.
 */
public class ChooseTypes extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The farm. */
	private Farm farm = new Farm();
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	@SuppressWarnings("deprecation")
	public ChooseTypes() {
		setTitle("Choose types of farm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 664);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/background2.png"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		JLabel lblNewLabel = new JLabel("Select the type of farm you would like to own:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		lblNewLabel.setBounds(88, 13, 794, 69);
		contentPane.add(lblNewLabel);
		
		JButton btnTimeFastenFarm = new JButton("Time fasten farm");
		btnTimeFastenFarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				farm.setType(0);
				farm.setDay(farm.getDay() * 2);
				new GiveName();
				setVisible(false);
			}
		});
		btnTimeFastenFarm.setBackground(UIManager.getColor("Button.background"));
		btnTimeFastenFarm.setFont(new Font("Calibri", Font.BOLD, 28));
		btnTimeFastenFarm.setBounds(108, 124, 250, 69);
		contentPane.add(btnTimeFastenFarm);
		
		JButton btnHappyFarm = new JButton("Happy Farm");
		btnHappyFarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				farm.setType(1);
				new GiveName();
				setVisible(false);
			}
		});
		btnHappyFarm.setFont(new Font("Calibri", Font.BOLD, 28));
		btnHappyFarm.setBounds(587, 124, 250, 69);
		contentPane.add(btnHappyFarm);
		
		JButton btnOrganicFarm = new JButton("Organic Farm");
		btnOrganicFarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				farm.setType(2);
				new GiveName();
				setVisible(false);
			}
		});
		btnOrganicFarm.setFont(new Font("Calibri", Font.BOLD, 28));
		btnOrganicFarm.setBounds(108, 382, 250, 69);
		contentPane.add(btnOrganicFarm);
		
		JButton btnRichFarm = new JButton("Toney Farm");
		btnRichFarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				farm.setType(3);
				farm.setMoney(farm.getMoney() * 5);
				new GiveName();
				setVisible(false);
			}
		});
		btnRichFarm.setFont(new Font("Calibri", Font.BOLD, 28));
		btnRichFarm.setBounds(587, 382, 250, 69);
		contentPane.add(btnRichFarm);
		
		JLabel lblTimeFastenFarm = new JLabel("<html>In this farm, time is twice faster than the outside. You have doule days. You have 10 days if you choose 5 days.</html>");
		lblTimeFastenFarm.setForeground(Color.WHITE);
		lblTimeFastenFarm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		lblTimeFastenFarm.setBounds(45, 206, 391, 78);
		contentPane.add(lblTimeFastenFarm);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Evryone in this farm feels happier including the animals. Whenever you play with your animal, their happiness rises doubled.</html>");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(552, 203, 350, 112);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>The soil is more fertilized, so the crops are organic and the selling price are doubled when harvest.</html>");
		lblNewLabel_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(45, 464, 391, 81);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html>The farm is inherited from Iron Man, so the starting money will be 5 times mroe than other farms.</html>");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_3.setBounds(552, 465, 350, 78);
		contentPane.add(lblNewLabel_3);
		
		setVisible(true);
	}
}
