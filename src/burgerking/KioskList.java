package burgerking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class KioskList {
	private JFrame frame;
	private JTable table;
	private KioskDAO dao = new KioskDAO();
	private Vector title, vData;
	private DefaultTableModel dtm;
	
	public KioskList() {
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
		pn1.setBounds(0, 0, 784, 57);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblLogo = new JLabel("BURGER KING");
		lblLogo.setBounds(0, 10, 226, 48);
		lblLogo.setForeground(Color.RED);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 28));
		pn1.add(lblLogo);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(-1, 57, 785, 52);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JButton btnInput = new JButton("메뉴 등록 하기");
		btnInput.setBounds(31, 1, 220, 50);
		btnInput.setFont(new Font("굴림", Font.BOLD, 20));
		pn2.add(btnInput);
		
		JButton btnModify = new JButton("메뉴 수정 하기");
		btnModify.setBounds(282, 0, 220, 50);
		btnModify.setFont(new Font("굴림", Font.BOLD, 20));
		pn2.add(btnModify);
		

		JButton btnDelete = new JButton("메뉴 삭제 하기");
		btnDelete.setBounds(533, 1, 220, 50);
		btnDelete.setFont(new Font("굴림", Font.BOLD, 20));
		pn2.add(btnDelete);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 109, 784, 384);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		
		title = new Vector();
		title.add("번호");
		title.add("상품분류");
		title.add("상품명");
		title.add("상품 간단설명");
		title.add("상품 상세설명");
		title.add("칼로리");
		title.add("이미지");
		title.add("가격");
		//전체 출력
		vData = dao.productList();
		dtm = new DefaultTableModel(vData, title);
		
		table = new JTable(dtm);
		table.getTableHeader().setReorderingAllowed(false);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 5, 784, 369);
		pn3.add(scrollPane);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(0, 491, 784, 70);
		frame.getContentPane().add(pn4);
		pn4.setLayout(null);
		
		JButton btnHome = new JButton("처음으로");
		btnHome.setFont(new Font("굴림", Font.BOLD, 18));
		btnHome.setBounds(128, 10, 200, 40);
		pn4.add(btnHome);
		
		JButton btnExit = new JButton("뒤로");
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnExit.setBounds(456, 10, 200, 40);
		pn4.add(btnExit);
		
		frame.setVisible(true);
		
//===================================================================================================		
		
		//메뉴 등록
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskMenuInput();
			}
		});
		//메뉴 수정
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskMenuModify();
			}
		});
		//메뉴 삭제
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskMenuDelete();
			}
		});
	
		//처음으로
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskMain();
			}
		});
		//뒤로
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new AdminLogin();
			}
		});
	}
}
	
