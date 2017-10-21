package com.project.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.project.application.model.User;

@Mapper
public interface UserMapper {

	@Insert("insert into users(id,name) values(#{userId},#{name})")
	public int insertUser(User user);

	@Select ("select * from users where id=#{userId}")
	public User getUser(int userId);
}
