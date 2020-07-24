package eg.edu.alexu.csd.oop.draw;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ForGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForGame window = new ForGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ForGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0 , 0 , Toolkit.getDefaultToolkit().getScreenSize().width , Toolkit.getDefaultToolkit().getScreenSize().height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setLayout(null);
		
		Color color = new Color(0,0,0,50);
		
		JLabel lblNewLabel = new JLabel("easy");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(color);
		lblNewLabel.setBounds(685, 218, 56, 16);
		lblNewLabel.setOpaque(true);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("medium");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(color);
		lblNewLabel_1.setBounds(685, 318, 56, 16);
		lblNewLabel_1.setOpaque(true);

		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(color);
		lblNewLabel_2.setBounds(685, 426, 56, 16);
		lblNewLabel_2.setOpaque(true);

		frame.getContentPane().add(lblNewLabel_2);
				        
        
		frame.setUndecorated(false);
		frame.setVisible(true);
		
	}
}
