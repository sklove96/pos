package SOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


class MenuDAO {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userid = "scott";
	private String passwd = "tiger";
	
	
	
	
	
	MenuDAO() { // db와 한번만 연동하기 위해 생성자에서 연결함.
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	public ArrayList<stock> select() {
		Connection conn = null;
		String sql = "select * from stock";
		PreparedStatement pstmt;
		ResultSet rs = null;
		ArrayList<stock> list = new ArrayList<stock>(); // 효과적으로 dto를 저장하기 위해 CollectionFrameWork 중 ArrayList를 쓰는 것
		
		try {
			conn = DriverManager.getConnection(url, userid, passwd); // 데이터를 읽어오기 전에는 일단 계정을 통해 db에 접속해야한다.
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery(); // -> 디비에서 데이터가져왔고 이를 자바빈 자료형에 넣어주면 됩니다.
			
			while(rs.next()) { // 자료가 있다면 DTO에 저장하려는 것+dto의 set메서드를 사용함.
				                       // 이 while문이 한번 사용되면 record형테로 데이터가 저장될 것
				stock dto = new stock();
				
				dto.setNoodle(rs.getInt("noodle"));
				dto.setYuksu(rs.getInt("yuksu"));
				dto.setGomung_mu(rs.getInt("gomung_mu"));
				dto.setGomung_egg(rs.getInt("gomung_egg"));
				dto.setGomung_goggi(rs.getInt("gomung_goggi"));
				dto.setGomung_oi(rs.getInt("gomung_oi"));
				dto.setHae(rs.getInt("hae"));
				dto.setGoggi(rs.getInt("goggi"));
				dto.setMandoo(rs.getInt("mandoo"));
				
				
				
				//dto.setDeptno(rs.getInt("deptno"));  
				//dto.setDname(rs.getString("dname"));
				//dto.setLoc(rs.getString("loc"));
				
				list.add(dto);
			}return list;
				
		} catch (SQLException e) {
			e.printStackTrace();
		} return null;

	}



//	public void insert(MenuDTO dto) {
//		
//		Connection conn = null; 
//		PreparedStatement pstmt = null;
//		String sql = "insert into order_table values(?,?,?,?,?) ";
//		
//		try {
//			conn = DriverManager.getConnection(url, userid, passwd);
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, dto.getSeq());
//			pstmt.setInt(2, dto.getOrderNo());
//			pstmt.setInt(3, dto.getMenu());
//			pstmt.setInt(4, dto.getCNT());
//			pstmt.setDate(5, dto.getOrderDT());
//			
//			int result = pstmt.executeUpdate();
//			
//			if(result == 1) {
//				System.out.println("데이터 저장 성공");
//			}else {
//				System.out.println("데이터 저장 실패");
//			}
//		
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				 if(pstmt != null) {pstmt.close();}
//				 if(conn != null) {conn.close();}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}			
//		}				
//	}
//	
//	public void update(MenuDTO dto) {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		String sql = "update order_table set  Menu = ?, CNT = ? , OrderDT = ? where Seq =? and OrderNo = ? ";
//		
//		try {
//			conn = DriverManager.getConnection(url, userid, passwd);
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, dto.getMenu());
//			pstmt.setInt(2, dto.getCNT());
//			pstmt.setDate(3, dto.getOrderDT());
//			pstmt.setInt(4, dto.getSeq());
//			pstmt.setInt(5, dto.getOrderNo());
//			
//			int result = pstmt.executeUpdate();
//			
//			if(result == 1) {
//				System.out.println("수정 완료");
//			}else {
//				System.out.println("수정 실패");
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pstmt != null) {pstmt.close();}
//				if(conn != null) {conn.close();}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}		
//	}
//	
//	public void delete(MenuDTO dto) {
//		String sql = "delete from order_table where Seq = ?";
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		try {
//			conn = DriverManager.getConnection(url, userid, passwd);
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, dto.getSeq());
//			
//			int result = pstmt.executeUpdate();
//			
//			if(result == 1) {
//				System.out.println("데이터 삭제 성공");
//			}else {
//				System.out.println("데이터 삭제 실패");
//			}
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				if(pstmt != null) {pstmt.close();}
//				if(conn != null) {conn.close();}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//					
//	}
}
