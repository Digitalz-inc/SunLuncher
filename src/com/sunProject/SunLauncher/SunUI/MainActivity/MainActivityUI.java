package com.sunProject.SunLauncher.SunUI.MainActivity;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.PanelUI;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.sun.awt.AWTUtilities;

import net.miginfocom.swing.MigLayout;
import res.Common;

public class MainActivityUI extends JFrame {

	private static final long serialVersionUID = 1L; // this is UID !!!
	public static JTextField inputUsername;
	public static JPasswordField inputPasswd;
	public static JLabel serverOKInfoLabel;
	public static JButton btnConnect;
	public static JRadioButton CrackButton;
	public static JRadioButton PremiumButton;
	public static JLabel lblAbout;
	public static JPanel Containerform;

	public MainActivityUI() {
		this.setTitle(Common.AppName);
		this.setSize(770, 550);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		WindowMover mover = new WindowMover(this);
		this.addMouseListener(mover);
		this.addMouseMotionListener(mover);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon(this.getClass().getResource(Common.Appicon)).getImage());

		JPanel panel = new JPanel();
		this.setContentPane(panel);
		Color backgroundColorAct = new Color(31, 31, 31);
		panel.setBackground(backgroundColorAct);
		panel.setLayout(new MigLayout("", "[760px]", "[30px][466px][21px]"));

		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setOpaque(false);
		toolBar.setPreferredSize(new Dimension(getWidth(), 30));
		toolBar.setRollover(true);
		toolBar.setBackground(backgroundColorAct);
		
