package burgerking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
public class KioskMenuModify {
	private JFrame frame;
	private JTextField txtDetail;
	private JTextField txtCalorie;
	private JTextField txtPrice;
	
	private KioskDAO dao = new KioskDAO();
	private KioskVO vo = null;
	
	int res = 0;
	
	public KioskMenuModify() {
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
		pn1.setLayout(null);
		pn1.setBounds(0, 0, 748, 58);
		frame.getContentPane().add(pn1);
		
		JLabel lblTitle_1 = new JLabel("버거킹 메뉴 수정");
		lblTitle_1.setOpaque(true);
		lblTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle_1.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitle_1.setBackground(Color.WHITE);
		lblTitle_1.setBounds(0, 0, 784, 58);
		pn1.add(lblTitle_1);
		
		JPanel pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(0, 56, 784, 448);
		frame.getContentPane().add(pn2);
		
		JLabel lblPart = new JLabel("상품분류");
		lblPart.setFont(new Font("굴림", Font.BOLD, 18));
		lblPart.setBounds(23, 28, 108, 31);
		pn2.add(lblPart);
		
		JLabel lblProduct = new JLabel("상품명");
		lblProduct.setFont(new Font("굴림", Font.BOLD, 18));
		lblProduct.setBounds(23, 82, 108, 31);
		pn2.add(lblProduct);
		
		JLabel lblDetile = new JLabel("간단설명");
		lblDetile.setFont(new Font("굴림", Font.BOLD, 18));
		lblDetile.setBounds(23, 134, 108, 31);
		pn2.add(lblDetile);
		
		JLabel lblContent = new JLabel("알레르기");
		lblContent.setFont(new Font("굴림", Font.BOLD, 18));
		lblContent.setBounds(23, 189, 108, 59);
		pn2.add(lblContent);
		
		JLabel lblKcal = new JLabel("칼로리(kcal)");
		lblKcal.setFont(new Font("굴림", Font.BOLD, 18));
		lblKcal.setBounds(23, 273, 108, 31);
		pn2.add(lblKcal);
		
		JLabel lblImageName = new JLabel("상품이미지");
		lblImageName.setFont(new Font("굴림", Font.BOLD, 18));
		lblImageName.setBounds(23, 391, 108, 31);
		pn2.add(lblImageName);
		
		JLabel lblPrice = new JLabel("상품가격");
		lblPrice.setFont(new Font("굴림", Font.BOLD, 18));
		lblPrice.setBounds(23, 332, 108, 31);
		pn2.add(lblPrice);
		
		JComboBox cbPart = new JComboBox();
		cbPart.setModel(new DefaultComboBoxModel(new String[] {"오리지널스&맥시멈", "프리미엄", "와퍼&주니어", "음료&디저트"}));
		cbPart.setFont(new Font("굴림", Font.PLAIN, 17));
		cbPart.setBounds(158, 28, 316, 31);
		pn2.add(cbPart);
		
		txtDetail = new JTextField();
		txtDetail.setFont(new Font("굴림", Font.PLAIN, 18));
		txtDetail.setColumns(10);
		txtDetail.setBounds(158, 134, 316, 31);
		pn2.add(txtDetail);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(158, 187, 316, 61);
		pn2.add(scrollPane);
		
		JTextArea taContent = new JTextArea();
		scrollPane.setViewportView(taContent);
		
		txtCalorie = new JTextField();
		txtCalorie.setFont(new Font("굴림", Font.PLAIN, 18));
		txtCalorie.setColumns(10);
		txtCalorie.setBounds(158, 273, 316, 31);
		pn2.add(txtCalorie);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("굴림", Font.PLAIN, 18));
		txtPrice.setColumns(10);
		txtPrice.setBounds(158, 332, 316, 31);
		pn2.add(txtPrice);
		
		JButton btnImage = new JButton("이미지등록");
		btnImage.setFont(new Font("굴림", Font.BOLD, 18));
		btnImage.setBounds(158, 391, 316, 31);
		pn2.add(btnImage);
		
		JLabel lblImage = new JLabel("상품 이미지가 표시됩니다.");
		lblImage.setOpaque(true);
		lblImage.setIcon(null);
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBackground(Color.LIGHT_GRAY);
		lblImage.setBounds(511, 174, 245, 245);
		pn2.add(lblImage);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.setBounds(489, 82, 113, 31);
		pn2.add(btnCheck);
		
		JComboBox cbProduct = new JComboBox();
		cbProduct.setFont(new Font("굴림", Font.PLAIN, 17));
		cbProduct.setBounds(158, 82, 316, 31);
		pn2.add(cbProduct);
		
