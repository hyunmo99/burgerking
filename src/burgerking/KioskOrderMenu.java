package burgerking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class KioskOrderMenu extends JDialog{

	public KioskOrderMenu(JFrame parent, KioskVO vo) {
		super(parent, "메뉴 상세 정보", true); 
		
		setSize(600, 400);
		setLocationRelativeTo(parent);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblProduct = new JLabel("상품명: " + vo.getProduct());
		lblProduct.setFont(new Font("굴림", Font.BOLD, 16));
		lblProduct.setBounds(20, 20, 300, 60);
		getContentPane().add(lblProduct);
		
		JLabel lblProduct_1 = new JLabel("간단설명:" + vo.getDetail());
		lblProduct_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblProduct_1.setBounds(20, 80, 300, 60);
		getContentPane().add(lblProduct_1);
		
		JLabel lblProduct_2 = new JLabel("칼로리: " + vo.getCalorie());
		lblProduct_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblProduct_2.setBounds(20, 140, 300, 60);
		getContentPane().add(lblProduct_2);
		
		JLabel lblProduct_3 = new JLabel("가격: " + vo.getPrice());
		lblProduct_3.setFont(new Font("굴림", Font.BOLD, 16));
		lblProduct_3.setBounds(20, 200, 300, 60);
		getContentPane().add(lblProduct_3);
		
		JLabel lblImage = new JLabel("상품 이미지가 표시됩니다.");
		lblImage.setOpaque(true);
		lblImage.setIcon(null);
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBackground(Color.LIGHT_GRAY);
		lblImage.setBounds(327, 20, 245, 245);
		getContentPane().add(lblImage);
		lblImage.setIcon(new ImageIcon("C:\\Users\\khm\\eclipse-workspace\\kiosk\\src\\burgerking\\Images\\"+vo.getImage()));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 289, 584, 84);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnInput = new JButton("담기");
		
		btnInput.setBounds(66, 22, 200, 40);
		panel.add(btnInput);
		btnInput.setFont(new Font("굴림", Font.BOLD, 18));
		
		JButton btnOMExit = new JButton("취소");
		btnOMExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnOMExit.setBounds(342, 22, 200, 40);
		panel.add(btnOMExit);
		
		//메뉴 담기
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		//닫기
		btnOMExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		setVisible(true); 
	}
}