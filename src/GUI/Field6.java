/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

// TODO: To create the field6 frame
/**
 * The Class Field6.
 */
public class Field6 extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Field6() {
		setTitle("Field6");	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 480);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEggplant = new JLabel("Eggplant");
		lblEggplant.setFont(new Font("Eggplant", Font.PLAIN, 30));
		lblEggplant.setBounds(37, 24, 135, 50);
		contentPane.add(lblEggplant);
		
		JLabel lblDay = new JLabel("1 day to harvest:");
		lblDay.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDay.setBounds(37, 273, 215, 42);
		contentPane.add(lblDay);
		
		JLabel label = new JLabel("0");
		label.setText(Store.field6[0] +"");
		label.setFont(new Font("Calibri", Font.PLAIN, 26));
		label.setBounds(250, 108, 97, 42);
		contentPane.add(label);
		
		JLabel lblAlreadyHarvest = new JLabel("Already harvest:");
		lblAlreadyHarvest.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblAlreadyHarvest.setBounds(37, 328, 215, 42);
		contentPane.add(lblAlreadyHarvest);
		
		JLabel label1 = new JLabel("0");
		label1.setText(Store.field6[1] +"");
		label1.setFont(new Font("Calibri", Font.PLAIN, 26));
		label1.setBounds(250, 163, 97, 42);
		contentPane.add(label1);
		
		JLabel lblDaysTo = new JLabel("2 days to harvest:");
		lblDaysTo.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDaysTo.setBounds(37, 218, 215, 42);
		contentPane.add(lblDaysTo);
		
		JLabel label2 = new JLabel("0");
		label2.setText(Store.field6[2] +"");
		label2.setFont(new Font("Calibri", Font.PLAIN, 26));
		label2.setBounds(250, 218, 97, 42);
		contentPane.add(label2);
		
		JLabel lblDaysTo_1 = new JLabel("3 days to harvest:");
		lblDaysTo_1.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDaysTo_1.setBounds(37, 163, 215, 42);
		contentPane.add(lblDaysTo_1);
		
		JLabel label3 = new JLabel("0");
		label3.setText(Store.field6[3] +"");
		label3.setFont(new Font("Calibri", Font.PLAIN, 26));
		label3.setBounds(250, 273, 97, 42);
		contentPane.add(label3);
		
		JLabel lblDaysTo_2 = new JLabel("4 days to harvest:");
		lblDaysTo_2.setFont(new Font("Calibri", Font.PLAIN, 26));
		lblDaysTo_2.setBounds(37, 108, 215, 42);
		contentPane.add(lblDaysTo_2);
		
		JLabel label4 = new JLabel("0");
		label4.setText(Store.field6[4] +"");
		label4.setFont(new Font("Calibri", Font.PLAIN, 26));
		label4.setBounds(250, 328, 97, 42);
		contentPane.add(label4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Field6.class.getResource("/image/eggplant.png")));
		lblNewLabel.setBounds(198, 24, 72, 70);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}

}
