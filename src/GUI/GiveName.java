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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: To create the farm name choose frame
/**
 * The Class GiveName.
 */
public class GiveName extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The text name. */
	private JTextField txtName;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public GiveName() {
		setTitle("Give farm a name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon background = new ImageIcon(this.getClass().getResource("/image/background.jpg"));
		JLabel label=new JLabel(background);
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		JPanel imagePanel=(JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		
		JLabel lblGive = new JLabel("Give your farm a name:");
		lblGive.setFont(new Font("Calibri", Font.BOLD, 32));
		lblGive.setBounds(118, 44, 353, 60);
		contentPane.add(lblGive);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Calibri", Font.PLAIN, 29));
		txtName.setBounds(74, 135, 437, 72);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtName.getText().trim().equals("")||txtName.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "That is not a name!", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else {
					setVisible(false);
	                new MainGame();
				}
			}
		});
		btnSubmit.setBackground(UIManager.getColor("Button.background"));
		btnSubmit.setFont(new Font("Calibri", Font.BOLD, 26));
		btnSubmit.setBounds(202, 264, 142, 60);
		contentPane.add(btnSubmit);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		setVisible(true);
	}
}
