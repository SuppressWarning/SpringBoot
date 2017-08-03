package com.oufaxin.application.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.oufaxin.application.pojo.User;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	public List<User> queryAll();
}
