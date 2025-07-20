package burgerking;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
@SuppressWarnings({"unchecked", "rawtypes"})
public class KioskDAO extends DBConn{
	KioskVO vo = null;
	//중복체크
	public KioskVO getProductSearch(String product) {
		vo = new KioskVO();
		try {
			sql = "select *from kiosk where product = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new KioskVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setPart(rs.getString("part"));
				vo.setProduct(rs.getString("product"));
				vo.setDetail(rs.getString("detail"));
				vo.setContent(rs.getString("content"));
				vo.setCalorie(rs.getInt("calorie"));
				vo.setImage(rs.getString("image"));
				vo.setPrice(rs.getInt("price"));
			}
		} catch (SQLException e) {
			System.out.println("sql오류(getProductSearch)"+e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	//상품등록
	public int setInput(KioskVO vo) {
		int res = 0;
		try {
			sql = "insert into kiosk values(default, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPart());
			pstmt.setString(2, vo.getProduct());
			pstmt.setString(3, vo.getDetail());
			pstmt.setString(4, vo.getContent());
			pstmt.setInt(5, vo.getCalorie());
			pstmt.setString(6, vo.getImage());
			pstmt.setInt(7, vo.getPrice());
			res = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("sql오류(getProductSearch)"+e.getMessage());
		}finally {
			pstmtClose();
			}
		
		return res;
	}
	//상품 수정
	public int setModity(KioskVO vo) {
		int res = 0;
		try {
			sql = "update kiosk set part = ?, product = ?, detail = ?, content = ?"
					+ ", calorie = ?, image = ?, price = ? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPart());
			pstmt.setString(2, vo.getProduct());
			pstmt.setString(3, vo.getDetail());
			pstmt.setString(4, vo.getContent());
			pstmt.setInt(5, vo.getCalorie());
			pstmt.setString(6, vo.getImage());
			pstmt.setInt(7, vo.getPrice());
			pstmt.setInt(8, vo.getIdx());
			res = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("sql오류(setModity)"+e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}
	//상품 삭제
	public int setDelete(String product) {
		int res = 0;
		try {
			sql = "delete from kiosk where product = ?";	
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product);
			res = pstmt.executeUpdate(); 
		} catch (Exception e) {
		System.out.println("sql오류(setModity)"+e.getMessage());
		}finally {
			pstmtClose();
		}
		return res;
	}
	// part에 맞는 Product가져오기
	public ArrayList getProduct(String part) {
		ArrayList<String> partProduct = new ArrayList<>();
		try {
			sql = "select product from kiosk where part = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, part);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				partProduct.add(rs.getString("product"));
			}
		} catch (SQLException e) {
			System.out.println("sql오류(getProduct)"+e.getMessage());
		}finally {
			rsClose();
		}
		return partProduct;
		
	}
	//전체출력

	public Vector productList() {
		Vector vData = new Vector();
		try {
			sql = "select *from Kiosk order by idx";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("part"));
				vo.add(rs.getString("product"));
				vo.add(rs.getString("detail"));
				vo.add(rs.getString("content"));
				vo.add(rs.getInt("calorie"));
				vo.add(rs.getString("image"));
				vo.add(rs.getInt("price"));
				vData.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("sql오류(getProduct)"+e.getMessage());
		}finally {
			rsClose();
		}
		return vData;
		
	}
}
