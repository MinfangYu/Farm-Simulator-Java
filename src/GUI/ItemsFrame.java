/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

// TODO: To create the items frame
/**
 * The Class ItemsFrame.
 */
public class ItemsFrame extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public ItemsFrame() {
		setTitle("Items");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 857, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><body>1. Normal Stark Fertilizer $20<br>\r\n    A normal type of fertilizer from Stark industry, it makes all crops grow 2 days faster.<br>\r\n2. Premium Stark Fertilizer $100<br>\r\n    A better fertilizer designed for premium customers of the Stark industry. Crops grow 3 day faster.<br>\r\n3. Super Stark Fertilizer $1,800<br>\t\r\n    An astonishing fertilizer designed by Tony Stark himself, it also contains alien technology and will make the crops grow 10 days.<br>\r\n4. Normal Alien Animal Food $50<br>\r\n    A type of alien animal food that all animals love. It will add 5 health to all animals in the farm.<br>\r\n5. Premium Alien Animal Food $300<br>\r\n    A better animal food from deep space that add 15 health each time.<br>\r\n6. Magic Alien Animal Food $5,000<br>\r\n    A magic animal food found by DR. Strange in his time travel. It will feed all animals with Full health instantly.</body></html>");
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel.setBounds(14, 13, 803, 497);
		contentPane.add(lblNewLabel);
		setVisible(true);
	}
}
