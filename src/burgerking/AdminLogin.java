package burgerking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
@SuppressWarnings("deprecation")
public class AdminLogin {

	private JFrame frame;
	private JTextField txtId;
	private JPasswordField txtPassword;
	private String id = "admin";
	private String pwd = "1234";

	public AdminLogin() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("버거킹");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("BURGER KING");
		lblLogo.setForeground(Color.RED);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 28));
		lblLogo.setBounds(12, 10, 226, 48);
		frame.getContentPane().add(lblLogo);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("굴림", Font.BOLD, 20));
		btnLogin.setBounds(114, 441, 220, 50);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("취소");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(448, 441, 220, 50);
		frame.getContentPane().add(btnExit);
		
		JLabel lbl1 = new JLabel("아이디");
		lbl1.setFont(new Font("굴림", Font.BOLD, 20));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(111, 169, 228, 59);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("비밀번호");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("굴림", Font.BOLD, 20));
		lbl2.setBounds(113, 259, 228, 59);
		frame.getContentPane().add(lbl2);
		
		txtId = new JTextField();
		txtId.setBounds(366, 169, 210, 48);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(366, 259, 210, 48);
		frame.getContentPane().add(txtPassword);
		
		frame.setVisible(true);
		
//================================================================================================
		//로그인
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((id.equals(txtId.getText())) && (pwd.equals(txtPassword.getText()))) {
					JOptionPane.showMessageDialog(frame, "로그인 되셨습니다");
					frame.dispose();
					new KioskList();
				}
				else {
					JOptionPane.showMessageDialog(frame, "로그인 실패 아이디와 비밀번호를 확인해주세요");
					txtId.requestFocus();
				}
			}
		});
		//닫기
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskMain();
			}
		});
		
	}
}
