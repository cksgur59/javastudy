package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MemberDAO {

	private final String Driver_NAME ="oracle.jdbc.OracleDriver";
	private final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라디버 연동 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} 
	}
	

	public void insert(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member (name,mid,job,birth) VALUES(?,?,?,?)";
		
		try {
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",USER_NAME,PASSWORD);
			System.out.println("커넥션 성공");
			pstmt = conn.prepareStatement("INSERT INTO member (name,mid,job,birth) VALUES(?,?,?,?)");
			System.out.println("prepareStatement 생성 성공");
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMid());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("커넥션 실패");
			System.out.println("prepareStatement 생성 실패");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	public MemberDTO selectByMid(String name) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT mid 이름, job 직업 , birth 생일 FROM member WHERE name = ?";
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);	
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String mid = rs.getString("이름");
				String job = rs.getString("직업");
				Date birth = rs.getDate("생일");
				dto = new MemberDTO(name, mid, job, birth);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
		
		
	}
	
	
	
	public List<MemberDTO> select(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM member";
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				String mid = rs.getString("mid");
				String job = rs.getString("job");
				Date birth = rs.getDate("birth");
				
				MemberDTO dto = new MemberDTO(name, mid, job, birth);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	public void update(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE member SET mid = ?,job =? , birth = ? WHERE name = ?";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ezen","ezen");
			System.out.println("커넥션 성공");
			pstmt = conn.prepareStatement(sql);
			System.out.println("pstmt 성공");
			
			pstmt.setString(4, dto.getName());
			pstmt.setString(2, dto.getJob());
			pstmt.setDate(3, dto.getBirth());
			pstmt.setString(1, dto.getMid());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("커넥션 실패");
			System.out.println("pstmt 실패");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE name = ?";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",USER_NAME,PASSWORD);
			System.out.println("커넥션 성공");
			pstmt = conn.prepareStatement(sql);
			System.out.println("프리페어스테이트먼트 성공");
			
			pstmt.setString(1, dto.getName());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("커넥션 실패");
			System.out.println("프리 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
