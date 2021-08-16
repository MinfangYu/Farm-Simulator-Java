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

import game_logic.Farm;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: To create the crops frame
/**
 * The Class CropsFrame.
 */
public class CropsFrame extends JFrame {
	
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
	public CropsFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Crops");
		setBounds(100, 100, 970, 664);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/field.jpg"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		contentPane.setLayout(null);
		
		JButton btnField1 = new JButton("Field1: Cabbage");
		btnField1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Field1();
			}
		});
		btnField1.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField1.setBounds(68, 92, 209, 53);
		contentPane.add(btnField1);
		
		JButton btnField2 = new JButton("Field2: Potato");
		btnField2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Field2();
			}
		});
		btnField2.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField2.setBounds(235, 158, 197, 53);
		contentPane.add(btnField2);
		
		JButton btnField3 = new JButton("Field3: Carrot");
		btnField3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Field3();
			}
		});
		btnField3.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField3.setBounds(375, 271, 180, 53);
		contentPane.add(btnField3);
		
		JButton btnField4 = new JButton("Field4: Corn");
		btnField4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Field4();
			}
		});
		btnField4.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField4.setBounds(493, 337, 161, 53);
		contentPane.add(btnField4);
		
		JButton btnField5 = new JButton("Field5: Garlic");
		btnField5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Field5();
			}
		});
		btnField5.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField5.setBounds(740, 431, 180, 53);
		contentPane.add(btnField5);
		
		JButton btnField6 = new JButton("Field6: Eggplant");
		btnField6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Field6();
			}
		});
		btnField6.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField6.setBounds(730, 512, 210, 53);
		contentPane.add(btnField6);
		
		JButton btnField7 = new JButton("Extra Field7: Pumpkin");
		btnField7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(farm.getTidy() < 70) {
					JOptionPane.showMessageDialog(null, "Go tend your land! You cannot use this field.", "Sorry", JOptionPane.WARNING_MESSAGE);
				}else{
					new Field7();
				}
			}
		});
		btnField7.setFont(new Font("Calibri", Font.ITALIC, 25));
		btnField7.setBounds(607, 102, 258, 53);
		contentPane.add(btnField7);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MainGame();
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnBack.setBounds(84, 521, 128, 44);
		contentPane.add(btnBack);
		
		setVisible(true);
	}
}
