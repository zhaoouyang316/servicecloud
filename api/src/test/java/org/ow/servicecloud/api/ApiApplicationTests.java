package org.ow.servicecloud.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ow.servicecloud.dao.user.mapper.UserMapper;
import org.ow.servicecloud.dao.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {

	@Autowired
	public UserMapper userMapper;

	@Test
	public void contextLoads() {

		User user=new User();
		user.setPhone("123341");
		user.setSalt("123");
		user.setPassword("456");
		userMapper.insert(user);

	}

}
