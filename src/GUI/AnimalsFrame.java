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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

// TODO: To create the animal frame
/**
 * The Class AnimalsFrame.
 */
public class AnimalsFrame extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public AnimalsFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Animals");
		setBounds(100, 100, 970, 664);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/image2.png"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		contentPane.setLayout(null);
		
		JButton btnChicken = new JButton("Chicken");
		btnChicken.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ChickenHouse();
			}
		});
		btnChicken.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnChicken.setBounds(418, 246, 138, 47);
		contentPane.add(btnChicken);
		
		JButton btnTurkey = new JButton("Turkey");
		btnTurkey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new TurkeyHouse();
			}
		});
		btnTurkey.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnTurkey.setBounds(562, 316, 138, 47);
		contentPane.add(btnTurkey);
		
		JButton btnSheep = new JButton("Sheep");
		btnSheep.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SheepHouse();
			}
		});
		btnSheep.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnSheep.setBounds(299, 372, 138, 47);
		contentPane.add(btnSheep);
		
		JButton btnCow = new JButton("Cow");
		btnCow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new CowHouse();
			}
		});
		btnCow.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnCow.setBounds(739, 97, 138, 47);
		contentPane.add(btnCow);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MainGame();
				setVisible(false);
			}
		});
		btnBack.setBackground(new Color(240, 240, 240));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnBack.setBounds(776, 548, 138, 47);
		contentPane.add(btnBack);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		setVisible(true); 
	}
}
