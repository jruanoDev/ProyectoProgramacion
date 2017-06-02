package com.proyectogestioncitas.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import javax.swing.JButton;

import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_LUsername;
	private JTextField textField_REmail;
	private JTextField textField_RName;
	private JTextField textField_RID;
	private JTextField textField_RBirthDate;
	private JPasswordField passwordField_LPassword;
	private JPasswordField passwordField_RPassword;
	private JPasswordField passwordField_RRepeat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setResizable(false);
		inicialize();
	}
	
	public void inicialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(0.1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
		);
		
		JPanel leftPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel);
		
		JLabel lblLogin = new JLabel("LOGIN");
		
		JLabel lblLUsername = new JLabel("Username:");
		
		JLabel lblLPassword = new JLabel("Password:");
		
		textField_LUsername = new JTextField();
		textField_LUsername.setColumns(10);
		
		JButton btnLAccept = new JButton("Accept");
		
		passwordField_LPassword = new JPasswordField();
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLPassword))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnLAccept))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLUsername))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_leftPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordField_LPassword, Alignment.LEADING)
								.addComponent(textField_LUsername, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLogin)))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_leftPanel.setVerticalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addComponent(lblLogin)
					.addGap(37)
					.addComponent(lblLUsername)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_LUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLPassword)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField_LPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(btnLAccept)
					.addContainerGap(168, Short.MAX_VALUE))
		);
		leftPanel.setLayout(gl_leftPanel);
		
		JPanel rightPanel = new JPanel();
		splitPane.setRightComponent(rightPanel);
		
		JLabel lblRegistry = new JLabel("REGISTRY");
		
		JLabel lblREmail = new JLabel("E-mail:");
		
		textField_REmail = new JTextField();
		textField_REmail.setColumns(10);
		
		JLabel lblRName = new JLabel("Name:");
		
		textField_RName = new JTextField();
		textField_RName.setColumns(10);
		
		JLabel lblRID = new JLabel("ID number:");
		
		textField_RID = new JTextField();
		textField_RID.setColumns(10);
		
		JLabel lblRPassword = new JLabel("Password:");
		
		JLabel lblRRepeat = new JLabel("Repeat password:");
		
		JLabel lblRBirthDate = new JLabel("Birth date:");
		
		textField_RBirthDate = new JTextField();
		textField_RBirthDate.setColumns(10);
		
		JButton btnRSend = new JButton("Send");
		
		passwordField_RPassword = new JPasswordField();
		
		passwordField_RRepeat = new JPasswordField();
		GroupLayout gl_rightPanel = new GroupLayout(rightPanel);
		gl_rightPanel.setHorizontalGroup(
			gl_rightPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addGroup(gl_rightPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
							.addGap(103)
							.addComponent(lblRegistry))
						.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_REmail, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_RName, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_RID, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
							.addContainerGap(200, Short.MAX_VALUE)
							.addComponent(btnRSend))
						.addGroup(gl_rightPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_rightPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField_RPassword, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
								.addComponent(textField_RBirthDate, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(passwordField_RRepeat, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRPassword)
					.addContainerGap(195, Short.MAX_VALUE))
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRID)
					.addContainerGap(193, Short.MAX_VALUE))
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRName)
					.addContainerGap(225, Short.MAX_VALUE))
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRRepeat)
					.addContainerGap(140, Short.MAX_VALUE))
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRBirthDate)
					.addContainerGap(194, Short.MAX_VALUE))
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblREmail)
					.addContainerGap(223, Short.MAX_VALUE))
		);
		gl_rightPanel.setVerticalGroup(
			gl_rightPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addComponent(lblRegistry)
					.addGap(18)
					.addComponent(lblREmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_REmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblRName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_RName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRID)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_RID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRPassword)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField_RRepeat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblRRepeat)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField_RPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRBirthDate)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_RBirthDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRSend)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		rightPanel.setLayout(gl_rightPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
