package com.ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class home2  extends JFrame{
	ImageIcon one = new ImageIcon("images/one.jpg");
	ImageIcon tow = new ImageIcon("images/tow.jpg");
	ImageIcon tree = new ImageIcon("images/tree.jpg");
	ImageIcon four = new ImageIcon("images/four.jpg");
	ImageIcon logos = new ImageIcon("images/logo.png");
	private JPanel contentPane;
	
	public home2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = GuiTools.getDimScreen();
		setSize((dim.width / 2 )+(dim.width / 4)  , (dim.height /2)+(dim.height / 3)+(dim.height / 9));
//		setResizable(false);
	/***************************************************************************/

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel north = new JPanel();
		contentPane.add(north, BorderLayout.NORTH);
		GridBagLayout gbl_north = new GridBagLayout();
		gbl_north.columnWidths = new int[] {0, 6, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 0};
		gbl_north.rowHeights = new int[]{0, 0};
		gbl_north.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		gbl_north.rowWeights = new double[]{0.0, Double.MIN_VALUE};
	north.setLayout(gbl_north);
		
		JLabel logo = new JLabel(logos);
		GridBagConstraints gbc_logo = new GridBagConstraints();
		gbc_logo.anchor = GridBagConstraints.SOUTHEAST;
		gbc_logo.insets = new Insets(0, 0, 0, 5);
		gbc_logo.gridx = 0;
		gbc_logo.gridy = 0;
		gbc_logo.gridwidth = 2;
		north.add(logo, gbc_logo);
		
		JLabel bienvenu = new JLabel("bienvenu");
		bienvenu.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_bienvenu = new GridBagConstraints();
		gbc_bienvenu.anchor = GridBagConstraints.NORTHEAST;
		gbc_bienvenu.insets = new Insets(0, 0, 0, 5);
		gbc_bienvenu.gridx = 21;
		gbc_bienvenu.gridy = 0;
		gbc_bienvenu.gridwidth = 2;
		north.add(bienvenu, gbc_bienvenu);
		
		JLabel login = new JLabel("Rachid wazaani");
		login.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_login = new GridBagConstraints();
		gbc_login.gridwidth = 2;
		gbc_login.anchor = GridBagConstraints.NORTH;
		gbc_login.gridx = 23;
		gbc_login.gridy = 0;
		gbc_login.gridwidth = 2;
		north.add(login, gbc_login);
		
		JPanel center = new JPanel();
		contentPane.add(center, BorderLayout.CENTER);
		GridBagLayout gbl_center = new GridBagLayout();
		gbl_center.columnWidths = new int[] {6, 6, 30, 30, 30, 30, 30, 0, 0, 0};
		gbl_center.rowHeights = new int[] {6, 6, 30, 30, 30, 30, 0, 0, 0};
		gbl_center.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_center.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		 
		center.setLayout(gbl_center);
		
		JLabel gestion_etudiant = new JLabel(one);
		GridBagConstraints gbc_gestion_etudiant = new GridBagConstraints();
		gbc_gestion_etudiant.insets = new Insets(0, 0, 5, 5);
		gbc_gestion_etudiant.gridx = 7;
		gbc_gestion_etudiant.gridy = 6;
		gbc_gestion_etudiant.gridwidth = 2;
		gbc_gestion_etudiant.fill = GridBagConstraints.BOTH;
		center.add(gestion_etudiant, gbc_gestion_etudiant);
		
		JLabel lblGestionDabsence = new JLabel(tow);
		GridBagConstraints gbc_lblGestionDabsence = new GridBagConstraints();
		gbc_lblGestionDabsence.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionDabsence.gridx = 8;
		gbc_lblGestionDabsence.gridy = 6;
		gbc_lblGestionDabsence.gridwidth = 2;
		gbc_lblGestionDabsence.fill = GridBagConstraints.BOTH;
		center.add(lblGestionDabsence, gbc_lblGestionDabsence);
		
		JLabel lblStatistiques = new JLabel(tree);
		GridBagConstraints gbc_lblStatistiques = new GridBagConstraints();
		gbc_lblStatistiques.insets = new Insets(0, 0, 0, 5);
		gbc_lblStatistiques.gridx = 7;
		gbc_lblStatistiques.gridy = 7;
		gbc_lblStatistiques.gridwidth =2;
		gbc_lblStatistiques.fill = GridBagConstraints.BOTH;
		
		center.add(lblStatistiques, gbc_lblStatistiques);
		
		JLabel lblGestionDeCompte = new JLabel(four);
		GridBagConstraints gbc_lblGestionDeCompte = new GridBagConstraints();
		gbc_lblGestionDeCompte.gridx = 8;
		gbc_lblGestionDeCompte.gridy = 7;
		gbc_lblGestionDeCompte.gridwidth = 2;
		gbc_lblGestionDeCompte.fill = GridBagConstraints.BOTH;
		center.add(lblGestionDeCompte, gbc_lblGestionDeCompte);
		
		JPanel south = new JPanel();
		contentPane.add(south, BorderLayout.SOUTH);
	 
		JLabel lblEcoleNationaleDes = new JLabel("Ecole Nationale des Sciences Appliqu\u00E9es El Hoceima");
		south.add(lblEcoleNationaleDes);
 	 
	
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home2 frame = new home2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
}
