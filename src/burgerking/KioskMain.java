package burgerking;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KioskMain {

	private JFrame frame;

	public static void main(String[] args) {
		new KioskMain();
	}

	public KioskMain() {
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
		lblLogo.setBounds(81, 26, 226, 48);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(KioskMain.class.getResource("/burgerking/Images/burgerking2.png")));
		lblNewLabel.setBounds(74, 104, 252, 395);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnOrder = new JButton("메뉴 주문 하기");
		btnOrder.setFont(new Font("굴림", Font.BOLD, 20));
		btnOrder.setBounds(427, 102, 220, 50);
		frame.getContentPane().add(btnOrder);
		
		JButton btnOrderCheck = new JButton("주문 확인 하기");
		btnOrderCheck.setFont(new Font("굴림", Font.BOLD, 20));
		btnOrderCheck.setBounds(427, 254, 220, 50);
		frame.getContentPane().add(btnOrderCheck);
		
		JButton btnExit = new JButton("작 업 종 료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(427, 406, 220, 50);
		frame.getContentPane().add(btnExit);
		
		JButton btnAdmin = new JButton("관리자");
		btnAdmin.setFont(new Font("굴림", Font.BOLD, 20));
		btnAdmin.setBounds(654, 0, 130, 33);
		frame.getContentPane().add(btnAdmin);
		
		frame.setVisible(true);
		
//------------------------위쪽은 디자인 , 아래쪽은 메소드------------------------------------------------------\
		// 관리자 모드
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminLogin();
				frame.dispose();
			}
		});
		// 주문하기 버튼 클릭시 수행
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskOrder();
			}
		});
		//주문확인 (미완성)
		btnOrderCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// 작업종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
