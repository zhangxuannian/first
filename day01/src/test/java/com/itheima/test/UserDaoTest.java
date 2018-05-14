package com.itheima.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;

public class UserDaoTest {

	@Test
	public void testFindAll() throws Exception {
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = factory.openSession();
		IUserDao userDao = session.getMapper(IUserDao.class);
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
		in.close();
	}
	
	
}
