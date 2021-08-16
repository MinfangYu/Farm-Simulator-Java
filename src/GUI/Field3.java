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

// TODO: To create the field3 frame
/**
 * The Class Field3.
 */
public class Field3 extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Field3() {
		setTitle("Field3");	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 483, 366);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarrot = new JLabel("Carrot");
		lblCarrot.setFont(new Font("Carrot", Font.PLAIN, 30));
		lblCarrot.setBounds(37, 24, 135, 50);
		contentPane.add(lblCarrot);
		
		JLabel lblDay = new JLabel("1 day to harvest:");
		lblDay.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDay.setBounds(37, 171, 215, 42);
		contentPane.add(lblDay);
		
		JLabel label = new JLabel("0");
		label.setText(Store.field3[0] +"");
		label.setFont(new Font("Calibri", Font.PLAIN, 26));
		label.setBounds(250, 108, 97, 42);
		contentPane.add(label);
		
		JLabel lblAlreadyHarvest = new JLabel("Already harvest:");
		lblAlreadyHarvest.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblAlreadyHarvest.setBounds(37, 234, 215, 42);
		contentPane.add(lblAlreadyHarvest);
		
		JLabel label1 = new JLabel("0");
		label1.setText(Store.field3[1] +"");
		label1.setFont(new Font("Calibri", Font.PLAIN, 26));
		label1.setBounds(250, 171, 97, 42);
		contentPane.add(label1);
		
		JLabel lblDaysTo = new JLabel("2 days to harvest:");
		lblDaysTo.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDaysTo.setBounds(37, 108, 215, 42);
		contentPane.add(lblDaysTo);
		
		JLabel label2 = new JLabel("0");
		label2.setText(Store.field3[2] +"");
		label2.setFont(new Font("Calibri", Font.PLAIN, 26));
		label2.setBounds(250, 234, 97, 42);
		contentPane.add(label2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Field6.class.getResource("/image/carrot.png")));
		lblNewLabel.setBounds(198, 24, 72, 70);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}

}
