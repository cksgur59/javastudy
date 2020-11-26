package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private final String DRIVER = "oracle.jdbc.OracleDriver";
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
	
	public void insert(MemberDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO member22 VALUES (?,?,?,?)";
		boolean isok = false;
		
		
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getMid());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getJob());
			ps.setDate(4, dto.getBirth());
			
			ps.executeUpdate();
			
			isok = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(isok) {
					con.commit();
				} else con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			closeAll(null, ps, con);
		}
	}
	
	public List<MemberDTO> select() {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "SELECT mid,name 捞抚,job 流诀,birth 积老 FROM member22";
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		ResultSet rs = null;
		boolean isok = false;
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("捞抚");
				String job = rs.getString("流诀");
				Date birth = rs.getDate("积老");
				
				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
			}
			
			
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
			closeAll(rs, ps, con);
		}
		return list;
	
	}
	
	public void update(MemberDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE member22 SET name = ? WHERE mid =?";
		boolean isok = false;
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getMid());
			
			ps.executeUpdate();

			isok = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				try {
					if (isok) {
						con.commit();
					}else con.rollback();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				closeAll(null, ps, con);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void delete(MemberDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "DELETE FROM member22 WHERE mid = ?";
		boolean isok = false;
		
		try {
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getMid());
			
			ps.executeUpdate();

			isok = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				try {
					if (isok) {
						con.commit();
					}else con.rollback();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				closeAll(null, ps, con);
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private void closeAll(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
