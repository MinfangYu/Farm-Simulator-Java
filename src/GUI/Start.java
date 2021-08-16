/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;
import java.awt.BorderLayout; 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

import javax.swing.*;

import game_logic.Farm;

// TODO: Let player choose the number of days
/**
 * The Class Start.
 */
public class Start extends JFrame{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The farm. */
	private Farm farm = new Farm();
	

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public Start() {
		this.setTitle("Start the Game");
		getContentPane().setLayout(new BorderLayout());
		this.setSize(600, 480);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/background.jpg"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));

		
		JPanel txtPanel = new JPanel();
		txtPanel.setOpaque(false);
		JLabel lblTitle= new JLabel("Avengers: Home Sickness");
		lblTitle.setFont(new Font("Calibri",Font.BOLD, 50));
		txtPanel.add(lblTitle);
		txtPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,37));
		getContentPane().add(txtPanel, BorderLayout.NORTH); 
		
		JPanel choosePanel = new JPanel();
		choosePanel.setOpaque(false);
		JLabel lblChoose= new JLabel("How many days would you like the game last:");
		lblChoose.setFont(new Font("Calibri",Font.BOLD, 29));
		JComboBox<Integer> combChoose = new JComboBox<Integer>();
		combChoose.setFont(new Font("Calibri",Font.BOLD, 29));
		combChoose.addItem(5);
		combChoose.addItem(6);
		combChoose.addItem(7);
		combChoose.addItem(8);
		combChoose.addItem(9);
		combChoose.addItem(10);
		choosePanel.add(lblChoose);
		choosePanel.add(combChoose);
		choosePanel.setLayout(new FlowLayout(FlowLayout.CENTER,15,7));
		getContentPane().add(choosePanel, BorderLayout.CENTER);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setOpaque(false);
	    JButton btnStart=new JButton("Start new game");
	    btnStart.setFont(new Font("Calibri",Font.PLAIN, 26));
	    btnPanel.add(btnStart);
	    btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				farm.setDay((int) combChoose.getSelectedItem());
				setVisible(false);
				new FarmerFrame();
			}
		});
	    btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER,50,50)); 
	    getContentPane().add(btnPanel, BorderLayout.SOUTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

