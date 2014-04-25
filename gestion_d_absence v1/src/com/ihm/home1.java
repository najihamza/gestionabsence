 package com.ihm;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class home1 extends JFrame {

	private JPanel contentPane;
	ImageIcon one = new ImageIcon("images/one.jpg");
	ImageIcon tow = new ImageIcon("images/tow.jpg");
	ImageIcon tree = new ImageIcon("images/tree.jpg");
	ImageIcon four = new ImageIcon("images/four.jpg");
	ImageIcon logos = new ImageIcon("images/logo.png");

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					home1 frame = new home1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public home1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Dimension dim = GuiTools.getDimScreen();
		setSize((dim.width / 2 )+(dim.width / 4)  , (dim.height /2)+(dim.height / 3)+(dim.height / 9));
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 30, 30, 0, 0};
//		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
//		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblLogo = new JLabel(logos);
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 0;
		gbc_lblLogo.gridy = 0;
		gbc_lblLogo.gridwidth = 1;
		panel.add(lblLogo, gbc_lblLogo);
		
		JLabel lblBienvenu = new JLabel("bienvenu");
		GridBagConstraints gbc_lblBienvenu = new GridBagConstraints();
		gbc_lblBienvenu.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenu.gridx =21;
		gbc_lblBienvenu.gridy = 0;
		panel.add(lblBienvenu, gbc_lblBienvenu);
		
		JLabel lblRachidWazani = new JLabel("rachid wazani");
		GridBagConstraints gbc_lblRachidWazani = new GridBagConstraints();
		gbc_lblRachidWazani.insets = new Insets(0, 0, 5, 0);
		gbc_lblRachidWazani.gridx =23;
		gbc_lblRachidWazani.gridy = 0;
		panel.add(lblRachidWazani, gbc_lblRachidWazani);
		
		JLabel lblNewLabel = new JLabel(one);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 8;
		gbc_lblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(tow);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 9;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(tree);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 8;
		gbc_lblNewLabel_2.gridy = 5;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(four);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 9;
		gbc_lblNewLabel_3.gridy = 5;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblEcoleNationaleDes = new JLabel("Ecole Nationale des Sciences Appliqu\\u00E9es El Hoceima");
		GridBagConstraints gbc_lblEcoleNationaleDes = new GridBagConstraints();
		gbc_lblEcoleNationaleDes.insets = new Insets(0, 0, 0, 5);
		gbc_lblEcoleNationaleDes.gridx = 12;
		gbc_lblEcoleNationaleDes.gridy = 20;
		panel.add(lblEcoleNationaleDes, gbc_lblEcoleNationaleDes);
		
		
		
		
		
		
		
		
		
		
		
	}

}
