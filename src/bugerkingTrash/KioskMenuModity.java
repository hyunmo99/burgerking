//package burgerking;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.regex.Pattern;
//
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextField;
//import javax.swing.SwingConstants;
//import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.JTextArea;
//
//
//public class KioskMenuModity {
//	private KioskDAO dao = new KioskDAO();
//	private KioskVO vo = null;
//	
//
//	private JFrame frame;
//	private JTextField txtProduct;
//	private JTextField txtDetail;
//	private JTextField txtCalorie;
//	private JTextField txtPrice;
//	private int res=0;
//	public static void main(String[] args) {
//		new KioskMenuModity();
//	}
//
//	public KioskMenuModity() {
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
//		JPanel pnInput = new JPanel();
//		pnInput.setBounds(0, 0, 784, 561);
//		frame.getContentPane().add(pnInput);
//		pnInput.setLayout(null);
//		
//		JPanel pnIn1 = new JPanel();
//		pnIn1.setBounds(0, 0, 748, 58);
//		pnIn1.setLayout(null);
//		pnInput.add(pnIn1);
//		
//		JLabel lblTitle_1 = new JLabel("버거킹 메뉴 수정");
//		lblTitle_1.setOpaque(true);
//		lblTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
//		lblTitle_1.setFont(new Font("굴림", Font.BOLD, 22));
//		lblTitle_1.setBackground(Color.WHITE);
//		lblTitle_1.setBounds(0, 0, 784, 58);
//		pnIn1.add(lblTitle_1);
//		
//		JPanel pnIn2 = new JPanel();
//		pnIn2.setBounds(0, 56, 784, 448);
//		pnIn2.setLayout(null);
//		pnInput.add(pnIn2);
//		
//		JLabel lblPart_1 = new JLabel("상품분류");
//		lblPart_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblPart_1.setBounds(23, 28, 108, 31);
//		pnIn2.add(lblPart_1);
//		
//		JLabel lblProduct_1 = new JLabel("상품명");
//		lblProduct_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblProduct_1.setBounds(23, 82, 108, 31);
//		pnIn2.add(lblProduct_1);
//		
//		JLabel lblDetile_1 = new JLabel("간단설명");
//		lblDetile_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblDetile_1.setBounds(23, 134, 108, 31);
//		pnIn2.add(lblDetile_1);
//		
//		JLabel lblContent_1 = new JLabel("알레르기");
//		lblContent_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblContent_1.setBounds(23, 189, 108, 59);
//		pnIn2.add(lblContent_1);
//		
//		JLabel lblKcal_1 = new JLabel("칼로리(kcal)");
//		lblKcal_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblKcal_1.setBounds(23, 273, 108, 31);
//		pnIn2.add(lblKcal_1);
//		
//		JLabel lblImageName_1 = new JLabel("상품이미지");
//		lblImageName_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblImageName_1.setBounds(23, 391, 108, 31);
//		pnIn2.add(lblImageName_1);
//		
//		JLabel lblPrice_1 = new JLabel("상품가격");
//		lblPrice_1.setFont(new Font("굴림", Font.BOLD, 18));
//		lblPrice_1.setBounds(23, 332, 108, 31);
//		pnIn2.add(lblPrice_1);
//		
//		JComboBox cbPart = new JComboBox();
//		cbPart.setModel(new DefaultComboBoxModel(new String[] {"오리지널스&맥시멈", "프리미엄", "와퍼&주니어", "음료&디저트"}));
//		cbPart.setFont(new Font("굴림", Font.PLAIN, 17));
//		cbPart.setBounds(158, 28, 316, 31);
//		pnIn2.add(cbPart);
//		
//		txtProduct = new JTextField();
//		txtProduct.setFont(new Font("굴림", Font.PLAIN, 18));
//		txtProduct.setColumns(10);
//		txtProduct.setBounds(158, 82, 316, 31);
//		pnIn2.add(txtProduct);
//		
//		txtDetail = new JTextField();
//		txtDetail.setFont(new Font("굴림", Font.PLAIN, 18));
//		txtDetail.setColumns(10);
//		txtDetail.setBounds(158, 134, 316, 31);
//		pnIn2.add(txtDetail);
//		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(158, 187, 316, 61);
//		pnIn2.add(scrollPane);
//		
//		JTextArea taContent = new JTextArea();
//		taContent.setFont(new Font("Monospaced", Font.PLAIN, 18));
//		scrollPane.setViewportView(taContent);
//		
//		txtCalorie = new JTextField();
//		txtCalorie.setFont(new Font("굴림", Font.PLAIN, 18));
//		txtCalorie.setColumns(10);
//		txtCalorie.setBounds(158, 273, 316, 31);
//		pnIn2.add(txtCalorie);
//		
//		txtPrice = new JTextField();
//		txtPrice.setFont(new Font("굴림", Font.PLAIN, 18));
//		txtPrice.setColumns(10);
//		txtPrice.setBounds(158, 332, 316, 31);
//		pnIn2.add(txtPrice);
//		
//		JButton btnImage = new JButton("이미지등록");
//		btnImage.setFont(new Font("굴림", Font.BOLD, 18));
//		btnImage.setBounds(158, 391, 316, 31);
//		pnIn2.add(btnImage);
//		
//		JLabel lblImage = new JLabel("상품 이미지가 표시됩니다.");
//		lblImage.setOpaque(true);
//		lblImage.setIcon(null);
//		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
//		lblImage.setBackground(Color.LIGHT_GRAY);
//		lblImage.setBounds(511, 174, 245, 245);
//		pnIn2.add(lblImage);
//		
//		JButton btnCheck = new JButton("확인");
//		btnCheck.setBounds(489, 82, 113, 31);
//		pnIn2.add(btnCheck);
//		
//		JPanel pnIn3 = new JPanel();
//		pnIn3.setBounds(0, 503, 784, 58);
//		pnIn3.setLayout(null);
//		pnInput.add(pnIn3);
//		
//		JButton btnModity = new JButton("메뉴수정");
//		btnModity.setFont(new Font("굴림", Font.BOLD, 18));
//		btnModity.setBounds(128, 10, 200, 40);
//		pnIn3.add(btnModity);
//		
//		JButton btnExit = new JButton("뒤로");
//		
//		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
//		btnExit.setBounds(456, 10, 200, 40);
//		pnIn3.add(btnExit);
//		
//		frame.setVisible(true);
//		
//		
//		
////=================================================================================================================
//		//상품 확인
//		btnCheck.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				vo = null;
//				String product = txtProduct.getText();
//				vo = dao.getProductSearch(product);
//				if(vo != null) {
//					cbPart.setSelectedItem(vo.getPart());
//					txtDetail.setText(vo.getDetail());
//					taContent.setText(vo.getContent());
//					txtCalorie.setText(vo.getCalorie()+"");
//					txtPrice.setText(vo.getPrice()+"");
//					txtDetail.setText(vo.getDetail());
//					lblImage.setIcon(new ImageIcon("/burgerking/Images/"+vo.getImage()));
//					System.out.println("/burgerking/Images/"+vo.getImage());
//				}
//				else {
//					JOptionPane.showMessageDialog(frame, product+"메뉴가 없습니다");
//					txtProduct.requestFocus();
//				}
//			}
//		});
//		
//		// 상품 수정하기 마우스클릭시 수행
//		btnModity.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String part = cbPart.getSelectedItem().toString();
//				String product = txtProduct.getText();
//				String detail = txtDetail.getText();
//				String content = taContent.getText();
//				String calorie = txtCalorie.getText();
//				String strImage = lblImage.getIcon().toString();
//				String image = strImage.substring(strImage.lastIndexOf("\\")+1);
//				String strPrice = txtPrice.getText().toString();
//				
//				if(product.trim().equals("")) {
//					JOptionPane.showMessageDialog(frame, "메뉴명을 입력하세요");
//					txtProduct.requestFocus();
//				}
//				else if(detail.trim().equals("")) {
//					JOptionPane.showMessageDialog(frame, "메뉴명을 입력하세요");
//					txtDetail.requestFocus();
//				}
//				else if(image.trim().equals("")) {
//					JOptionPane.showMessageDialog(frame, "메뉴그림을 등록하세요");
//					txtDetail.requestFocus();
//				}
//				else if(!Pattern.matches("^[0-9]+$", strPrice)) {
//					JOptionPane.showMessageDialog(frame, "메뉴가격은 숫자로 입력하세요");
//					txtPrice.requestFocus();
//				}
//				else if(!Pattern.matches("^[0-9]+$", calorie)) {
//					JOptionPane.showMessageDialog(frame, "칼로리는 숫자로 입력하세요");
//					txtCalorie.requestFocus();
//				}
//				else {
//					// 중복확인
//					vo = null;
//					vo = dao.getProductSearch(product);
//					if(vo.getProduct() == null) {
//						JOptionPane.showMessageDialog(frame, "product+\"메뉴가 없습니다");
//						txtProduct.requestFocus();
//					}
//					else {
//						vo.setPart(part);
//						vo.setProduct(product);
//						vo.setDetail(detail);
//						vo.setContent(content);
//						vo.setCalorie(Integer.parseInt(calorie));
//						vo.setImage(image);
//						vo.setPrice(Integer.parseInt(strPrice));
//						
//						res = dao.setModity(vo);
//						if(res != 0) {
//							JOptionPane.showMessageDialog(null, product + " 메뉴이 수정이 되었습니다.");
//							txtProduct.setText("");
//							txtDetail.setText("");
//							taContent.setText("");
//							txtCalorie.setText("");
//							lblImage.setText("");
//							txtPrice.setText("");
//						}
//						else {
//							JOptionPane.showMessageDialog(null, "메뉴 수정 실패 다시 등록해 주세요.");
//							txtProduct.requestFocus();
//						}
//					}
//				}
//			}
//		});
//		// 이미지 불러오기
//		btnImage.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JFileChooser chooser = new JFileChooser();
//				
//				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg","gif","png");
//				chooser.setFileFilter(filter);
//				
//				int res = chooser.showOpenDialog(null);
//				
//				if(res != chooser.APPROVE_OPTION) {
//					JOptionPane.showMessageDialog(frame, "파일을 선택해 주세요","경고",JOptionPane.WARNING_MESSAGE);
//				}
//				else {
//					String filePath = chooser.getSelectedFile().getPath();
//					lblImage.setIcon(new ImageIcon(filePath));
//				}
//			}
//		});
//		//닫기
//		btnExit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
////				new AdminMode();
//			}
//		});
//	}
//}
package bugerkingTrash;


