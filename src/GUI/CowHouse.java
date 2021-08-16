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

// TODO: To create the cow frame
/**
 * The Class CowHouse.
 */
public class CowHouse extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CowHouse() {
		setTitle("Cow House");	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 523, 518);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCow = new JLabel("Cow");
		lblCow.setFont(new Font("Cow", Font.PLAIN, 30));
		lblCow.setBounds(37, 24, 135, 50);
		contentPane.add(lblCow);
		
		JLabel lbl_0 = new JLabel("");
		lbl_0.setText(Store.cow[0]);
		lbl_0.setFont(new Font("Calibri", Font.PLAIN, 26));
		lbl_0.setBounds(37, 123, 428, 42);
		contentPane.add(lbl_0);
		
		JLabel lbl1_1 = new JLabel("");
		lbl1_1.setText(Store.cow[1]);
		lbl1_1.setFont(new Font("Calibri", Font.PLAIN, 26));
		lbl1_1.setBounds(37, 175, 428, 42);
		contentPane.add(lbl1_1);
		
		JLabel lbl1_2 = new JLabel("");
		lbl1_2.setText(Store.cow[2]);
		lbl1_2.setFont(new Font("Calibri", Font.PLAIN, 26));
		lbl1_2.setBounds(37, 241, 428, 42);
		contentPane.add(lbl1_2);
		
		JLabel lbl1_3 = new JLabel("");
		lbl1_3.setText(Store.cow[3]);
		lbl1_3.setFont(new Font("Calibri", Font.PLAIN, 26));
		lbl1_3.setBounds(37, 312, 428, 42);
		contentPane.add(lbl1_3);
		
		JLabel lbl1_4 = new JLabel("");
		lbl1_4.setText(Store.cow[4]);
		lbl1_4.setFont(new Font("Calibri", Font.PLAIN, 26));
		lbl1_4.setBounds(37, 388, 428, 42);
		contentPane.add(lbl1_4);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon(SheepHouse.class.getResource("/image/cow.png")));
		lblPicture.setBounds(171, 10, 144, 97);
		contentPane.add(lblPicture);
		
		setVisible(true);
	}

}