		CrackButton = new JRadioButton(Strings.getString("MainActivityUI.CrackButton"));
		CrackButton.setForeground(Color.WHITE);
		CrackButton.setSelected(true);
		toolBar.add(CrackButton);
		
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut);

		PremiumButton = new JRadioButton(Strings.getString("MainActivityUI.premiumButton"));
		
		PremiumButton.setEnabled(false);
		PremiumButton.setForeground(Color.WHITE);
		toolBar.add(PremiumButton);
		
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(CrackButton);
		btngroup.add(PremiumButton);
		
		panel.add(toolBar, "cell 0 0,growx,aligny top");
		

		Component horizontalGlue = Box.createHorizontalGlue();
		toolBar.add(horizontalGlue);

		btnConnect = new JButton(Strings.getString("MainActivityUI.btnConnect.text"));
		btnConnect.setMnemonic('C');
		btnConnect.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnConnect.setForeground(Color.WHITE);
		btnConnect.setBackground(Color.WHITE);
		btnConnect.setEnabled(false);
		btnConnect.setIcon(new ImageIcon(this.getClass().getResource(Common.RessourcePath + "letGo.png")));
		btnConnect.setFocusable(true);
		btnConnect.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("username :" + inputUsername.getText() + " Password :" + inputPasswd.getText());
				JOptionPane.showMessageDialog(null,
						"username :" + inputUsername.getText() + "\n Password :" + inputPasswd.getText(), "Info users",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});

		JButton btnMenu = new JButton(Strings.getString("MainActivityUI.btnmenu.text"));
		btnMenu.setIcon(new ImageIcon(this.getClass().getResource(Common.RessourcePath + "menu.png")));
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setBackground(Color.WHITE);
		btnMenu.setVisible(false);
		toolBar.add(btnMenu);

		JSeparator separator_1 = new JSeparator();
		separator_1.setMaximumSize(new Dimension(3, 3333));
		separator_1.setPreferredSize(new Dimension(1, 3));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		toolBar.add(separator_1);
		toolBar.add(btnConnect);

		JPanel form1 = new JPanel();
		form1.setOpaque(false);
		form1.setBackground(backgroundColorAct);
		panel.add(form1, "cell 0 1,grow");
		form1.setLayout(new CardLayout(0, 0));
		form1.setFocusable(true);

		JLayeredPane layeredPane = new JLayeredPane();

		form1.add(layeredPane, "name_81024528025555");

		Containerform = new JPanel();
		Containerform.setVisible(false);
		Containerform.setFocusTraversalKeysEnabled(false);
		Containerform.setBorder(new LineBorder(new Color(64, 64, 64), 2, true));
		Containerform.setBackground(new Color(49, 48, 48));

		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(153)
					.addComponent(Containerform, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(169))
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(28)
					.addComponent(Containerform, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(52))
		);

		GridBagLayout gbl_Containerform = new GridBagLayout();
		gbl_Containerform.columnWidths = new int[] { 162, 0, 0, 0, 0, 0, 0, 0, 67, 0 };
		gbl_Containerform.rowHeights = new int[] { 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_Containerform.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_Containerform.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };

		Containerform.setLayout(gbl_Containerform);

		JLabel lblConnexion = new JLabel(Strings.getString("MainActivityUI.lblConnexion.text")); //$NON-NLS-1$
		lblConnexion.setForeground(Color.WHITE);

		GridBagConstraints gbc_lblConnexion = new GridBagConstraints();
		gbc_lblConnexion.fill = GridBagConstraints.VERTICAL;
		gbc_lblConnexion.insets = new Insets(0, 0, 5, 5);
		gbc_lblConnexion.gridwidth = 9;
		gbc_lblConnexion.gridx = 0;
		gbc_lblConnexion.gridy = 1;

		Containerform.add(lblConnexion, gbc_lblConnexion);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.black);

		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridwidth = 11;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 2;

		Containerform.add(separator, gbc_separator);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setMinimumSize(new Dimension(0, 100));
		verticalStrut.setPreferredSize(new Dimension(0, 100));

		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 0;
		gbc_verticalStrut.gridy = 3;

		Containerform.add(verticalStrut, gbc_verticalStrut);

		inputUsername = new JTextField();
		 //$NON-NLS-1$
		inputUsername.setForeground(Color.gray);
		inputUsername.setFocusable(true);

		GridBagConstraints gbc_inputUsername = new GridBagConstraints();
		gbc_inputUsername.insets = new Insets(0, 0, 5, 0);
		gbc_inputUsername.anchor = GridBagConstraints.NORTH;
		gbc_inputUsername.gridwidth = 11;
		gbc_inputUsername.gridx = 0;
		gbc_inputUsername.gridy = 4;

		Containerform.add(inputUsername, gbc_inputUsername);

		inputUsername.setColumns(20);
		inputUsername.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (inputUsername.getText().matches("")) {
					inputUsername.setForeground(Color.GRAY);
					if (PremiumButton.isSelected()) {
						inputUsername.setText(Strings.getString("mainActivityUI.lbluserName.PremiumstateMode.text"));
					}
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (inputUsername.getText().matches(Strings.getString("MainActivityUI.inputUsername.text")) || inputUsername.getText().matches((Strings.getString("mainActivityUI.lbluserName.PremiumstateMode.text")))) {
					inputUsername.setText("");
					inputUsername.setForeground(Color.black);

				}

			}
		});

		Component verticalGlue = Box.createVerticalGlue();

		GridBagConstraints gbc_verticalGlue = new GridBagConstraints();
		gbc_verticalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_verticalGlue.gridx = 0;
		gbc_verticalGlue.gridy = 5;

		Containerform.add(verticalGlue, gbc_verticalGlue);

		Component verticalStrut_1 = Box.createVerticalStrut(20);

		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 0;
		gbc_verticalStrut_1.gridy = 6;

		Containerform.add(verticalStrut_1, gbc_verticalStrut_1);

		inputPasswd = new JPasswordField();
		inputPasswd.setEnabled(false);
		inputPasswd.setToolTipText(Strings.getString("MainActivityUI.inputPasswd.toolTipText")); //$NON-NLS-1$
		inputPasswd.setFocusable(true);
		inputPasswd.setText(Strings.getString("MainActivityUI.txtPasswd.text")); //$NON-NLS-1$
		inputPasswd.setForeground(Color.gray);

		inputPasswd.addFocusListener(new FocusListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (inputPasswd.getText().matches("")) {
					inputPasswd.setText(Strings.getString("MainActivityUI.txtPasswd.text"));
				}
			}

			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				if (inputPasswd.getText().matches(Strings.getString("MainActivityUI.txtPasswd.text"))) {
					inputPasswd.setText("");
					inputPasswd.setForeground(Color.black);
				}

			}
		});

		GridBagConstraints gbc_inputPasswd = new GridBagConstraints();
		gbc_inputPasswd.gridwidth = 11;
		gbc_inputPasswd.insets = new Insets(0, 0, 5, 0);
		gbc_inputPasswd.gridx = 0;
		gbc_inputPasswd.gridy = 7;

		Containerform.add(inputPasswd, gbc_inputPasswd);

		inputPasswd.setColumns(20);

		layeredPane.setLayout(gl_layeredPane);

		JToolBar toolStatusBar = new JToolBar();
		toolStatusBar.setFloatable(false);
		toolStatusBar.setRollover(true);
		toolStatusBar.setOpaque(false);

		panel.add(toolStatusBar, "cell 0 2,growx,aligny top");

		serverOKInfoLabel = new JLabel(Strings.getString("MainActivityUI.lblUpdateLoading.text"));
		serverOKInfoLabel.setIcon(new ImageIcon(MainActivityUI.class.getResource("/res/load.gif")));
		serverOKInfoLabel.setForeground(Color.WHITE);
		toolStatusBar.add(serverOKInfoLabel);

		lblAbout = new JLabel();
		lblAbout.setVisible(false);
		lblAbout.setIcon(new ImageIcon(MainActivityUI.class.getResource("/res/UserProfile.png")));
		lblAbout.setFont(new Font("Droid Sans Mono Slashed for Powerline", Font.ITALIC, 13));
		lblAbout.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblAbout.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblAbout.setForeground(Color.WHITE);
		toolStatusBar.add(lblAbout);
		
		// tasks to implement.
	}
	
}
