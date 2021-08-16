/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

// TODO: To create the field1 frame
/**
 * The Class Field1.
 */
public class Field1 extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The lbl cabbage. */
	public JLabel lblCabbage;
	
	/** The label. */
	public JLabel label;
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Field1() {
		setTitle("Field1");	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 482, 348);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCabbage = new JLabel("Cabbage");
		lblCabbage.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblCabbage.setBounds(37, 24, 135, 50);
		contentPane.add(lblCabbage);
		
		JLabel lblDay = new JLabel("1 day to harvest:");
		lblDay.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDay.setBounds(37, 108, 215, 42);
		contentPane.add(lblDay);
		
		JLabel label = new JLabel("");
		label.setText(Store.field1[0] +"");
		label.setFont(new Font("Calibri", Font.PLAIN, 26));
		label.setBounds(250, 108, 97, 42);
		contentPane.add(label);
		
		JLabel lblAlreadyHarvest = new JLabel("Already harvest:");
		lblAlreadyHarvest.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblAlreadyHarvest.setBounds(37, 171, 215, 42);
		contentPane.add(lblAlreadyHarvest);
		
		JLabel label1 = new JLabel("0");
		label1.setText(Store.field1[1] +"");
		label1.setFont(new Font("Calibri", Font.PLAIN, 26));
		label1.setBounds(250, 171, 97, 42);
		contentPane.add(label1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Field6.class.getResource("/image/cabbage.png")));
		lblNewLabel.setBounds(198, 24, 72, 70);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}
	

}
