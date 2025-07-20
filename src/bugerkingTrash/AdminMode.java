//package burgerking;
//
//import java.awt.Color;
//import java.awt.Font;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//import javax.swing.ImageIcon;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class AdminMode {
//	private JFrame frame;
//	public AdminMode() {
//		initialize();
//	}
//
//	private void initialize() {
//		frame = new JFrame();
//		frame.setTitle("버거킹");
//		frame.setSize(800, 600);
//		frame.setLocationRelativeTo(null);
//		frame.setResizable(false);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblLogo = new JLabel("BURGER KING");
//		lblLogo.setForeground(Color.RED);
//		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
//		lblLogo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 28));
//		lblLogo.setBounds(60, 25, 226, 48);
//		frame.getContentPane().add(lblLogo);
//		
//		JButton btnMenuInput = new JButton("메뉴 등록 하기");
//		btnMenuInput.setFont(new Font("굴림", Font.BOLD, 20));
//		btnMenuInput.setBounds(438, 99, 220, 50);
//		frame.getContentPane().add(btnMenuInput);
//		
//		JButton btnMo = new JButton("메뉴 수정 하기");
//		btnMo.setFont(new Font("굴림", Font.BOLD, 20));
//		btnMo.setBounds(438, 215, 220, 50);
//		frame.getContentPane().add(btnMo);
//		
//		JButton btnDe = new JButton("메뉴 삭제 하기");
//		btnDe.setFont(new Font("굴림", Font.BOLD, 20));
//		btnDe.setBounds(438, 322, 220, 50);
//		frame.getContentPane().add(btnDe);
//		
//		JButton btnExit = new JButton("작 업 종 료");
//		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
//		btnExit.setBounds(438, 434, 220, 50);
//		frame.getContentPane().add(btnExit);
//		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon(AdminMode.class.getResource("/burgerking/Images/burgerking2.png")));
//		lblNewLabel.setBounds(55, 99, 252, 395);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JButton btnMenuSet = new JButton("메뉴 설정");
//		btnMenuSet.setFont(new Font("굴림", Font.BOLD, 20));
//		btnMenuSet.setBounds(438, 17, 220, 50);
//		frame.getContentPane().add(btnMenuSet);
//		
//		frame.setVisible(true);
//		
////===========================================================================================		
//		//메뉴 등록
//		btnMenuInput.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new KioskMenuInput();
//			}
//		});
//		//메뉴 수정
//		btnMo.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new KioskMenuModity();
//			}
//		});
//		//메뉴 삭제
//				btnDe.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						frame.dispose();
//						new KioskMenuDelete();
//					}
//				});
//		//작업종료
//		btnExit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new KioskMain();
//			}
//		});
//		
//		//메뉴 설정
//		btnMenuSet.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new KioskMenuSet();
//			}
//		});
//		
//		
//	}
//}
package bugerkingTrash;


