/** 
* @author : wli91, myu40
* @version 1.0 
*/
package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: Start the game
/**
 * The Class Story.
 */
public class Story extends JFrame {

	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The content pane. */
	private JPanel contentPane;


	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story frame = new Story();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Story() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Story beginning");
		setSize(719, 563);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				new Start();
			}
		});
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("<html>Thanos did exactly what he said he was going to do. He wiped out fifty percent of all living creatures by snapped his fingers. But you are lucky. You were just accidentally teleported to a strange planet and granted a visitor\u2019s visa by the locals. What you have in your hand is nothing but a Mirco-Farm. To return to the earth, you need to buy the spaceship from the store. However, the locals are very greedy. The price of the spaceship will be higher if you stay longer on the planet. Your goal is to earn the enough money through the farm in a limited time and buy the spaceship to go back home. Remember your families are waiting for you\u2026\u2026</html>");
		lbl1.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		lbl1.setForeground(Color.WHITE);
		lbl1.setBounds(29, 26, 653, 366);
		contentPane.add(lbl1);
		
		JLabel lblClickToNext = new JLabel("Click to start");
		lblClickToNext.setFont(new Font("Calibri", Font.ITALIC, 20));
		lblClickToNext.setForeground(new Color(255, 255, 0));
		lblClickToNext.setBounds(260, 411, 125, 43);
		contentPane.add(lblClickToNext);
		
	}
}
