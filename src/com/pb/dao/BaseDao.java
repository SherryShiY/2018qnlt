package com.pb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDao {
	public Connection conn;
	public ResultSet rs;
	public PreparedStatement ps;
	
	public void getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qnlt","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void close(){
		try {
			
				if(rs!=null){
					rs.close();
			}
				
			
			if(ps!=null){
				ps.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void query(String sql, Object...obj){
		getConnection();
		try {
			ps=conn.prepareStatement(sql);
			if(obj!=null){
				for(int i = 0; i < obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int update(String sql, Object[] obj){
		 int index=0;
		 getConnection();
		 try {
			ps=conn.prepareStatement(sql);
			 if(obj!=null){
				 for(int i = 0; i < obj.length; i++){
					 ps.setObject(i+1,obj[i]);
				 }
			 }
			 index=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		 return index;
	}
}
