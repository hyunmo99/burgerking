package burgerking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class KioskOrder {
	private KioskDAO dao = new KioskDAO(); 
	private KioskVO vo = null;
	private int res = 0;
	private int price = 0;
	private JFrame frame;
	
	JLabel lblpn3;
	JPanel pnOriginal = null;
	JPanel pnPremium = null;
	JPanel pnWhopper = null;
	JPanel pnDrink = null;

	public KioskOrder() {
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
	
	JPanel pn1 = new JPanel();
	pn1.setBounds(0, 0, 784, 58);
	frame.getContentPane().add(pn1);
	pn1.setLayout(null);
	
	JLabel lblTitle = new JLabel("버거킹 메뉴 주문");
	lblTitle.setBounds(0, 0, 784, 58);
	lblTitle.setBackground(new Color(255, 255, 255));
	lblTitle.setOpaque(true);
	lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
	lblTitle.setFont(new Font("굴림", Font.BOLD, 22));
	pn1.add(lblTitle);
	
	JPanel pn2 = new JPanel();
	pn2.setBounds(0, 58, 784, 42);
	frame.getContentPane().add(pn2);
	pn2.setLayout(null);
	
	JButton btnOrignal = new JButton("오리지널스&맥시멈");
	btnOrignal.setFont(new Font("굴림", Font.PLAIN, 12));
	btnOrignal.setBounds(0, 0, 137, 48);
	pn2.add(btnOrignal);
	
	JButton btnPremium = new JButton("프리미엄");
	btnPremium.setFont(new Font("굴림", Font.PLAIN, 12));
	btnPremium.setBounds(135, 0, 137, 48);
	pn2.add(btnPremium);
	
	JButton btnWhopper = new JButton("와퍼&주니어");
	btnWhopper.setFont(new Font("굴림", Font.PLAIN, 12));
	btnWhopper.setBounds(271, 0, 137, 48);
	pn2.add(btnWhopper);
	
	JButton btnDrink = new JButton("사이드");
	btnDrink.setFont(new Font("굴림", Font.PLAIN, 12));
	btnDrink.setBounds(407, 0, 137, 48);
	pn2.add(btnDrink);

	pnOriginal = new JPanel();
	pnOriginal.setBounds(0, 102, 784, 341);
	frame.getContentPane().add(pnOriginal);
	pnOriginal.setLayout(null);
	
	JButton btnOriginal1 = new JButton("New button");
	btnOriginal1.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/오리지널스 메이플 갈릭s.jpg")));
	btnOriginal1.setBounds(36, 10, 150, 150);
	pnOriginal.add(btnOriginal1);
	
	JButton btnOriginal2 = new JButton("New button");
	
	btnOriginal2.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/오리지널스 뉴욕 스테이크s.jpg")));
	btnOriginal2.setBounds(222, 10, 150, 150);
	pnOriginal.add(btnOriginal2);
	
	JButton btnOriginal3 = new JButton("New button");
	btnOriginal3.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/불끈버거 맥시멈s.jpg")));
	btnOriginal3.setBounds(408, 10, 150, 150);
	pnOriginal.add(btnOriginal3);
	
	JButton btnOriginal4 = new JButton("New button");
	btnOriginal4.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/불끈버거 맥시멈 더블s.jpg")));
	btnOriginal4.setBounds(594, 10, 150, 150);
	pnOriginal.add(btnOriginal4);
	pnPremium = new JPanel();
	pnPremium.setLayout(null);
	pnPremium.setBounds(0, 102, 784, 341);
	frame.getContentPane().add(pnPremium);
	
	JButton btnPremium1 = new JButton("New button");
	btnPremium1.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/크리미 할라피뇨 파퍼s.jpg")));
	btnPremium1.setBounds(36, 10, 150, 150);
	pnPremium.add(btnPremium1);
	
	JButton btnPremium2 = new JButton("New button");
	btnPremium2.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/치폴레 할라피뇨 파퍼s.jpg")));
	btnPremium2.setBounds(222, 10, 150, 150);
	pnPremium.add(btnPremium2);
	
	JButton btnPremium3 = new JButton("New button");
	btnPremium3.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/불맛 더블치즈비이컨버거s.jpg")));
	btnPremium3.setBounds(408, 10, 150, 150);
	pnPremium.add(btnPremium3);
	
	JButton btnPremium4 = new JButton("New button");
	btnPremium4.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/몬스터와퍼s.jpg")));
	btnPremium4.setBounds(594, 10, 150, 150);
	pnPremium.add(btnPremium4);
	
	pnWhopper = new JPanel();
	pnWhopper.setLayout(null);
	pnWhopper.setBounds(0, 102, 784, 341);
	frame.getContentPane().add(pnWhopper);
	
	JButton btnWhopper1 = new JButton("New button");
	btnWhopper1.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/와퍼s.jpg")));
	btnWhopper1.setBounds(36, 10, 150, 150);
	pnWhopper.add(btnWhopper1);
	
	JButton btnWhopper2 = new JButton("New button");
	btnWhopper2.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/치즈와퍼s.jpg")));
	btnWhopper2.setBounds(222, 10, 150, 150);
	pnWhopper.add(btnWhopper2);
	
	JButton btnWhopper3 = new JButton("New button");
	btnWhopper3.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/불고기와퍼s.jpg")));
	btnWhopper3.setBounds(408, 10, 150, 150);
	pnWhopper.add(btnWhopper3);
	
	JButton btnWhopper4 = new JButton("New button");
	btnWhopper4.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/갈릭불고기와퍼s.jpg")));
	btnWhopper4.setBounds(594, 10, 150, 150);
	pnWhopper.add(btnWhopper4);
	
	pnDrink = new JPanel();
	pnDrink.setLayout(null);
	pnDrink.setBounds(0, 102, 784, 341);
	frame.getContentPane().add(pnDrink);
	
	JButton btnDrink1 = new JButton("New button");
	btnDrink1.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/코카콜라(L)s.jpg")));
	btnDrink1.setBounds(36, 10, 150, 150);
	pnDrink.add(btnDrink1);
	
	JButton btnDrink2 = new JButton("New button");
	btnDrink2.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/코카콜라(R)s.jpg")));
	btnDrink2.setBounds(222, 10, 150, 150);
	pnDrink.add(btnDrink2);
	
	JButton btnDrink3 = new JButton("New button");
	btnDrink3.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/스프라이트(L)s.jpg")));
	btnDrink3.setBounds(408, 10, 150, 150);
	pnDrink.add(btnDrink3);
	
	JButton btnDrink4 = new JButton("New button");
	btnDrink4.setIcon(new ImageIcon(KioskOrder.class.getResource("/burgerking/Images/스프라이트(R)s.jpg")));
	btnDrink4.setBounds(594, 10, 150, 150);
	pnDrink.add(btnDrink4);
	
	JPanel pn3 = new JPanel();
	pn3.setLayout(null);
	pn3.setBounds(0, 440, 784, 64);
	frame.getContentPane().add(pn3);
	
	lblpn3 = new JLabel("");
	lblpn3.setBounds(0, 0, 702, 64);
	pn3.add(lblpn3);
	
	JPanel pn4 = new JPanel();
	pn4.setLayout(null);
	pn4.setBounds(0, 503, 784, 58);
	frame.getContentPane().add(pn4);
	
	JButton btnInput = new JButton("상품등록");
	
	btnInput.setFont(new Font("굴림", Font.BOLD, 18));
	btnInput.setBounds(128, 10, 200, 40);
	pn4.add(btnInput);
	
	JButton btnExit = new JButton("뒤로");
	btnExit.setFont(new Font("굴림", Font.BOLD, 18));
	btnExit.setBounds(456, 10, 200, 40);
	pn4.add(btnExit);
	
	frame.setVisible(true);
	//=================================================================================================================
	//오리지널스&맥시멈 button
	btnOrignal.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			pnClose();
			pnOriginal.setVisible(true);
		}
	});
	//프리미엄 button
	btnPremium.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			pnClose();
			pnPremium.setVisible(true);
		}
	});
	//와퍼%주니어 button
	btnWhopper.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			pnClose();
			pnWhopper.setVisible(true);
		}
	});
	//음료 button
	btnDrink.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			pnClose();
			pnDrink.setVisible(true);
		}
	});
	//오리지널스&맥시멈 메뉴1
	btnOriginal1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	      
	        String productName = "오리지널스 메이플 갈릭"; 
	        menuSelect(productName);
		}
	});
	//오리지널스&맥시멈 메뉴2
	btnOriginal2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "오리지널스 뉴욕 스테이크"; 
	        menuSelect(productName);
		}
	});
	//오리지널스&맥시멈 메뉴3
	btnOriginal3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "불끈버거 맥시멈"; 
	        menuSelect(productName);
		}
	});
	//오리지널스&맥시멈 메뉴4
	btnOriginal4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "불끈버거 맥시멈 더블";  
	        menuSelect(productName);
		}
	});
	
	//프리미엄 메뉴1
	btnPremium1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	      
	        String productName = "크리미 할라피뇨 파퍼"; 
	        menuSelect(productName);
		}
	});
	//프리미엄 메뉴2
	btnPremium2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "치폴레 할라피뇨 파퍼"; 
	        menuSelect(productName);
		}
	});
	//프리미엄 메뉴3
	btnPremium3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "불맛 더블치즈베이컨버거"; 
	        menuSelect(productName);
		}
	});
	//프리미엄 메뉴4
	btnPremium4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "몬스터 와퍼";  
	        menuSelect(productName);
		}
	});
	//와퍼 메뉴1
	btnWhopper1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	      
			String productName = "와퍼"; 
			menuSelect(productName);
		}
	});
	//와퍼 메뉴2
	btnWhopper2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "치즈와퍼"; 
			menuSelect(productName);
		}
	});
	//와퍼 메뉴3
	btnWhopper3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "불고기와퍼"; 
			menuSelect(productName);
		}
	});
	//와퍼 메뉴4
	btnWhopper4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "갈릭불고기 와퍼";  
			menuSelect(productName);
		}
	});
	//음료 메뉴1
	btnDrink1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	      
			String productName = "코카콜라(L)"; 
			menuSelect(productName);
		}
	});
	//음료 메뉴2
	btnDrink2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "코카콜라(R)"; 
			menuSelect(productName);
		}
	});
	//음료 메뉴3
	btnDrink3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "스프라이트(L)"; 
			menuSelect(productName);
		}
	});
	//음료 메뉴4
	btnDrink4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String productName = "스프라이트(R)";  
			menuSelect(productName);
		}
	});
	
	//뒤로가기
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			new KioskMain();
		}
	});
	}
	//전체pn닫기
	protected void pnClose() {
		pnOriginal.setVisible(false);
		pnPremium.setVisible(false);
		pnWhopper.setVisible(false);
		pnDrink.setVisible(false);
	}
	//메뉴선택
	private void menuSelect(String productName) {
		vo = dao.getProductSearch(productName);
		if (vo.getProduct() != null) {
			new KioskOrderMenu(frame, vo);
		} else {
			JOptionPane.showMessageDialog(frame, "메뉴 정보를 찾을 수 없습니다.");
		}
	}
}