		JPanel pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBounds(0, 503, 784, 58);
		frame.getContentPane().add(pn3);
		
		JButton btnModity = new JButton("메뉴수정");
		btnModity.setFont(new Font("굴림", Font.BOLD, 18));
		btnModity.setBounds(128, 10, 200, 40);
		pn3.add(btnModity);
		
		JButton btnExit = new JButton("뒤로");
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnExit.setBounds(456, 10, 200, 40);
		pn3.add(btnExit);
		

		frame.setVisible(true);
		
//====================================================================================================
//		상품분류 선택시 상품명 나오기
		cbPart.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String selecPart = cbPart.getSelectedItem().toString();
				ArrayList<String> productList = dao.getProduct(selecPart);
				cbProduct.removeAllItems();
				for(String product : productList) {
					cbProduct.addItem(product);
				}
			}
		});
//		메뉴선택시 정보 나오기
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vo = null;
				String product = cbProduct.getSelectedItem().toString();
				vo = dao.getProductSearch(product);
				if(vo != null) {
					cbPart.setSelectedItem(vo.getPart());
					txtDetail.setText(vo.getDetail());
					taContent.setText(vo.getContent());
					txtCalorie.setText(vo.getCalorie()+"");
					txtPrice.setText(vo.getPrice()+"");
					txtDetail.setText(vo.getDetail());
					lblImage.setIcon(new ImageIcon("C:\\Users\\khm\\eclipse-workspace\\kiosk\\src\\burgerking\\Images\\"+vo.getImage()));
				}
				else {
					JOptionPane.showMessageDialog(frame, product+"메뉴가 없습니다");
					cbProduct.requestFocus();
				}
			}
		});
		//이미지 선택
		btnImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg","gif","png");
				chooser.setFileFilter(filter);
				
				int res = chooser.showOpenDialog(null);
				
				if(res != chooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "파일을 선택해 주세요","경고",JOptionPane.WARNING_MESSAGE);
				}
				else {
					String filePath = chooser.getSelectedFile().getPath();
					lblImage.setIcon(new ImageIcon(filePath));
				}
			}
		});
		//메뉴수정
		btnModity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "메뉴를 수정하시겠습니까?","메뉴 수정창",JOptionPane.YES_NO_OPTION);
				if(ans == 0) {
					String part = cbPart.getSelectedItem().toString();
					String product = cbProduct.getSelectedItem().toString();
					String detail = txtDetail.getText();
					String content = taContent.getText();
					String calorie = txtCalorie.getText();
					String strImage = lblImage.getIcon().toString();
					String image = strImage.substring(strImage.lastIndexOf("\\")+1);
					String strPrice = txtPrice.getText().toString();
					
					if(product.trim().equals("")) {
						JOptionPane.showMessageDialog(frame, "메뉴명을 입력하세요");
						cbProduct.requestFocus();
					}
					else if(detail.trim().equals("")) {
						JOptionPane.showMessageDialog(frame, "메뉴명을 입력하세요");
						txtDetail.requestFocus();
					}
					else if(image.trim().equals("")) {
						JOptionPane.showMessageDialog(frame, "메뉴그림을 등록하세요");
						txtDetail.requestFocus();
					}
					else if(!Pattern.matches("^[0-9]+$", strPrice)) {
						JOptionPane.showMessageDialog(frame, "메뉴가격은 숫자로 입력하세요");
						txtPrice.requestFocus();
					}
					else if(!Pattern.matches("^[0-9]+$", calorie)) {
						JOptionPane.showMessageDialog(frame, "칼로리는 숫자로 입력하세요");
						txtCalorie.requestFocus();
					}
					else {
						vo.setPart(part);
						vo.setProduct(product);
						vo.setDetail(detail);
						vo.setContent(content);
						vo.setCalorie(Integer.parseInt(calorie));
						vo.setImage(image);
						vo.setPrice(Integer.parseInt(strPrice));
						
						res = dao.setModity(vo);
						if(res != 0) {
							JOptionPane.showMessageDialog(null, product + " 메뉴이 수정이 되었습니다.");
							txtDetail.setText("");
							taContent.setText("");
							txtCalorie.setText("");
							lblImage.setText("");
							txtPrice.setText("");
						}
						else {
							JOptionPane.showMessageDialog(null, "메뉴 수정 실패 다시 등록해 주세요.");
							cbProduct.requestFocus();
						}
					}
				}
			}
		});
		//뒤로
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new KioskList();
			}
		});
	}
}
