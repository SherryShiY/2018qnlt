package com.pb.dao;

import java.sql.SQLException;

import com.pb.domain.User;

public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public int add(User user) {
		String sql = "insert into WeiUser(lgName,lgPass,sex,nickName,headName,registerTime) values(?,?,?,?,?,NOW())";
		
		// TODO Auto-generated method stub
		return update(sql, new Object[]{user.getLgName(),user.getLgPass(),user.getSex(),user.getNickName(),user.getHeadName()});
	}

	@Override
	public User findByName(String name) {
		String sql="select * from WeiUser where lgName=?";
		query(sql, new Object[]{name});
		User user = null;
		try {
			if(rs.next()){
				user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getDate(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return user;
	}

}
