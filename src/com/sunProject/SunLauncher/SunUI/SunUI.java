package com.sunProject.SunLauncher.SunUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import res.Common;

public class SunUI extends JFrame{
public  static int Prg_Value;
	private static final long serialVersionUID = 1L;

	public SunUI() throws IOException, Exception {
		this.setTitle(Common.AppName);
		this.setSize(new Dimension(230, 240));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setUndecorated(true);
		
		this.setIconImage(new ImageIcon(this.getClass().getResource(Common.Appicon)).getImage());
	
	JPanel Loader = new JPanel();
		this.setContentPane(Loader);
						
		Loader.setLayout(new BorderLayout(0, 0));
						
						
		JLabel label = new JLabel("");
						
		label.setIcon(new ImageIcon(SunUI.class.getResource("/res/blur_Gradient.png")));
						
		Loader.add(label);
			

	 	JProgressBar loading = new JProgressBar();
	 	loading.setIndeterminate(true);
			loading.setString("Loading ...");
			loading.setStringPainted(true);
			loading.setValue(Prg_Value);
				
			Loader.add(loading, BorderLayout.SOUTH);
	
}
}


