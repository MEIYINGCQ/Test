package com.cq.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.cq.pojo.User;

public class test {

	@Test
	public void getAllUser() {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory build = builder.build(this.getClass().getClassLoader().getResourceAsStream("mybatis-config.xml"));
		SqlSession session = build.openSession();
		List<User> list = session.selectList("com.cq.pojo.UserMapper.getAllUser");
		for (User user : list) {
			System.out.println(user);
		}
	}

}
