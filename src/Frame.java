import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;

public class Frame extends JFrame {

	private JPanel contentPane;
	int pokusaji = 10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setForeground(new Color(0, 0, 139));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(10, 150));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 255), new Color(25, 25, 112)));
		panel.setBackground(new Color(0, 0, 128));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("7");
		lblNewLabel.setBounds(65, 5, 100, 100);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setPreferredSize(new Dimension(100, 100));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Raanana", Font.PLAIN, 48));
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("7");
		label.setBounds(170, 5, 100, 100);
		label.setForeground(new Color(255, 255, 255));
		label.setPreferredSize(new Dimension(100, 100));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Raanana", Font.PLAIN, 48));
		panel.add(label);
		
		JLabel label_1 = new JLabel("7");
		label_1.setBounds(275, 5, 100, 100);
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setPreferredSize(new Dimension(100, 100));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Raanana", Font.PLAIN, 48));
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(155, 162, 130, 100);
		panel_1.setPreferredSize(new Dimension(130, 100));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(98, 102, 29, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(204, 102, 29, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(312, 102, 29, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JLabel lblPokusaji = new JLabel("Pokušaji: 10");
		lblPokusaji.setForeground(new Color(255, 255, 255));
		lblPokusaji.setBounds(22, 23, 89, 16);
		panel_1.add(lblPokusaji);
		
		JButton btnNewButton = new JButton("Igraj");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int slot1 = Integer.parseInt(lblNewLabel.getText());
				int slot2 = Integer.parseInt(label.getText());
				int slot3 = Integer.parseInt(label_1.getText());
				
				if (chckbxNewCheckBox.isSelected() && !chckbxNewCheckBox_1.isSelected() && !chckbxNewCheckBox_2.isSelected()) {
					slot2 = (int) (Math.random() * 9) + 1;
					slot3 = (int) (Math.random() * 9) + 1;
				} else if (chckbxNewCheckBox_1.isSelected() && !chckbxNewCheckBox.isSelected() && !chckbxNewCheckBox_2.isSelected()) {
					slot1 = (int) (Math.random() * 9) + 1;
					slot3 = (int) (Math.random() * 9) + 1;
				} else if (chckbxNewCheckBox_2.isSelected() && !chckbxNewCheckBox_1.isSelected() && !chckbxNewCheckBox.isSelected()) {
					slot1 = (int) (Math.random() * 9) + 1;
					slot2 = (int) (Math.random() * 9) + 1; 
				} else if (chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && !chckbxNewCheckBox_2.isSelected()) {
					slot3 = (int) (Math.random() * 9) + 1;
				} else if (chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_2.isSelected() && !chckbxNewCheckBox_1.isSelected()) {
					slot2 = (int) (Math.random() * 9) + 1; 
				} else if (chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected() && !chckbxNewCheckBox.isSelected()) {
					slot1 = (int) (Math.random() * 9) + 1; 
				} else if (chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_2.isSelected()) {
					
				} else {
					slot1 = (int) (Math.random() * 9) + 1;
					slot2 = (int) (Math.random() * 9) + 1;
					slot3 = (int) (Math.random() * 9) + 1;
				}
				
				lblNewLabel.setText(String.valueOf(slot1));
				label.setText(String.valueOf(slot2));
				label_1.setText(String.valueOf(slot3));
				
				if (slot1 == slot2 && slot2 == slot3) {
					switch(slot1) {
					case 1:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Muzej Iluzija!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Muzej Afričke Umjetnosti!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Muzej Jugoslavije!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Narodni Muzej!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Pozorište na terazijama!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 6:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Cineplexx!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 7:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste karte za Fontana Bioskop!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 8:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste antistres lopticu!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					case 9:
						JOptionPane.showMessageDialog(null, "Čestitamo! Osvojili ste hemijsku olovku!", "CESTITAMO", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					default:
						break;
					}
				}
				
				pokusaji -= 1;
				lblPokusaji.setText("Pokušaji: " + String.valueOf(pokusaji));
				if (pokusaji == 0) {
					JOptionPane.showMessageDialog(null, "Osvojili ste naljepnicu :(", "Stety", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setPreferredSize(new Dimension(80, 20));
		btnNewButton.setBounds(6, 65, 117, 29);
		panel_1.add(btnNewButton);
	}
}
