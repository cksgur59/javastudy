package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	private final String DRIVER ="oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(MemberDTO m) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO member VALUES (?,?,?,?)";
		
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, m.getId());
			ps.setString(2, m.getName());
			ps.setInt(3, m.getPoint());
			ps.setInt(4, m.getMoney());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (ps !=null) ps.close();
				if (con != null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public OderDTO selectp(String menu) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "SELECT * FROM oder WHERE menu = ?";
		ResultSet rs = null;
		int point = 0;
		int price = 0;
		OderDTO odt = null;
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, menu);
			
			rs= ps.executeQuery();
			
			if(rs.next()) {
				point = rs.getInt("point");
				price = rs.getInt("price");
				odt = new OderDTO(null, null, price, point);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (con != null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return odt;
	}
	
	public void update(String mem,OderDTO odt) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE member SET money = money-? , point = point + ? WHERE name= ?";
		boolean isok = false;
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, odt.getPrice());
			ps.setInt(2, odt.getPoint());
			ps.setString(3, mem);
			
			ps.executeUpdate();
			
			isok = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (isok) {
					con.commit();
				}else con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (ps != null) ps.close();
				if (con != null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
